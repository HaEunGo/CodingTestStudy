package Baekjoon.Baekjoon_06_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_04_2675_문자열_반복 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/11720
		// 4. 2675_문자열 반복
		
		// https://st-lab.tistory.com/63 참고
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트 케이스 개수 입력
		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			
			// N개의 테스트 케이스 배열 생성
			String[] Tarr = br.readLine().split(" ");
			
			int R = Integer.parseInt(Tarr[0]);
			String S = Tarr[1];
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			// 왜 이게 없으면 틀렸다고 할까?
			System.out.println();
		}
	}
}