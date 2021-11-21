import java.io.Serializable;

//객체 직렬화를 위해서는 Serializable 인터페이스를 구현
public class Person implements Serializable {
	private String name;
	private int age;
	private transient String ssn;	//객체직렬화를 제외시킴.
	
	public Person(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}
	public String toString() {
		return name+":"+age+":"+ssn;
	}
	
}
