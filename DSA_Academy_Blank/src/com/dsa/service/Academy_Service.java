package com.dsa.service;

import java.util.*;

import com.dsa.vo.Score;
import com.dsa.vo.Student;

public class Academy_Service {

	private TreeSet<Student> studentList;
	private Scanner scan;
	
	public Academy_Service() {
		studentList = new TreeSet<>();
		scan = new Scanner(System.in);
		
		while (true) {
			mainMenu();
			
			int num = scan.nextInt();
			
			switch (num) {
				case 1 -> insertStudent();
				case 2 -> insertScore();
				case 3 -> selectStudent();
				case 4 -> selectScore();
				case 5 -> selectRank();
				case 0 -> System.exit(0);
			}
		}
	}
	
	// ---------------------------------------------------
	
	// 메인메뉴
	public void mainMenu() {
		System.out.println();
		System.out.println("[ DSA_ACADEMY ]");
		System.out.println("1. 학생 등록");
		System.out.println("2. 성적 수정");
		System.out.println("3. 학생 조회");
		System.out.println("4. 성적 조회");
		System.out.println("5. 순위 조회");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
	}
	
	// 학생등록
	public void insertStudent() {
		System.out.println("\n[ 학생등록 ]");
		System.out.print("이름 입력 > ");
		String name = scan.next();
		int java = 0, db = 0, web = 0;
		
		//code 작성
		System.out.print("*Java : ");
		java = scan.nextInt();
		System.out.print("*DB : ");
		db = scan.nextInt();
		System.out.print("*WEB : ");
		web = scan.nextInt();

		if (java > 100 || java < 0 || db > 100 || db < 0 || web > 100 || web < 0) {
			System.out.println("점수는 0~100점 이내로 입력하세요.");
			return;
		}
		Score score = new Score(java, db, web);
		Student student = new Student(name, score);
		studentList.add(student);
		System.out.println("등록되었습니다.");
	}
	
	// 성적수정
	public void insertScore() {
		System.out.println("\n[ 성적수정 ]");
		System.out.print("학번 입력 > ");
		int stdNum = scan.nextInt();

		//code 작성
		for (Student student : studentList) {
			if (student.getStdNum() == stdNum) {
				System.out.println("*Java : " + student.getScore().getJava());
				System.out.println("*DB : " + student.getScore().getDatabase());
				System.out.println("*WEB : " + student.getScore().getWeb());

				System.out.print("*Java : ");
				int java = scan.nextInt();
				System.out.print("*DB : ");
				int db = scan.nextInt();
				System.out.print("*WEB : ");
				int web = scan.nextInt();

				if (java <= 100 && java >= 0 && db <= 100 && db >= 0 && web <= 100 && web >= 0) {
					Score score = new Score(java, db, web);
					student.setScore(score);
					System.out.println("수정되었습니다.");
				} else {
					System.out.println("점수는 0~100점 이내로 입력하세요.");
				}
			} else {
				System.out.println("학생정보가 없습니다.");
				return;
			}
		}
	}
	
	// 학생조회
	public void selectStudent() {
		System.out.println("\n[ 학생조회 ]");
		System.out.print("이름 입력 > ");
		String name = scan.next();
		
		//code 작성
		for (Student student : studentList) {
			if (student.getName() == name) {
				student.toString();
			} else {
				System.out.println("학생정보가 없습니다.");
				return;
			}
		}
	}
	
	// 성적조회
	public void selectScore() {
		System.out.println("\n[ 성적조회 ]");
		System.out.print("학번 입력 > ");
		int stdNum = scan.nextInt();
		
		//code 작성
		for (Student student : studentList) {
			if (student.getStdNum() == stdNum) {
				Score score = student.getScore();
				score.toString();
			} else {
				System.out.println("학생정보가 없습니다.");
				return;
			}
		}
	}
	
	// 순위조회
	public void selectRank() {
		//code 작성 , 합계를 기준으로한 Comparator 구현
//		Collections.sort(studentList, new Comparator<Student>() {
//			@Override
//			public int compare(Student s1, Student s2) {
//				return s1.getScore().getSum().compareTo(s2.getScore().getSum());
//			}
//		});

		for (Student student : studentList) {
			System.out.println(student.getName() + "_" + student.getStdNum() +
					" : 합계(" + student.getScore().getSum() + "), 평균(" + student.getScore().getAvg() + ")");
		}
	}
}
