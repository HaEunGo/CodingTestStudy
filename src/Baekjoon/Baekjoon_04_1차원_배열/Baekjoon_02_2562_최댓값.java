package Baekjoon.Baekjoon_04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_02_2562_최댓값 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/2562
		// 2. 2562_최댓값

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열 선언
		int[] arr = new int[9];
		
		// 최대값 초기값 세팅
		int max = 0;
		
		// 위치값 확인을 위한 Position 변수
		int maxPos = 0;
		
		// 토큰 입력
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 최대값 구하기
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				// 위치 출력
				maxPos = i + 1;
			}
		}
		// 최대값 출력
		System.out.println(max);
		System.out.println(maxPos);
	}
}