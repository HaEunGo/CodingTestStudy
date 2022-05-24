package Baekjoon.Baekjoon_02_조건문;

import java.util.Scanner;

public class Baekjoon_03_2753_윤년 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2753
		// 3. 2753_윤년
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}