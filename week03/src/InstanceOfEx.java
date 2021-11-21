class Person {}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}
public class InstanceOfEx {
	//메소드, 파라미터의 다형성
	static void print(Person p) {
		if (p instanceof Person) {
			System.out.print("Person");
		}
		if (p instanceof Student) {
			System.out.print("Student");
		}
		if (p instanceof Researcher) {
			System.out.print("Researcher");
		}
		if (p instanceof Professor) {
			System.out.print("Professor");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student(} ->>\t"); print(new Student());
		System.out.print("new Professor(); ->>\t"); print(new Professor());
		
		Student stu = new Student();
		if (stu instanceof Student) {
			System.out.println("stu는 Student 타입");
		}
	}
}
