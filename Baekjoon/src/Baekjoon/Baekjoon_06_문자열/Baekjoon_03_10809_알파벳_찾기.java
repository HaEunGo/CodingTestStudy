package Baekjoon.Baekjoon_06_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_03_10809_알파벳_찾기 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/11720
		// 3. 10809_알파벳 찾기
		
		// https://jojelly.tistory.com/93 참고
		// https://st-lab.tistory.com/62
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		// 알파벳 개수만큼의 배열 선언
		int[] arr = new int[26];
		
		// 배열 전체의 값을 for문을 통해 -1로 설정
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		// for문을 통해 0부터 단어의 길이만큼 반복하면서
		// 첫 번째로 나오는 자리수만 저장하기 위해 -1이 아닌 경우에만 저장
		for(int i = 0; i < word.length(); i++) {
			int num = word.charAt(i) - 'a';
			if(arr[num] == -1) {
				arr[num] = i;
			}
		}
		
		// arr를 공백과 함께 하나씩 나타내주기
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}