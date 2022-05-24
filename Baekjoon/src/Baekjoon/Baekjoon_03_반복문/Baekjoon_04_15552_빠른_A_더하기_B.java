package Baekjoon.Baekjoon_03_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_04_15552_빠른_A_더하기_B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/15552
		// 4. 15552_빠른 A + B
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// 입력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	// 선언
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String str = br.readLine();
			String[] str1= str.split(" ");
			
			int a = Integer.parseInt(str1[0]);
			int b = Integer.parseInt(str1[1]);

			bw.write(a+b+"\n");
		}
			bw.flush();
			bw.close();
			br.close();
	}
}