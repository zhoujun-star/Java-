import java.util.*;
class Person{
	String name;
	void Welcome(){
		System.out.println("Person����");
	}
}
class chinese extends Person{
	chinese(){
	}
	void Welcome(){
		System.out.println("����һ��chinese����");
	}
}
class Korean extends chinese{
	Korean(){
	}
	void Welcome(){
		System.out.println("����һ��Korean����");
	}
}
class Thai extends Korean{
	Thai(){
	}
	void Welcome(){
		System.out.println("����һ��Thai����");
	}
}
public class test_��̬ {
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		Person p = null;
		System.out.println("������һ��������1���й���2��������3��̩����");
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
