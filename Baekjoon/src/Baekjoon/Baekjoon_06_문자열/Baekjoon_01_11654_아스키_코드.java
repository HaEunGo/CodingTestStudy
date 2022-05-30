package Baekjoon.Baekjoon_06_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_01_11654_아스키_코드 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/11654
		// 1. 11654_아스키_코드
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println((int)str.charAt(0));
	}
}