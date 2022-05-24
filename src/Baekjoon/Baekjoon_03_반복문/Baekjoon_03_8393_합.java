package Baekjoon.Baekjoon_03_반복문;

import java.util.Scanner;

public class Baekjoon_03_8393_합 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/8393
		// 3. 8393_합
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
			System.out.println(sum);
	}
}