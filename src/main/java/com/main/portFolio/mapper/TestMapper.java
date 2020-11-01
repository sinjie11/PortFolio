package com.main.portFolio.mapper;

import java.util.List;

import com.main.portFolio.vo.TestVO;

/**
 * Project Name  : 포트폴리오
 * Class Name  : TestMapper.java
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
public interface TestMapper {

	public List<TestVO> selectUserList(TestVO testVO) throws Exception;
	
}