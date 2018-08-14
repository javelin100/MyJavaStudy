package icesh.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		Building kimpo = new Building();
		kimpo.name =  "국제선타워";
		kimpo.address = "김포동";
		kimpo.totalFloor = 5;
		
		kimpo.moveElevator();
		System.out.println(kimpo.address);
		kimpo.changeAddresss("운서동");
		System.out.println(kimpo.address);
	}

}
