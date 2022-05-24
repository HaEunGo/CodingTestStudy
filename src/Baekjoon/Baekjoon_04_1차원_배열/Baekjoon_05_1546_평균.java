package Baekjoon.Baekjoon_04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_05_1546_평균 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/1546
		// 5. 1546_평균
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 과목 개수 선언
		int N = Integer.parseInt(br.readLine());
		
		// 문자열 분리
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		// 입력받을 값
		int max = -1;
		
		// 합계
		double sum = 0.0;
		
		for (int i = 0; i < N; i++) {
			// 값 입력
			int value = Integer.parseInt(st.nextToken());
			
			// value를 max값과 비교하고, sum에 value 더해주기
			if(value > max) {
				max = value;
			}
			sum += value;
		}
		// 평균 구할 시 한 번에 연산
		System.out.println(((sum / max) * 100.0) / N);
	}
}