package inheritance;

class Test extends Object { //자바의 모든 클래스는 object가 들어감
	
}
//-----------
class Sample {
	@Override
	public String toString() {
	return getClass() + "@개바부"; //기존 16진수 주소 대신 개바부가 나온다 
	
	}
}
//-------------------
class Exam {
	private String name = "홍길동";
	private int age = 25;
	
	
	@Override
	public String toString() {
		return name + "\t" + age;
	}
}
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t =  " + t);   //클래스명@16진수
		System.out.println("객체 t =  " + t.toString());//toString은 써도 되거나 안써도 됨
		System.out.println("객체 t =  " + t.hashCode());  //참조의 값을 16진수 형태로 
		System.out.println();
		
		
		Sample s = new Sample();
		System.out.println("객체 s = " + s.toString());
		System.out.println();
		
		
		Exam e = new Exam();
		System.out.println("객체 e = " + e.toString());
		System.out.println();
		
		String aa = "apple";
		System.out.println("객체 aa = " + aa); //이거는 오버라이딩이 되어버렸기 때문에 apple로 결과값이 나옴 문자열은 참조값이 아니라 
		System.out.println("객체 aa = " + aa.toString()); // 
		System.out.println("객체 aa = " + aa.hashCode()); //
		System.out.println();
		 
		
		String bb = new String("apple");
		String cc = new String("apple");
		System.out.println("bb == cc : " +(bb==cc)); //주소 -false
		System.out.println("bb.equal(cc) : " + bb.equals(cc)); //문자열 true
		System.out.println();
		
		
		Object dd = new Object();
		Object ee = new Object();
		System.out.println("dd == ee : " +(dd==ee)); //주소 -false
		System.out.println("dd.equal(ee) : " + dd.equals(ee)); //주소 true 
		System.out.println();//object는 무조건 주소만 비교한다 그래서 문자열을 비교하는 것은 string일때만이다.
		
		
		Object ff = new Object();
		Object gg = new Object();
		System.out.println("ff == gg : " +(ff==gg)); //주소 -false
		System.out.println("ff.equal(gg) : " + ff.equals(gg)); //=문자열 true  object를 가르킨다고 할지라도 override로 가면 자식꺼를 먼저 처리하게 됨 
		System.out.println();
		
	}

}

