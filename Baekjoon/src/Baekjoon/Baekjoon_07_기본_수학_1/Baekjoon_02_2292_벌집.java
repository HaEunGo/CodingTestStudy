package Baekjoon.Baekjoon_07_기본_수학_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_02_2292_벌집 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/2292
		// 2. 2292_벌집
		
		// https://hongku.tistory.com/245 참고

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(num(n));
	}
	
	private static int num(int n) {
		// 1:1 (1)
		// 2 ~ 7 : 2 (6개)
		// 8 ~ 19 : 3 (12개)
		// 20 ~ 37 : 4 (18개)
		// 38 ~ 61 : 5 (24개)
		// ...
		// a(n) = a(n-1) + 6(n-1) | a(n) : 첫 항
		
		if(n == 1) return 1;
		int i = 2;
		int k = 1;
		
		while(i <= n) {
			i += 6 * k++;
		}
		
		return k;
	}
}