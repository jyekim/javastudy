package inheritance;


enum Color { //enum은 상수들의 집합체 color들을 묶어서 나열한 것 
	RED, GREEN, BLUE;
}

//-----------------------------

class Final {
	public final String FRUIT = "사과";
	public final String FRUIT2;
	
	public static final String ANIMAL = "기린";   //static시음식 실행하자마자 메모리 자동으로 생성 
	public static final String ANIMAL2; 		//static은 생성자에서 초기화 안된다 
	
//	public static final int RED = 0;           // 색상은 255   // enum으로 묶어주면 이거 안 써도 됨
//	public static final int GREEN = 1;
//	public static final int BLUE = 2;

	
	static {
		System.out.println("static 초기화 영역");
		ANIMAL2 = "코끼리";
	}
	
	public Final() {
		System.out.println("기본 생성자");
		 FRUIT2 = "딸기";   //기존 값을 초기화하고 다른 초기값을 주는 방법 ctrl+spc 하고 생성자 만들어주면 됨
	}
}

//---------------------------
public class FinalMain {

	public static void main(String[] args) {
		final int A = 10; // 상수화 걸어버림 
		 //A = 20; error나는 이유: final은 값을 변경할 수 없다 
		System.out.println("A = " + A);
		
		final int B; 
		B = 30;  //초기값이 없기 때문에 가능한거
		//B = 40; 
		System.out.println("B = "+ B);
		
		Final f = new Final();
	
		System.out.println("FRUIT = " + f.FRUIT );
		System.out.println("FRUIT = " + f.FRUIT2 );
		
		System.out.println("ANIMAL = " + Final.ANIMAL);
		System.out.println("ANIMAL2 = " + Final.ANIMAL2);
		System.out.println();
		
		
		System.out.println("빨강 =  " +Color.RED);
		System.out.println("빨강 =  " +Color.RED.ordinal());
		
		for(Color data : Color.values()) {
			System.out.println(data + "\t" + data.ordinal());
		}
	
	}

}
