package Baekjoon.Baekjoon_04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_06_8958_OX퀴즈 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/8958
		// 6. 8958_OX퀴즈
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트 케이스 개수 입력
		int N = Integer.parseInt(br.readLine());
		
		// N개의 테스트 케이스 배열 생성
		String[] test = new String[N];
		
		for(int i = 0; i < N; i++) {
			test[i] = br.readLine();
			
			// 합계
			int sum = 0;
			// O갯수
			int cnt = 0;
			
			for(int j = 0; j < test[i].length(); j++) {
				if(test[i].charAt(j)=='O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}
}