package lesson_thirteen;

public class Point {
	 final Integer x;
	 final Integer y;
	
	 
	 
	 public Point (Integer x, Integer y ){
		 this.x= x;
		 this.y= y;
	}
	
	 @Override
	 public boolean equals(Object obj) {
		 if (!(obj instanceof Point)) {
			 return false;
		 }
		 Point obj1= (Point) obj;
		
		 if (this.x.equals(obj1.x) && this.y.equals(obj1.y)) { 
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 @Override
	 public int hashCode() {
		 return this.x +this.y;
	 }
	 
	 
}
