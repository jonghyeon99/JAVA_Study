package com.dsa.vo;

/**
 * 학생 정보
 */
public class Student implements Comparable<Student>{

	// 멤버변수
	private static final String ACADEMY = "DSA";
	private static final int NUMBER = 46;
	private static int serialNum = 20241000;
	private String name;
	private int stdNum;
	private Score score;

	// 생성자
	public Student () {}
	
	public Student(String name, Score score) {
		super();
		this.name = name;
		this.score = score;
		serialNum++;
		stdNum = serialNum;
	}
	// 엑세서(Getter & Setter)
	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getStdNum() {
		return stdNum;
	}


	// equals() & hashCode()

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Student student = (Student) o;
		return stdNum == student.stdNum;
	}

	@Override
	public int hashCode() {
		return this.stdNum;
	}

	// compareTo()
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}

	// toString() 사용
	@Override
	public String toString() {
		return "[" + ACADEMY + "-" + NUMBER + "th" + "] 이름: " + name + ", 학번: " + stdNum +
				", 점수: JAVA( " + score.getJava() + "), DB( " + score.getDatabase() + "), WEB( " + score.getWeb() + ")";
	}
}
