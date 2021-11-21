import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private int score;
	
	public Student(String name, int score) {		//생성자 : 객체를 만들 때 사용되는
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return name + ":" + score;
	}

	public String getName() {
		return name;
	}

	public Integer getScore() {
		return score;
	}
}