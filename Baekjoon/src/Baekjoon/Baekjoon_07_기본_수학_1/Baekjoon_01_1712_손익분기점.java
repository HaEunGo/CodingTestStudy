package Baekjoon.Baekjoon_07_기본_수학_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_01_1712_손익분기점 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/1712
		// 1. 1712_손익분기점
		
		// 고정 비용 - A
		// 가변 비용 - B
		// 노트북 가격 - C
		// 생산 대수 - N
		// A + B < C -> 판매량(i) count / A + B > C -> -1
		// https://st-lab.tistory.com/71 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int count = 0;
		
		if(C <= B) {
			System.out.println("-1");
		}
		else {
			System.out.println((A / (C - B)) + 1);
		}
	}
}