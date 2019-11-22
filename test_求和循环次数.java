
public class test_求和循环次数 {
	public static void main(String arg[]){
		int i=0,sum=0;
		while(sum<=377){
			i++;
			sum = sum+i;
			
		}
		System.out.println("和为："+sum+"循环次数为："+i);
	}

}
