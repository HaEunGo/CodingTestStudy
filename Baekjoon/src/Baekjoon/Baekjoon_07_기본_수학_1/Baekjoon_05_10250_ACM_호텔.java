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

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int H = Integer.parseInt(st.nextToken()); // 호텔의 층 수
			int W = Integer.parseInt(st.nextToken()); // 층의 방 갯수
			int N = Integer.parseInt(st.nextToken()); // N번째 손님
			
			int x = N / H + 1; // 호수 = 몫 + 1
			int y = N % H; 	   // 층 = 나머지
			
			if(N % H == 0) { // 나머지가 0일 경우
				x = N / H;
				y = H;
			}
			System.out.println(y * 100 + x);
		}
	}
}