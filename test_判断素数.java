import java.util.*;
public class test_判断素数 {
	public static void main(String arg[]){
		boolean Isnumber=true;
		Scanner input= new Scanner(System.in);
		System.out.println("请输入任意整数判断是否为素数：");
		int number = input.nextInt();
		for(int divisor=2;divisor<number;divisor++){
			if(number%divisor==0){
				Isnumber = false;
				break;}
		}
		if(Isnumber)
			System.out.println(number+"是素数");
		else
			System.out.println(number+"不是素数");
		input.close();
	}
}
