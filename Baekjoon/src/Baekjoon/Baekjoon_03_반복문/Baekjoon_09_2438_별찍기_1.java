package Baekjoon.Baekjoon_03_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_09_2438_별찍기_1 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/2438
		// 9. 2438_별찍기 - 1
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			for(int k = N - 1; k >= 0;) {
				k--;
				bw.write(" ");
			}
			for(int j = 1; j <= i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}