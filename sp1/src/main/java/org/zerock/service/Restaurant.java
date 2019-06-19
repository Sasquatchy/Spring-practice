package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@ToString
@Log4j
@Service
public class Restaurant {

	//4.3버전부턴 한가지만 주입 받는 생성자가 있다면 자동적으로 연결된다.
	private Chef chef;

	
	public void order() {
		log.info(chef.cook());
	}

}
