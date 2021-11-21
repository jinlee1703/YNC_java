//1. �� ���α׷��� �����ϸ� ������ �߻��Ѵ�. �ذ�����?
//Ŭ������ �����ڰ� �ϳ��� ������ �⺻�����ڴ� JVM�� �ڵ����� �־��ش�
//Ŭ������ ���鶧 �⺻�����ڸ� ������ִ� ������ ������ ���� ����.
//������ ���� : ��ü ������ �ʱ�ȭ
//�⺻�ڷ��� : ==
//�����ڷ��� : eqals() �޼ҵ�
//�ڹٿ��� ��ü�� ������ ������ ���� ��ü �ν�
//Object equals()�� ��ü�� �ּҰ��� ��
class Student extends Object {
	//�ʵ�
	//private String name;
	String name;
	private int age;
	//������ �����ε�
	public Student() {}
	//��������� ������
	//this : ��ü �ڱ� �ڽ��� ��Ī
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//��ü������ ���ڿ��� ǥ��
	//�������̵� - �θ� Ŭ������ �޼ҵ带 ������
	public String toString() {
		return name + ":" + age;
	}
	//equals() �������̵�
	public boolean equals(Student obj) {
		return this.name.equals(obj.name) && this.age == obj.age;
	}
}
public class StudentEx {
	public static void main(String[] args) {
		Student stu = new Student();	//�⺻������
		Student stu1 = new Student("ȫ�浿", 24);
		
		System.out.println("stu : " + stu.toString());
		System.out.println("stu1 : " + stu1);
		
		Student stu2 = new Student("�����", 26);
		System.out.println("stu2 : " + stu2);
		
		Student stu3 = new Student("ȫ�浿", 24);
		System.out.println(stu1.equals(stu3));
		System.out.println(stu1.equals(stu2));
		
		System.out.println(stu1.name);
	}
}
