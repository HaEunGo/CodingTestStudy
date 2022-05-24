package Baekjoon.Baekjoon_03_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_13_10951_A_더하기_B_4 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/10951
		// 13. 10951_A + B - 4
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String input = "";
		
		// input.length() != 0 -> 에러 잡기 쉽지 않았다.
		while((input = br.readLine()) != null && input.length() !=0) {
			st = new StringTokenizer(input);
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			bw.write((A+B) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}