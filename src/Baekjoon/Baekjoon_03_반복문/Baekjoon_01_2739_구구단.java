package Baekjoon.Baekjoon_03_반복문;

import java.util.Scanner;

public class Baekjoon_01_2739_구구단 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2739
		// 1. 2739_구구단
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		for(int j=1; j <= 9; j++) {
			
			System.out.println(i + " * " + j + " = " + (i * j));
		}
	}
}