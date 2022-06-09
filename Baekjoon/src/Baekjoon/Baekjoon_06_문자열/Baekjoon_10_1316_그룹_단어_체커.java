package Baekjoon.Baekjoon_06_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10_1316_그룹_단어_체커 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/11720
		// 10. 1316_그룹_단어_체커
		
		// 연속되는 문자 개수
		int wordCount = Integer.parseInt(br.readLine());
		int gwCount = 0;
		
		for(int i = 0; i < wordCount; i++) {
			if(check() == true) {
				gwCount++;
			}
		}
	}
	
	public static boolean check() {
		return false;
		
	}
}