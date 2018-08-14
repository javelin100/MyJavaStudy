package icesh.chapter06;

public class Student {
	String studentName;
	String studentId;
	int korean;
	int english;
	int math;
	
	
	int calculateAverage() {
		int average = (korean + english + math) /3;
		return average;
		
	}
	
	void printStudentInfo() {
		System.out.println("학생명 : " + studentName);
		System.out.println("학생ID : " + studentId);
		System.out.println("국어점수 : " + korean);
		System.out.println("영어점수 : " + english);
		System.out.println("수학점수 : " + math);
	}
	
	void changeStudentId(String newId) {
		studentId = newId;
		
	}
}
