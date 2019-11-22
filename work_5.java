package java_work;

class Cuboid implements Shape{
	int l,w,h;
	Cuboid(int l,int w,int h){
		this.l = l;
		this.w = w;
		this.h = h;
	}
	public double area() {
		return l*w;
	}
	public double volume() {
		return area()*h;
	}
	
}
class CCylinder implements Shape{
	int r, h ;
	CCylinder(int r,int h){
		this.r = r;
		this.h = h;
	}
	public double area(){
		return 3.14*r*r;
	}
	public double volume(){
		return area()*h;
	}
}
public class work_5{
	public static void main(String args[]){
		Cuboid c = new Cuboid(10,6,5);
		System.out.println("The area of this cuboid is "+c.area());
		System.out.println("The volume of this cuboid is "+c.volume());
		CCylinder y =new CCylinder(5,10);
		System.out.println("The area of this cylinder is "+y.area());
		System.out.println("The volume of this cylinder is "+y.volume());
	}
}