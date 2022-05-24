package Baekjoon.Baekjoon_03_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_14_1110_더하기_사이클 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/1110
		// 14. 1110_더하기 사이클
		
		// https://codechasseur.tistory.com/84?category=855969
		// https://codingstudytrace.tistory.com/m/82 -> 이게 이해가 더 잘 됐음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
        //처음 숫자 시작
        int start = Integer.parseInt(st.nextToken());

        //처음 숫자의 앞자리
        int n1 = start/10;

        //처음 숫자의 뒷자리
        int n2 = start%10;

        int count = 0;
        //둘이 합한 sum
        int sum = n1+n2;
        int newNum =start;
        do {
            //주어진수의 뒷자리
            n1 = newNum % 10;
            // 합한 수의 뒷자리
            n2 = sum % 10;
            //새로운 수 만들고
            newNum = n1 * 10 + n2;
            //앞 뒤 더하기
            sum = n1 + n2;
            count++;

        } while(start != newNum);

        sb.append(count);
        System.out.println(sb);
        br.close();
	}
}