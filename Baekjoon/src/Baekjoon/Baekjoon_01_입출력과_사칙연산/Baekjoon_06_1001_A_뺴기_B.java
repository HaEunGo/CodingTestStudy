package Baekjoon.Baekjoon_01_입출력과_사칙연산;

import java.util.Scanner;

public class Baekjoon_06_1001_A_뺴기_B {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1001
		// 6. 1001_A-B
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A > 0 && B < 10) {
			System.out.println(A-B);
		} else {
			System.out.println("첫 번째 수는 0 초과, 두 번째 수는 10 미만의 정수를 입력해 주세요.");
		}
	}
}