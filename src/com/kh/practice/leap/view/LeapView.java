package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.Date;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	private LeapController ctrl = new LeapController();
	public LeapView() {
//		2019년은 평년입니다
//		총 날짜 수 : 737164
		Calendar cal = Calendar.getInstance();	// Singleton pattern 싱글톤패턴
		System.out.println(cal.getTime()); 	// 오늘날짜
		
	}

}
