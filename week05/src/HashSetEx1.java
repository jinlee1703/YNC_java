import java.util.HashSet;

class Student {
	private String name;
	private int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//��ü ������ ���ڿ��� ǥ��
	public String toString() {
		return name+":"+age;
	}
	//equals() �������̵�
//	public boolean equals(Student stu) {
//		return this.name.equals(stu.name) && this.age == stu.age;
//	}
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			Student stu = (Student) obj;
//			return this.name.equals(stu.name) && this.age == stu.age;
//		}
//		return false;
//	}
//	public int hashCode() {
//		return (name+age).hashCode();
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
//HashXXX Ŭ������ �����ϴ� �����ʹ� equals() �޼ҵ�Ӹ� �ƴ϶� hashCode() �޼ҵ嵵 �������̵����־�� ���������� �����Ѵ�.
public class HashSetEx1 {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		
		set.add(new Student("Kim", 20));
		set.add(new Student("Lee", 22));
		set.add(new Student("Kim", 20));
		set.add(new Student("Park", 22));
		
		Student stu1 = new Student("Moon", 22);
		Student stu2 = new Student("Kim", 20);
		Student stu3 = new Student("Kim", 20);
		
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		System.out.println(stu3.hashCode());
		
		System.out.println(set);
	}
}
