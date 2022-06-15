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
		// https://engpro.tistory.com/147 참고
		int wordCount = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0; i < wordCount; i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int t = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			
			if(t != now) {
				
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					t = now;
				} else {
					return false;
				}
			} else {
				continue;
			}
		}
		return true;
	}
}