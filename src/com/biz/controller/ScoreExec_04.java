package com.biz.controller;

import java.util.ArrayList;
import java.util.List;

import com.biz.model.ScoreVO;

public class ScoreExec_04 {

	public static void main(String[] args) {

		
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		
		scList.add(new ScoreVO("1",90,60,70));
		scList.add(new ScoreVO("2",80,70,80));
		scList.add(new ScoreVO("3",70,80,70));
		scList.add(new ScoreVO("4",80,66,60));
		scList.add(new ScoreVO("5",49,80,70));
		scList.add(new ScoreVO("6",90,60,55));
		
		int scLen = scList.size();
		for(int i=0; i < scLen; i++) {
			
			ScoreVO vo = scList.get(i);
			
			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();
			
			vo.setTotal(intTotal);
			vo.setAverage(intTotal/3);
			
		}

		for(ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
		
	}

}
