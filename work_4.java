package java_work;
class GeometricObject{
	protected String color;
	protected double weight;
	protected GeometricObject(){
		this.color = "white";
		this.weight = 1.0;
	}
	protected GeometricObject(String color,double weight) {
		this.color = color;
		this.weight = weight;
	}
}
class CCircle extends GeometricObject{
	protected double radius;
	public CCircle() {
		this.color = "white";
		this.weight = 1.0;
		this.radius = 1.0;
	}
	public CCircle(double radius) {
		this.color = "white";
		this.weight = 1.0;
		this.radius = radius;
	}
	public boolean equals(CCircle m) {
		String str1 = ""+radius+color+weight;
		String str2 = ""+m.radius+m.color+m.weight;
		if(str1.equals(str2)){
			return true;
		}
		else
			return false;
	}
	public String toString() {
		return "Circle [radius="+radius+"]";
	}
	public CCircle(double radius,String color,double weight) {
		this.color = "white";
		this.weight = 1.0;
		this.radius = radius;
		this.color = color;
		this.weight = weight;
	}
}
public class work_4 {
	public static void main(String[] args) {
		CCircle c1 = new CCircle(2.5);
		CCircle c2 = new CCircle(2.5);
		if(c1.color == c2.color) {
		System.out.println("c1's color == c2's color");
		}else {
		System.out.println("c1's color != c2's color");
		}
		if(c1.equals(c2)) {
		System.out.println("c1's radius == c2's radius");
		}else {
		System.out.println("c1's radius != c2's radius");
		}
		System.out.println(c1);
		System.out.println(c2);
		}
}
