package Baekjoon.Baekjoon_05_함수;

public class Baekjoon_01_15596_점수_N개의_합 {
	// https://www.acmicpc.net/problem/15596
	// 1. 15596_점수 N개의 합
	long sum(int[] a) {
		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}