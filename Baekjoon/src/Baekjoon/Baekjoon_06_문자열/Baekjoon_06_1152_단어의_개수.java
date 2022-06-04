package Baekjoon.Baekjoon_06_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_06_1152_단어의_개수 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/11720
		// 6. 1152_단어의 개수
		
		// https://st-lab.tistory.com/65 참고
		// https://cokes.tistory.com/87
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열 분리
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		System.out.println(st.countTokens());
	}
}