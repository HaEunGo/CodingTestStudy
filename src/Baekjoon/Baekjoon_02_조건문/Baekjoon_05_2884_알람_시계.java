package Baekjoon.Baekjoon_02_조건문;

import java.util.Scanner;

public class Baekjoon_05_2884_알람_시계 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2884
		// 5. 2884_알람 시계 (어렵...ㅠ)
		
		Scanner sc = new Scanner(System.in);
		
		int hh = sc.nextInt();
		int mm = sc.nextInt();
		
		if(0 <= hh && hh <= 23 && 0 <= mm && mm <= 59) {	// hh,mm 범위 지정
			if((mm - 45) < 0) {	// 입력한 mm값 - 45분이 음수일 경우
				hh --;			// hh 감소
				mm = 60 - (45 - mm);
				
				System.out.println(hh + " " + mm);
				
			} else if(mm > 60) {	// mm이 60을 넘을 경우
				hh ++;
				mm = 60 - mm;	// 60에서 mm을 빼준다.
				
				System.out.println(hh + " " + mm);
				
			}
		} else {
			if (hh < 0) {	// hh의 값이 음수일경우
				hh = hh + 24;
			}
			System.out.println(hh + " " + (mm - 45));
		}
		
		if(mm < 45) { // mm : 45분 이전
			hh--;
			mm = 60 - (45 - mm);
			
			if(hh < 0) { // hh : 0시라면 45분 전 시간은 23시
				hh = 23;
			}
			System.out.println(hh + " " + mm);
		} else {
			System.out.println(hh + " " + (mm - 45));
		}
	}
}