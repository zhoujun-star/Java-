import java.util.*;
public class test_���Լ������С������ {
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		System.out.println("����������������");
		int i,min,sum=1;
		int a = input.nextInt();
		int b = input.nextInt();
		int c=a,d=b;
		if(a>b)
			min = b;
		else
			min = a;
		for(i=2;i<=min;i++){
			while((a%i==0)&&(b%i==0)){
				sum = sum*i;
				a = a/i;
				b = b/i;
			}
		}
		System.out.println("���Լ��Ϊ��"+sum);
		System.out.println("��С������Ϊ��"+(c/sum)*(d/sum));
		input.close();
	}
}
