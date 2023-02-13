package com.zoo.safari; //패키지가 다르면 public만 볼 수 있다 

import com.zoo.Zoo;

public class Safari extends Zoo {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.tigher();
//		z.giraffe(); //error
//		z.elephant(); 
//		z.lion();
		System.out.println();
		
		
		Safari s = new Safari();
		s.tigher();
		s.giraffe(); //sub 클래스로 생성을 해야한다 super로 하면 접근이 안됨 
//		s.elephant();
//		s.lion();
	

	}

}
