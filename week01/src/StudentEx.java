//1. 이 프로그램을 실행하면 오류가 발생한다. 해결방법은?
//클래스에 생성자가 하나도 없으면 기본생성자는 JVM이 자동으로 넣어준다
//클래스를 만들때 기본생성자를 만들어주는 습관을 가지는 것이 좋다.
//생성자 역할 : 객체 생성시 초기화
//기본자료형 : ==
//참조자료형 : eqals() 메소드
//자바에서 객체의 내용이 같으면 같은 객체 인식
//Object equals()는 객체의 주소값을 비교
class Student extends Object {
	//필드
	//private String name;
	String name;
	private int age;
	//생성자 오버로딩
	public Student() {}
	//사용자정의 생성자
	//this : 객체 자기 자신을 지칭
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//객체정보를 문자열로 표현
	//오버라이딩 - 부모 클래스의 메소드를 재정의
	public String toString() {
		return name + ":" + age;
	}
	//equals() 오버라이딩
	public boolean equals(Student obj) {
		return this.name.equals(obj.name) && this.age == obj.age;
	}
}
public class StudentEx {
	public static void main(String[] args) {
		Student stu = new Student();	//기본생성자
		Student stu1 = new Student("홍길동", 24);
		
		System.out.println("stu : " + stu.toString());
		System.out.println("stu1 : " + stu1);
		
		Student stu2 = new Student("손흥민", 26);
		System.out.println("stu2 : " + stu2);
		
		Student stu3 = new Student("홍길동", 24);
		System.out.println(stu1.equals(stu3));
		System.out.println(stu1.equals(stu2));
		
		System.out.println(stu1.name);
	}
}
