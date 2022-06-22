package Baekjoon.Baekjoon_07_기본_수학_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_03_1193_분수찾기 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/1193
		// 3. 1193_분수찾기
		
		// https://thinmug.tistory.com/9 참고
		// https://st-lab.tistory.com/74
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int cnt = 0;
		int n = 0;
		while(true) {
			n++;
			cnt += n;
			
			if(cnt >= a) {
				if(n % 2 == 0) {
					System.out.println(a - cnt + n + "/" + (cnt - a + 1));
				} else {
					System.out.println((cnt - a + 1) + "/" + (a - cnt + n));
				}
				break;
			}
		}
	}
}