package Baekjoon.Baekjoon_04_1차원_배열;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon_03_2577_숫자의_개수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/2577
		// 3. 2577_숫자의 개수
		
		// Scanner 객체 선언
		Scanner sc = new Scanner(System.in);
		
		// A, B, C 값 입력
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		// sc 객체 사용 끝
		sc.close();
		
		// A * B * C의 합
		int sum = A * B * C;
		
		// 0 ~ 9를 담을 numbers 배열
		int[] numbers = new int[10];
		
		while(sum > 0) {
			// numbers[sum % 10]에 1 더하기
			numbers[sum % 10]++;
			
			// numbers 나누기 10의 값을 sum에 저장
			sum /= 10;
		}
		
		// numbers[i] 출력
		for(int i = 0; i <numbers.length; ++i) {
			System.out.println(numbers[i]);
		}
	}
}