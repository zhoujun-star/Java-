package java_work;
import java.util.*;
class Student_scr{
	private int scr;
	private int max;
	private static int num=-1;
	Student_scr(int scr,int max){
		this.scr = scr;
		this.max = max;
		
	}
	public String get_level(){
		if(scr>=max-10)
			return "A";
		if(scr>=max-20)
			return "B";
		if(scr>=max-30)
			return "C";
		else
			return "D";
	}
	public String toString(){
		num++;
		return "student "+num+" score is "+scr+"  grade is "+get_level();
	}
}
public class work_7 {
	public static void main(String args[]){
		int max=0;
		Scanner input = new Scanner(System.in);
		System.out.println("input student number:");
		int num = input.nextInt();
		Student_scr s[] = new Student_scr[num];
		int input_scr[] = new int[num];
		System.out.println("input "+num+" scores:");
		for(int i =0;i<num;i++){
			int input_num = input.nextInt();
			input_scr[i] = input_num;
			if(input_num>max)
				max = input_num;
			}
		for(int i =0;i<num;i++){
			s[i] = new Student_scr(input_scr[i],max);
		}
		System.out.println("max score"+max);
		for(int i =0;i<num;i++){
			System.out.println(s[i]);
		}
	}
	
}
