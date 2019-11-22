package java_work;
interface CompareObject{
	public int compareTo(Object o);
}

class CCCircle{
	private double radius;
	CCCircle(double radius){
		this.radius = radius;
	}
	public double area(){
		return 3.14*radius*radius;
	}
}

class ComparableCircle extends CCCircle implements CompareObject{
	ComparableCircle(double radius) {
		super(radius);
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		ComparableCircle w = (ComparableCircle) o;
		if(this.area()==w.area()){
			System.out.println(0);
			return 0;
		}
		if(this.area()>w.area())
			return 1;
		else
			return -1;
		
	}
}

class Rectangle{
	private double l;
	private double w;
	Rectangle(double l,double w){
		this.l = l;
		this.w = w;
	}
	public double area(){
		return l*w;
	}
}

class ComparableRectangle extends Rectangle implements CompareObject{
	ComparableRectangle(double l,double w){
		super(l,w);
	}
	public int compareTo(Object o){
		ComparableRectangle w = (ComparableRectangle) o;
		if(this.area()==w.area()){
			return 0;
		}
		if(this.area()>w.area()){
			return 1;
		}
		else
			return -1;
	}
}
public class work_8 {
	public static void main(String args[]){
		ComparableCircle c1 = new ComparableCircle(1.0);
		ComparableCircle c2 = new ComparableCircle(1.0);
		c1.compareTo(c2);
		ComparableRectangle r1 = new ComparableRectangle(1,2);
		ComparableRectangle r2 = new ComparableRectangle(4,2);
		r1.compareTo(r2);
	}
}
