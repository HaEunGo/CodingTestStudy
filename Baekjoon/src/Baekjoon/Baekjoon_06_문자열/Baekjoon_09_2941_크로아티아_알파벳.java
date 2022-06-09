package Baekjoon.Baekjoon_06_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_09_2941_크로아티아_알파벳 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/11720
		// 9. 2941_크로아티아 알파벳
		
		// 알파벳 문자열 반환 -> 갯수 세기
		// https://hellodoor.tistory.com/86 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr = br.readLine();
		
		String str[] = {"c=", "c-", "dz=", "d-", "lj", "s=", "z="};
		
		for(int i = 0; i < str.length; i++) {
			if(arr.contains(str[i])) {
				arr = arr.replace(str[i], "!");
			}
		}
		System.out.println(arr.length());
	}
//		// 총합
//		int count = 0;
//		
//		// C 개수
//		int C = arr.length();
//		
//		for(int i = 0; i < C; i++) {
//			
//			switch (arr.charAt(i)) {
//			case 'c' : case 'd' : case 'z' : case 'l' : case 'j' : case 'n' : case 's' : 
//				count += 1;
//				
//				break;
//			}
//		}
}