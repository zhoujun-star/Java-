package java_work;
class Circle{
	private double radius;
	Circle(){
		radius = 1;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	public double findArea(){
		return 3.14*radius*radius;
	}
}
class Cylinder extends Circle{
	private double length;
	Cylinder(){
		length = 1;
	}
	public void setLength(double length){
		this.length = length;
	}
	public double getLength(){
		return length;
	}
	public double findVolume(){
		return length*super.findArea();
	}
	public double findArea(){
		double s1,s2;
		s1 = 2*3.14*getRadius()*getRadius();
		s2 = 2*3.14*getRadius()*length;
		return s1+s2;
	}
}
public class work_1{
	public static void main(String args[]){
		Cylinder p = new Cylinder();
		System.out.println("Cylinder surface area:"+p.findArea());
		System.out.println("Cylinder volume:"+p.findVolume());
	}
}

