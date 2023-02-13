package com.apple;

import com.zoo.Zoo;
public class Apple {
	
	public static void main(String[] args) {
		System.out.println("빨간 사과");
		
		
		Zoo z = new Zoo();
		z.tigher();
//		z.giraffe(): 기린은 protected 되어 있어서 불러올 수 없음 
//		z.elephant(); 동물들 에러나는 이유는 다 public 안되어 있어서 그럼 
//		z.lion();
	
		
	}

}
