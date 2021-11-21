import java.io.Serializable;
//객체직렬화
public class Person implements Serializable {
	private String name;
	private int age;
	private  String ssn;	//객체 직렬화를 제외
	
	public Person(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String toString() {
		return name + ":" + age + ":" + ssn;
	}
}
