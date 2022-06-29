package Baekjoon.Baekjoon_07_기본_수학_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_06_2775_부녀회장이_될테야 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/2775
		// 6. 2775_부녀회장이 될테야
		
		// 첫 번째 줄 -> 테스트 케이스
		// 각각의 케이스마다 입력으로 첫 번째 줄 : k, 두 번째 줄에 n
		// a층 - b호에 살려면 a-1층의 1호부터 b까지 사람들의 수의 합 만큼 일치시켜야 함
		// 0층부터 존재. 1호부터 시작
		// 0층의 i호에는 i명이 살고 있음
		// 1 <= k, n <= 14
		// 피보나치 수열문제와 유사함. -> 재귀함수
		// if) 2층 2호를 구한다면, 그 값은 2층 1호의 값과 1층 2호의 값을 더한 것
		
		// https://st-lab.tistory.com/78 참고
		// https://developer-mac.tistory.com/50 참고
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트 케이스
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());	// k층
			int n = Integer.parseInt(br.readLine());	// n층
			
			System.out.println(apt(k, n));
		}
		br.close();
	}

	private static int apt(int k, int n) {
		// 아파트
		
		if(n == 0)
			return 0;
		else if(k == 0)
			return n;
		else {
			return apt(k, n - 1) + apt(k - 1, n);
		}
	}
}