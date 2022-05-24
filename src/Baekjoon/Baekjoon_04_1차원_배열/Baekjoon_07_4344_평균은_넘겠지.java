package Baekjoon.Baekjoon_04_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_07_4344_평균은_넘겠지 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/4344
		// 7. 4344_평균은 넘겠지
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		// 테스트 케이스 개수 입력
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			
			// 학생 수 & 성적 입력
			st = new StringTokenizer(br.readLine()," ");
			
			// 학생 수
			int Stu = Integer.parseInt(st.nextToken());
			arr = new int[Stu];
			
			// 성적 누적 합계 변수
			double sum = 0;
			
			// 성적 입력
			for(int j = 0; j < Stu; j++) {
				
				// 성적 저장
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				
				// 성적 누적 합계
				sum += val;
			}
			
			double mean = (sum / Stu);
			
			// 평균 넘는 학생 수 변수 선언
			double count = 0;
			
			// 평균 넘는 학생 비율 찾기
			for(int j = 0; j < Stu; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count / Stu) * 100);
		}
	}
}