package com.zoe.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

	@Autowired
	private BoardDAO borBoardDAO;
	//Controller -> Service -> DAO -> sqlSession -> DB 
	
}
