package lesson_thirteen;

public class Main {
 public static void main(String[] args) {
	 
	 Point p1= new Point (3, 4);
	 Point p2= new Point (3, 4);
	 Point p3= new Point (2, 5);
	 Point p4=  p1;
	 
	 // Answering the questions:
	 // the same attributes
	 // false
	 // true the same obj
	 // true
	 // true point 1 with point 4
	 // point1.hashCode() //7
	 // 
	 // false point1.equals(point3)
	 
	 
	 
	 System.out.println(p1.equals(p2));
	 
 }
 
 
}
