package icesh.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student hong = new Student();
		hong.studentName ="ȫ�浿";
		hong.studentId = "5001";
		hong.korean = 94;
		hong.english = 80;
		hong.math = 84;
		
		hong.printStudentInfo();
		hong.changeStudentId("50001");
		
		System.out.println();
		hong.printStudentInfo();
	}

}
