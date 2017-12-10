package com.javalec.spring_pjt_board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.spring_pjt_board.dao.FirebaseDAO;
import com.javalec.spring_pjt_board.dto.BDto;

public class BListCommand implements BCommand{

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		//데이터베이스에 있는 정보를 다 가져와서 뿌려(jsp에 dto객체를 뿌려줘서) 
		FirebaseDAO myDAO = new FirebaseDAO(); 
		myDAO.list();
		ArrayList<BDto> dtos = myDAO.list();

		model.addAttribute("list",dtos);
		//뷰에서 받을때 리스트로 받으면 됨.
	}

}
