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

	//4.3�������� �Ѱ����� ���� �޴� �����ڰ� �ִٸ� �ڵ������� ����ȴ�.
	private Chef chef;

	
	public void order() {
		log.info(chef.cook());
	}

}
