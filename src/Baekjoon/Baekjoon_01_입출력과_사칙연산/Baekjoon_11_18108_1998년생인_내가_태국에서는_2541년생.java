package Baekjoon.Baekjoon_01_입출력과_사칙연산;

import java.util.Scanner;

public class Baekjoon_11_18108_1998년생인_내가_태국에서는_2541년생 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/18108
		// 11. 18108_1998년생인 내가 태국에서는 2541년생?!
		
		Scanner sc = new Scanner(System.in);
		
		// 태국 불기 : 해당 년도 + 543
		int y = 543;
		int year = sc.nextInt();
		
		System.out.println(year - y);
	}
}