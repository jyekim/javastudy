package for_;

import java.util.Scanner;

public class Game01 {

	public static void main(String[] args) {
		//3게임 if랑 for문 들어감
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(1),바위(2),보(3) 입력 : ");
		int user = scan.nextInt();
	
		if (user==1) {
			System.out.println("나 : 가위");
		}
		if (user==2) {
			System.out.println("나 : 바위");
		}
		if (user==3) {
			System.out.println("나 : 보자기");
		}
		
		//컴퓨터
		int com=(int)(Math.random()*3); //0.0~0.99니깐 *4을 하면 0.0~3.9가 나옴
		if(com==1) {
			System.out.println("컴퓨터 : 가위");
		}
		if(com==2) {
			System.out.println("컴퓨터 : 바위");
		}
		if(com==3) {
			System.out.println("컴퓨터 : 보자기");
		}
		//////////////////////////////////////////
	    if(com==1) {
	    	if(user==1) {
	    		System.out.println("You Draw!!");
	    	}
	    	if(user==2) {
	    		System.out.println("You Win!!");
	    	}
	    	if(user==3) {
	    		System.out.println("You lose!!");
	    	}
	    }
	    if(com==2) {
	    	if(user==1) {
	    		System.out.println("You Win!!");
	    	}
	    	if(user==2) {
	    		System.out.println("You Draw!!");
	    	}
	    	if(user==3) {
	    		System.out.println("You lose!!");
	    	}
	    if(com==3) {
	    	if(user==1) {
	    		System.out.println("You lose!!");
	    	}
	    	if(user==2) {
	    		System.out.println("You Win!!");
	    	}
	    	if(user==3) {
	    		System.out.println("You Draw!!");
	    	}
	    }
	    }
		
	}

}}



/*//3게임 if랑 for문 들어감 
[문제] 가위 바위 보 게임
-가위(1) 바위(2) 보(3) 지정함
-1게임당 300원으로 함 

[실행결과]
insert coin :1000
가위(1) 바위(2) 보(3) 중 번호 입력 : 3 (user, 사용자)

결과를 보려면 Enter를 치세요 -이거는 선택사항 해도됨
컴퓨터 : 바위 , 나 :보자기
You win!!

가위(1) 바위(2) 보(3) 중 번호 입력 : 1 (user)
컴퓨터 : 가위 , 나 :가위
You Draw!!

가위(1) 바위(2) 보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 가위 , 나 :보자기
You Lose!!


*/