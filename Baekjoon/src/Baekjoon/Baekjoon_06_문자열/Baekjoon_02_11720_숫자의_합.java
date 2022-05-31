package Baekjoon.Baekjoon_06_문자열;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon_02_11720_숫자의_합 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/11720
		// 2. 11720_숫자의 합
		
		// https://st-lab.tistory.com/61 참고
		Scanner sc = new Scanner(System.in);
		
		// 개수 입력
		int N = sc.nextInt();
		
		// 합계
		int sum = 0;
		
		// 배열추가
		String num = sc.next();
		
		
		// charAt은 해당 문자의 아스키 코드 값을 반환하므로 -48 or -'0'을 해주어야 함
		for(int i = 0; i < N; i++) {
			sum += num.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}