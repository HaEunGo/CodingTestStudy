package Baekjoon.Baekjoon_03_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_11_10871_X보다_작은_수 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/10871
		// 11. 10871_X보다 작은 수
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int X = Integer.parseInt(str[1]);
		
		String[] str2 = br.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			int A = Integer.parseInt(str2[i]);
			if (A < X) {
				bw.write(A + " ");				
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}