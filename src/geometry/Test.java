package geometry;

public class Test {

	public static void main(String[] args) {
		Point point1 = new Point();

		// point.x = 10;
		// point1.y = 5;

		point1.setX(10);
		point1.setY(5);

		System.out.println("X kooordinata tacke je: " + point1.getX());
		System.out.println("Y kooordinata tacke je: " + point1.getY());
		System.out.println("Da li je tacka selektovana: " + point1.isSelected());

		double distanceResult = point1.distance(15, 7);
		System.out.println(distanceResult);

		System.out.println(point1);
	}

}
