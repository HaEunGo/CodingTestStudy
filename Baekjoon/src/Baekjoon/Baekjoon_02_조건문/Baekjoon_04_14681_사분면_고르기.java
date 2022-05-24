package Baekjoon.Baekjoon_02_조건문;

import java.util.Scanner;

public class Baekjoon_04_14681_사분면_고르기 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/14681
		// 4. 14681_사분면 고르기
		
		// 백준에서는 
//		System.out.println("x의 값을 입력하세요");
//		int x = sc.nextInt();
//		
//		System.out.println("y의 값을 입력하세요");
//		int y = sc.nextInt();
		// 위 부분 때문에 자꾸 틀렸다고 잡혔다.

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		if(0 < x && 0 < y) {
			System.out.println("1");
		} else if(0 > x && 0 < y) {
			System.out.println("2");
		} else if(0 > x && 0 > y) {
			System.out.println("3");
		} else if(0 < x && 0 > y) {
			System.out.println("4");
		}
		
		if(x != 0 && y != 0) {
			if(0 < x && x <= 1000 && 0 < y && y <= 1000) {
				System.out.println("1");
			} else if (0 > x && x >= -1000 && 0 < y && y <= 1000) {
				System.out.println("2");
			} else if (0 > x && x >= -1000 && 0 > y && y >= -1000) {
				System.out.println("3");
			} else if (0 < x && x <= 1000 && 0 > y && y >= -1000) {
				System.out.println("4");
			}
		} else {
			System.out.println("0이 아닌 -1000 ~ 1000 사이의 수를 입력하세요.");
		}
	}
}