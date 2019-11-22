import java.util.*;
public class test_最大公约数和最小公倍数 {
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		System.out.println("请任意输入两个数");
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
		System.out.println("最大公约数为："+sum);
		System.out.println("最小公倍数为："+(c/sum)*(d/sum));
		input.close();
	}
}
