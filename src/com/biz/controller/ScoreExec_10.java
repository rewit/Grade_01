package com.biz.controller;

import com.biz.service.ScoreService;
import com.biz.service.ScoreService_02;

public class ScoreExec_10 {

	public static void main(String[] args) {

		ScoreService ss = new ScoreService_02();
		
		for(int i = 0; i < 100; i++) {
			if(!ss.inputScore(i));
		}
		
		ss.makeTotal();
		ss.makeRank();
		ss.viewScore();   
		
	}

}
