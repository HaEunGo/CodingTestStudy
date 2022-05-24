package Baekjoon.Baekjoon_04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Baekjoon_04_3052_나머지 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/3052
		// 4. 3052_나머지
		
		// https://st-lab.tistory.com/46
		// https://velog.io/@cksgh989/123 참고
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// HashSet
		HashSet<Integer> hs = new HashSet<Integer>();
		
		// 배열 선언
		int[] arr = new int[10];
		
		// 10개의 수가 담길 배열
		for(int i = 0; i < 10; i++) {
			hs.add(arr[i] = Integer.parseInt(br.readLine()) % 42);
		}
		System.out.println(hs.size());
	}
}