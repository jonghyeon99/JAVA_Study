package com.dsa.vo;

/**
 * 성적 정보
 */
public class Score {

	// 멤버변수
	private int java;
	private int database;
	private int web;
	private int sum;
	private double avg;
	// 생성자
	public Score() {}
	
	public Score(int java, int database, int web) {
		super();
		this.java = java;
		this.database = database;
		this.web = web;
	}
	
	
	// 엑세서(Getter & Setter)
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDatabase() {
		return database;
	}
	public void setDatabase(int database) {
		this.database = database;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getSum() {
		return java + database + web;
	}
	public double getAvg() {
		return (java + database + web) / 3;
	}
	// toString() 사용


	@Override
	public String toString() {
		return "[평균: " + avg + "] 합계: " + sum + " - JAVA(" + java + "), (" + database + "), WEB(" + web + ")";
	}
	
}
