package Baekjoon.Baekjoon_03_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_12_10952_A_더하기_B_5 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/10952
		// 12. 10952_A + B - 5
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i >= 0; i++) {
			String[] str = br.readLine().split(" ");
			
			int A = Integer.parseInt(str[0]);
			int B = Integer.parseInt(str[1]);
			
			if (A == 0 && B == 0) {
				break;
			}
			bw.write((A+B) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}