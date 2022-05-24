package Baekjoon.Baekjoon_01_입출력과_사칙연산;

import java.util.Scanner;

public class Baekjoon_12_10430_나머지 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/10430
		// 12. 10430_나머지
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	}
}