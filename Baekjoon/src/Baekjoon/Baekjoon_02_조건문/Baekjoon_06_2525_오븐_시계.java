package Baekjoon.Baekjoon_02_조건문;

import java.util.Scanner;

public class Baekjoon_06_2525_오븐_시계 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2525
		// 6. 2525_오븐 시계

		// 오답
//		Scanner sc = new Scanner(System.in);
//		int hh, mm, c, d;
//		
//		hh = sc.nextInt();
//		mm = sc.nextInt();
//		c = sc.nextInt();
//		d = mm + c;
//		
//		sc.close();
//		
//		if(d > 60 || d == 60) {
//			hh++;
//			mm = d / 60;
//			
//			if(hh < 0) {
//				hh = 23;
//			System.out.println(hh + " " + mm);
//			
//			}
//		} else {
//			System.out.println(hh + " " + mm);
//		}
		
		Scanner sc = new Scanner(System.in);
		int hh, mm, c;
		
		hh = sc.nextInt();
		mm = sc.nextInt();
		c = sc.nextInt();
		
		sc.close();
		
		mm += c;
		if (mm >= 60) {
			while(mm >= 60) {
				 mm-=60;
                 hh++;
                 if(hh>=24) {
                     hh=0;
                 }
             }
         }
		System.out.println(hh + " " + mm);
		// https://blue-boy.tistory.com/117
		// += : mm = mm + c;
		
		
//		Scanner sc = new Scanner(System.in);
//		int hh, mm;
//		
//		hh = sc.nextInt();
//		mm = sc.nextInt() + sc.nextInt(); 
//		
//		while (mm > 59) {
//			hh++; 
//			mm -= 60;
//			} 
//		while (hh > 23) 
//			hh -= 24;
//		System.out.println(hh + " " + mm);
		// https://dalconbox.tistory.com/261
	}
}