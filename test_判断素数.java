import java.util.*;
public class test_�ж����� {
	public static void main(String arg[]){
		boolean Isnumber=true;
		Scanner input= new Scanner(System.in);
		System.out.println("���������������ж��Ƿ�Ϊ������");
		int number = input.nextInt();
		for(int divisor=2;divisor<number;divisor++){
			if(number%divisor==0){
				Isnumber = false;
				break;}
		}
		if(Isnumber)
			System.out.println(number+"������");
		else
			System.out.println(number+"��������");
		input.close();
	}
}
