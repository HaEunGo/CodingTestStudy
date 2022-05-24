package Baekjoon.Baekjoon_02_조건문;

import java.util.Scanner;

public class Baekjoon_02_9498_시험_성적 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/9498
		// 2. 9498_시험 성적
		
		Scanner sc = new Scanner(System.in);
		
		int result = sc.nextInt();
		
		if(90 <= result && result <= 100) {
			System.out.println("A");
		} else if(80 <= result && result <= 89) {
			System.out.println("B");
		} else if(70 <= result && result <= 79) {
			System.out.println("C");
		} else if(60 <= result && result <= 69) {
			System.out.println("D");
		} else if(0 <= result && result <= 59) {
			System.out.println("F");
		} else {
			System.out.println("잘못 입력하셨습니다.");
			
			sc.close();
		}
	}
}