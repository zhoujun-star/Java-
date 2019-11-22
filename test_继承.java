class student{
	private String name;
	private int age;
	private int scr;
	student(String name,int age,int scr){
		this.name = name;
		this.age = age;
		this.scr = scr;
	}
	void print(){
		System.out.print("name:"+name+" age:"+age+" scr"+scr);
	}
}
class computer extends student{
	private int scrmath;
	computer(String name,int age,int scr,int scrmath){
			super(name,age,scr);
			this.scrmath = scrmath;
	}
	void print(){
		super.print();
		System.out.print(" scrmath:"+scrmath);
	}
}
class data extends computer{
	private int javascr;
	data(String name,int age,int scr,int scrmath,int javascr){
		super(name,age,scr,scrmath);
		this.javascr = javascr;
	}
	void print(){
		super.print();
		System.out.println(" javascr"+javascr);
	}
}
public class test_¼Ì³Ğ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data s = new data("ÕÅÈı",21,100,90,95);
		s.print();
	}

}
