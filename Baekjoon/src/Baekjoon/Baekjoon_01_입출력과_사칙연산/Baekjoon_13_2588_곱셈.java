package Baekjoon.Baekjoon_01_입출력과_사칙연산;

import java.util.Scanner;

public class Baekjoon_13_2588_곱셈 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2588
		// 13. 2588_곱셈
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A * (B%10));
		System.out.println(A * (B%100/10));
		System.out.println(A * (B/100));
		System.out.println(A * B);
	}
}