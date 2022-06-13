package com.javaex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.dao.GuestDao;
import com.javaex.vo.GuestVo;


@Controller
public class GuestController {

	@RequestMapping(value = "/list", method = { RequestMethod.GET, RequestMethod.POST })
	public String list(Model model, @ModelAttribute GuestVo gVo) {
		System.out.println("GuestController>list()");
		GuestDao gDao = new GuestDao();
		List<GuestVo> gList = gDao.SelectAll();
		
		model.addAttribute("gList", gList);
		return "/addList";
	}

	@RequestMapping(value = "/writeform", method = { RequestMethod.GET, RequestMethod.POST })
	public String writeForm() {
		System.out.println("GuestController>writeForm()");
		return "/writeForm";
	}

	@RequestMapping(value = "/write", method = { RequestMethod.GET, RequestMethod.POST })
	public String write(@ModelAttribute GuestVo gVo) {
		GuestDao gDao = new GuestDao();
		gDao.Insert(gVo);

		// 리다이렉트

		return "redirect:/list";
	}

//	@RequestMapping(value = "/modify", method = { RequestMethod.GET, RequestMethod.POST })
//	public String modify(Model model, @RequestParam("GuestId") int GuestId) {
//		System.out.println("GuestController>modify()");
//		GuestDao gDao = new GuestDao();
//		GuestVo gVo = gDao.Select(GuestId);
//		model.addAttribute("gVo", gVo);
//		return "/modifyForm";
//	}
//
//	@RequestMapping(value = "/update", method = { RequestMethod.GET, RequestMethod.POST })
//	public String update(@ModelAttribute GuestVo gVo) {
//		System.out.println("GuestController>update()");
//		GuestDao gDao = new GuestDao();
//		gDao.Update(gVo);
//		return "redirect:/list";
//	}
	
	@RequestMapping(value = "/deleteform/{guestNo}", method = { RequestMethod.GET, RequestMethod.POST })
	public String deleteForm(Model model, @PathVariable("guestNo") int guestNo) {
		System.out.println("GuestController>deleteForm()");
		model.addAttribute("guestNo", guestNo);
		return "/deleteForm";
	}


	@RequestMapping(value = "/delete/{guestNo}", method = { RequestMethod.GET, RequestMethod.POST })
	public String delete(@PathVariable("guestNo") int guestNo, @RequestParam("password") String password) {
		System.out.println("GuestController>delete()");
		GuestDao gDao = new GuestDao();
		if( gDao.Select(guestNo).getPassword().equals(password) ) {
			gDao.Delete(guestNo);
		} else {
			return "redirect:/deleteform/"+guestNo;
		}
		
		return "redirect:/list";
	}


	@RequestMapping(value = "/test", method = { RequestMethod.GET, RequestMethod.POST })
	public String test() {
		System.out.println("GuestController>test()");
		return "/test";
	}

}
