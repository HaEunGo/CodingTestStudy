package Baekjoon.Baekjoon_02_조건문;

import java.util.Scanner;

public class Baekjoon_07_2480_주사위_세개 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2480
		// 7. 2480_주사위 세개
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a == b && b == c && c == a) { // 다 같은 경우
			System.out.println(10000 + a * 1000);
		} else if(a != b && b != c && c != a) {	// 다 다른 경우에서
			if (a > b && a > c) {		// a가 가장 큰 경우
				System.out.println(a * 100);
			} else if(b > c && b > a) {	// b가 가장 큰 경우
				System.out.println(b * 100);
			} else if(c > a && c > b) {	// c가 가장 큰 경우
				System.out.println(c * 100);
			}
		} else {
			if (a == b && b != c && a != c) {	// a와 b는 같지만 c는 같지 않을 때
				System.out.println(1000 + a * 100);
			} else if(a == c && b != c && a != b) {	// a와 c가 같고 b는 같지 않을 때
				System.out.println(1000 + c * 100);
			} else if(b == c && a != b && a != c) {	// b와 c가 같고 a는 같지 않을 때
				System.out.println(1000 + b * 100);
			}
		}
	}
}