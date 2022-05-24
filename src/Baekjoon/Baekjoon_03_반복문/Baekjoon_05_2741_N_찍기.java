package Baekjoon.Baekjoon_03_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_05_2741_N_찍기 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/2741
		// 5. 2741_N 찍기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n;) {
			i++;
			bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}