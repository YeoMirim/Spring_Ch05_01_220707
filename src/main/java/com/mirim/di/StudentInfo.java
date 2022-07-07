package com.mirim.di;

public class StudentInfo {

	private Student stu;		// Student.java를 멤버변수로 받음

	public StudentInfo(Student stu) {	// 생성자
		super();
		this.stu = stu;
	}
	
	public void getStudentInfo() {	// 메소드
		System.out.println("이름 : " + stu.getName());
		System.out.println("나이 : " + stu.getAge());
		System.out.println("학년 : " + stu.getGrade());
		System.out.println("반 : " + stu.getClassNum());
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	
	
	
}
