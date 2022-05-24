package Baekjoon.Baekjoon_02_조건문;

import java.util.Scanner;

public class Baekjoon_01_1330_두_수_비교하기 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1330
		// 1. 1330_두 수 비교하기
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
        int B = sc.nextInt();
        
		if(A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else if (A == B) {
			System.out.println("==");
		}
	}
}