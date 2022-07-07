package com.mirim.di;

public class StudentInfo {

	private Student stu;		// Student.java�� ��������� ����

	public StudentInfo(Student stu) {	// ������
		super();
		this.stu = stu;
	}
	
	public void getStudentInfo() {	// �޼ҵ�
		System.out.println("�̸� : " + stu.getName());
		System.out.println("���� : " + stu.getAge());
		System.out.println("�г� : " + stu.getGrade());
		System.out.println("�� : " + stu.getClassNum());
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	
	
	
}
