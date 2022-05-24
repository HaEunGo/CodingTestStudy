package Baekjoon.Baekjoon_03_반복문;

import java.util.Scanner;

public class Baekjoon_02_10950_A_더하기_B_3 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/10950
		// 2. 10950_A + B - 3
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
			
			if (i == t) {
				break;
			}
		}
	}
}