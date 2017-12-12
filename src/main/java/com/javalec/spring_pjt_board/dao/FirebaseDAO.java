package com.javalec.spring_pjt_board.dao;

import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.javalec.spring_pjt_board.dto.BDto;

public class FirebaseDAO {
	DataSource dataSource;
	public FirebaseDAO() throws NamingException {
		Context context = new InitialContext();
	}
	public ArrayList<BDto> list() {
		ArrayList<BDto> dtos = null;
		
		return dtos;
	}
}
