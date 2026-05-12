public class PracticeProblem {

	public static void main(String args[]) {

	}


	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}
	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}


}
	class Circle {
		private double radius;

		public Circle(double radius) {
			this.radius = radius;
		}
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}
		public double diameter() {
			return radius * 2;
		}
		public double perimeter() {
			return 2 * Math.PI * radius;
		}
		public double area() {
			return Math.PI * radius * radius;
		}
	}


	class Sphere extends Circle {
		public Sphere(double radius) {
			super(radius);
		}
		@Override
		public double area() {
			return 4 * Math.PI * getRadius() * getRadius();
		}
		public double volume() {
			return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
		}
	}