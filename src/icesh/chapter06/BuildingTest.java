package icesh.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		Building kimpo = new Building();
		kimpo.name =  "������Ÿ��";
		kimpo.address = "������";
		kimpo.totalFloor = 5;
		
		kimpo.moveElevator();
		System.out.println(kimpo.address);
		kimpo.changeAddresss("���");
		System.out.println(kimpo.address);
	}

}
