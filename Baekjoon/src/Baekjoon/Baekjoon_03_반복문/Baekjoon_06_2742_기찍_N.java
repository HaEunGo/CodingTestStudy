package Baekjoon.Baekjoon_03_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_06_2742_기찍_N {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/2742
		// 6. 2742_기찍 N
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = n; i > 0; i--) {
				bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}