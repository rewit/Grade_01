package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_07 {

	public static void main(String[] args) {

		/*
		 * ScoreVO를 이용해서 List 를 생성하고 5명 학생의 성적을 키보드로 입력받아 List에 추가하고 총점과 평균을 구하시오
		 * 
		 */

		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);

		// int scLen = scList.size();

		for (int i = 0; i < 5; i++) {
			// String strKeyInput = scan.nextLine();
			// String[] strKeys = strKeyInput.split(",");

			System.out.print((i + 1) + "번 학생 국어점수");
			String strKor = scan.nextLine();
			int intKor = Integer.valueOf(strKor);

			System.out.print((i + 1) + "번 학생 영어점수");
			String strEng = scan.nextLine();
			int intEng = Integer.valueOf(strEng);

			System.out.print((i + 1) + "번 학생 수학점수");
			String strMath = scan.nextLine();
			int intMath = Integer.valueOf(strMath);

			int intTotal = intKor + intEng + intMath;
			int intAvg = intTotal / 3;
			// 3번 방법
			scList.add(new ScoreVO("" + (i + 1), intKor, intEng, intMath, intTotal, intAvg));

		}
		for (ScoreVO vo : scList) {
			System.out.println(vo.toString());

		}
		//총점
		int scLen = scList.size();
		for(int i = 0; i < scLen; i++) {
			ScoreVO vo = scList.get(i);
			
			int intTotal = vo.getKor();
			intTotal +=vo.getEng();
			intTotal +=vo.getMath();
			
			vo.setTotal(intTotal);
			vo.setAverage(intTotal/3);
		}
		
		for(ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
	}

}
