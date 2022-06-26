package Baekjoon.Baekjoon_07_기본_수학_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_05_10250_ACM_호텔 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/10250
		// 5. 10250_ACM 호텔
		
		// 테스트 케이스 T
		// 층 수 H / W개의 방 / 몇 번째 손님 N
		// 방 번호는 YXX, YYXX 형태 / Y, YY = 층 수 / XX = 엘레베이터에서 부터 세었을 때
		// 그럼 X먼저 H를 채운다. (101 ~ Y01 / YY01)
		
		// https://j-remind.tistory.com/78 참고
		// https://st-lab.tistory.com/77
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int T = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < T; i++) {
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = (N / H) + 1;
			int y = N % H;
			if(N % H == 0) {
				x = N / H;
				y = H;
			}
			System.out.println(y * 100 + x);
		}
	}
}