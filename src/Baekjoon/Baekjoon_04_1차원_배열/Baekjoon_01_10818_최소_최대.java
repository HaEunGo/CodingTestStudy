package Baekjoon.Baekjoon_04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_01_10818_최소_최대 {
	
	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/10818
		// 1. 10818_최소, 최대
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 토큰 개수 선언
		int N = Integer.parseInt(br.readLine());
		
		// 문자열 분리
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		// 최소값, 최대값
		int min = 1000001;
		int max = -1000001;
		
		while(st.hasMoreTokens()) {
			
			int val = Integer.parseInt(st.nextToken());
			
			// n의 조건 보다 큰 값을 min, 작은 값을 max에 넣어준 뒤
			// StringTokenizer에 있는 문자열을 반복문으로 돌림
			if(val < min) min = val;
			if(val > max) max = val;
		}
			System.out.println(min + " " + max);
	}
}