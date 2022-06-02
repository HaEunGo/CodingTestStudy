package Baekjoon.Baekjoon_06_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_05_1157_단어_공부 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/11720
		// 5. 1157_단어 공부
		
		//https://yongku.tistory.com/1608 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 알파벳 대소문자 입력
		// -> 가장 많이 쓰인 단어 골라내기
		// -> 그걸 대문자로 출력
		// 가장 많이 쓰인 단어가 여러개야? -> '?'출력
		
		// 알파벳 개수만큼의 배열 선언
		int[] arr = new int[26];
		
		//대문자로 출력 해주기 위해 대문자로 입력받기
		String x = br.readLine().toUpperCase();
		
		// 최대값
		int max = -1;
		
		// ? 출력해주기 위해 문자 선언
		char st = '?';
		
		for(int i = 0; i < x.length(); i++) {
			// 해당 인덱스의 값 1 증가
			arr[x.charAt(i) - 65]++;
			
			if(max < arr[x.charAt(i) - 65]) {

				max = arr[x.charAt(i) - 65];
				st = x.charAt(i);
				
				
				// 빈도수가 같은 배열 값이 있으면 st는 다시 '?'로 정의하여 출력
			} else if(max == arr[x.charAt(i) - 65]) st = '?';
		}
		System.out.println(st);
	}
}