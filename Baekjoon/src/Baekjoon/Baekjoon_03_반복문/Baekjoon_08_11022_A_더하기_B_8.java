package Baekjoon.Baekjoon_03_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_08_11022_A_더하기_B_8 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/11022
		// 8. 11022_A + B - 8
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			String[] str = br.readLine().split(" ");
			
			int A = Integer.parseInt(str[0]);
			int B = Integer.parseInt(str[1]);
			
			bw.write("Case #" + i +": " + A + " + " + B + " = " + (A + B) + "\n");
			if(i == T) {
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}