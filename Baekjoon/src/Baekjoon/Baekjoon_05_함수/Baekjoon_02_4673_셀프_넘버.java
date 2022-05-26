package Baekjoon.Baekjoon_05_함수;

public class Baekjoon_02_4673_셀프_넘버 {

	public static void main(String[] args){
		// https://www.acmicpc.net/problem/4673
		// 2. 4673_셀프 넘버
		
		// https://st-lab.tistory.com/53 참고
		// https://jojelly.tistory.com/90 
		
		// 1 ~ 10000 까지의 수
		int index = 10000;
		
		// 셀프 넘버를 구분할 배열 선언
		boolean[] nums = new boolean[index];
		
		for(int i = 0; i < nums.length; i++) {
			int n = d(i);
			
			// 10000보다 작은 수라면?
			if (n < nums.length) {
				nums[n] = true;
			}
		}
		
		// 1 ~ 10000까지 돌려서 false만 출력
		for(int i = 0; i < nums.length; i++) {
			// == : 관계비교 연산자
			if (nums[i] == false) {
				System.out.println(i);
			}
		}
	}
	
	// 함수
	public static int d(int number) {
		int sum = number;
		
		while(number != 0) {
			sum = sum + (number % 10); // 첫 째 자리 수
			number = number/10;		// 10을 나누어 첫 째 자리를 없앰
		}
		
		// int n
		return sum;
	}
}