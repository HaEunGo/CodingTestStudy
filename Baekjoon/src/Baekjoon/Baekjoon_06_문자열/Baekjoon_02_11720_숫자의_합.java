package Baekjoon.Baekjoon_06_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_02_11720_숫자의_합 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/11720
		// 2. 11720_숫자의 합
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 숫자 개수 입력
		int N = Integer.parseInt(br.readLine());
		
		String[] num = new String[N];
		
		// 합계
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			sum += i;
			num[0] += sum;
		}
		System.out.println(sum);
	}
}