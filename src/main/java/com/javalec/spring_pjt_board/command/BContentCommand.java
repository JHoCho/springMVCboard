package com.javalec.spring_pjt_board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.spring_pjt_board.dao.FirebaseDAO;
import com.javalec.spring_pjt_board.dto.BDto;

public class BContentCommand implements BCommand {
	//게시판 리스트에서 글을 클릭했을때 내용을 bId를 이용해서 뽑아오는 것.
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");
		//FirebaseDAO dao = new FirebaseDAO();
		//BDto dto = dao.contentView(bId);
	}
	
}
