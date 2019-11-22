package java_work;
class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
              return "Name:"+ name + ",age:"+ age;
    }
  }
class Student extends Person {
    protected String school="cque";
    public String getInfo() {
    	return  "Name:"+ name + ",age:"+ age+ ",school:"+ school;
    }
  }
class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
    return  "Name:"+ name + ",age:"+ age+ ",school:"+ school+",major:"+major;
    }
  }
class TestInstance{
	public void method1(Person e){
		if(e instanceof Person){
			Person p = new Person();
			System.out.println(p.getInfo());
		}
		if(e instanceof Student){
			Student s = new Student();
			System.out.println(s.getInfo());
		}
		if(e instanceof Graduate){
			Graduate g = new Graduate();
			System.out.println(g.getInfo());
		}
	}
}
//class TestInstance{
//	public void method1(Person e){
//		if(e instanceof Person){
//			System.out.println("a person");
//		}
//		if(e instanceof Student){
//			System.out.println("a student"+"\n"+"a person");
//		}
//		if(e instanceof Graduate){
//			System.out.println("a student"+"\n"+"a person"+"\n"+ "a person");
//		}
//	}
//}
public class work_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInstance t =new TestInstance();
		Person p = new Graduate();
		t.method1(p);
	}
}
