package for_;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		for in range(10) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int fac = scan.nextInt();
		for(int i=1; i>=fac; i++) {
		result *=i;
		}
			System.out.println();
	
		}

	}
}



// 5 = 5*4*3*2*1
/*
[문제] 팩토리얼 구하기 (for)
입력되는 숫자는 1~10 사이만 입력한다.

[실행결과]
숫자 입력 : 3
3! = 6(1*2*3)
-------------------
숫자 입력 : 5
5! = 120(1*2*3*4*5) 
 */