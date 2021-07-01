package com.springlec.base.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.springlec.base.dao.Dao;

public class DeleteCommand implements Command {

private Dao dao = null;
	
	@Autowired
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bId =request.getParameter("bId");
		
		dao.delete(bId);

	}

}
