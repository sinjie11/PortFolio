package com.main.portFolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.portFolio.mapper.TestMapper;
import com.main.portFolio.vo.TestVO;

/**
 * Project Name  : 포트폴리오
 * Class Name  : TestService.java
 * Description : 
 * Modification Information  
 * 
 *    수정일　　　 　　                     수정자　　　               수정내용
 *    ---------------   -----------  ---------------------------
 *    2020. 11. 1      JungPal       최초생성
 * 
 * @author JungPal
 * @since 2020. 11. 1
 * @version 1.0
 * 
 * Copyright (C) 2020 All right reserved.
 */
@Service
public class TestService {

	@Autowired
	TestMapper testMapper;
	
	public List<TestVO> selectUserList(TestVO testVO) throws Exception {
	
		return testMapper.selectUserList(testVO);
	}

	
}