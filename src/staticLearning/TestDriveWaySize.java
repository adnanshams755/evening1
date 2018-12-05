package staticLearning;

public class TestDriveWaySize {

	public static void main(String[] args) {
		
		DriveWay adnan = new DriveWay();
		adnan.driveWaySize = 10;
		System.out.println(adnan.driveWaySize);
		
		
		DriveWay monir = new DriveWay();
		monir.driveWaySize = 12;
		System.out.println(monir.driveWaySize);
		
		
		System.out.println(adnan.driveWaySize);

	}

}
