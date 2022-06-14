package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GuestDao;
import com.javaex.vo.GuestVo;

@Service
public class GuestService {
	@Autowired
	private GuestDao gDao;

	public List<GuestVo> getGuestList() {
		return gDao.SelectAll();
	}

	public GuestVo getGuest(int guestNo) {
		return gDao.Select(guestNo);
	}

	public String newGuest(GuestVo gVo) {
		return gDao.Insert(gVo);
	}

	public String deleteGuest(int guestNo) {
		return gDao.Delete(guestNo);
	}
}
