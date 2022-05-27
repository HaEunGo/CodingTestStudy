package Baekjoon.Baekjoon_05_함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_03_1065_한수 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// https://www.acmicpc.net/problem/15596
		// 3. 1065_한수
		
		// https://jaejong.tistory.com/11 참고
		// https://st-lab.tistory.com/54
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		System.out.println(hansu(N));
	}
	
	public static int hansu(int N) {
		int x = 0;
		
		for(int i = 1; i <= N; i++) {
			if(i < 100) 
				x++;
			else {
				int a = i / 100;		// 100의 자리 수
				int b = (i % 100) / 10; // 10의 자리 수
				int c = i % 10; // 1의 자리 수
				
				if((a - b) == (b - c))
					x++;
			}
		}
		return x;
	}
}