
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age)	{
		this.name = name;
		this.age = age;
	}
	//객체 정보를 문자열로 표현
	public String toString() {
		return name+":"+age;
	}
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
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//	public boolean equals(Object obj) {
//		Person p = (Person) obj;
//		
//		return this.name.equals(p.name) && this.age == p.age;
//	}
//	
//	//HashXXX 자ㅏ료구조에 넣ㅇ르때는 hashCode()도 오버라이딩
//	public int hashCode() {
//		return (name+age).hashCode();
//	}
	
	
}
