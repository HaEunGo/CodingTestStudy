package Baekjoon.Baekjoon_01_입출력과_사칙연산;

import java.util.Scanner;

public class Baekjoon_08_1008_A_나누기_B {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1008
		// 8. 1008_A/B
		
		/*
		 * 형변환
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println((double)a/(double)b);
	}
}