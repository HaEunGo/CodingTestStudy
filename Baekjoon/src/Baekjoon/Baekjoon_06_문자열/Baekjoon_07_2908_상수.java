package Baekjoon.Baekjoon_06_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_07_2908_상수 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/2908
		// 7. 2908_상수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 상수 입력
		// -> 거꾸로 입력(StringBuffer) -> 다시 int로
		// -> 거꾸로 입력한 값으로 대소 비교
		// https://applepick.tistory.com/80
		
		String[] arr = br.readLine().split(" ");
		
		StringBuffer num1 = new StringBuffer(arr[0]).reverse();
		StringBuffer num2 = new StringBuffer(arr[1]).reverse();
		
		int intNum1 = Integer.parseInt(num1.toString());
		int intNum2 = Integer.parseInt(num2.toString());

		if(intNum1 > intNum2) {
			System.out.println(intNum1);
		} else {
			System.out.println(intNum2);
		}
	}
}