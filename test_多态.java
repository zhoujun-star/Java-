import java.util.*;
class Person{
	String name;
	void Welcome(){
		System.out.println("Person主类");
	}
}
class chinese extends Person{
	chinese(){
	}
	void Welcome(){
		System.out.println("这是一个chinese子类");
	}
}
class Korean extends chinese{
	Korean(){
	}
	void Welcome(){
		System.out.println("这是一个Korean子类");
	}
}
class Thai extends Korean{
	Thai(){
	}
	void Welcome(){
		System.out.println("这是一个Thai子类");
	}
}
public class test_多态 {
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		Person p = null;
		System.out.println("请输入一个整数（1：中国，2：韩国，3：泰国）");
		int n = input.nextInt();
		if(n==1){
			p = new chinese();
		}
		if(n==2){
			p = new Korean();
		}
		if(n==3){
			p = new Thai();
		}
		if((n!=1&n!=2)&n!=3){
			p = new Person();}
		p.Welcome();
		input.close();
	}
}
