package Baekjoon.Baekjoon_07_기본_수학_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_04_2869_달팽이는_올라가고_싶다 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/2869
		// 4. 2869_달팽이는 올라가고 싶다
		
		// 하루만 더 생각해보자...
		// 높이 V
		// 달팽이의 이동 거리 + A
		// 밤에 잠을 자는동안 미끄러지는 거리 - B
		// 정상은 V 겠지? 그러면 sum == V가 될 때 까지 i++해줘야 한다.(220322)
		
		// https://st-lab.tistory.com/75 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int sum = (V - B) / (A - B);
		if((V - B) % (A - B) != 0)
			sum++;
		
		System.out.println(sum);
	}
}