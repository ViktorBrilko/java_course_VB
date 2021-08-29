package course.sandbox;

public class Hello {

	public static void main(String[] args) {
		Point p1 = new Point(1,5);
		Point p2 = new Point(7,10);

		System.out.println("Расстояние между точками - " + p1.distance(p2));


	}

//	public static double distance(Point P1, Point P2){
//		return Math.sqrt((Math.pow((P1.p2-P1.p1),2)+Math.pow((P2.p2-P2.p1),2)));
//	}

}



