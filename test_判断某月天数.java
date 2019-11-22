import java.util.*;
public class test_判断某月天数 {
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = input.nextInt();
		boolean is_year = true;
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
			System.out.println("该年为闰年");
		}
		else{
			System.out.println("该年为平年");
			is_year = false;
		}
		System.out.println("请输入月份：");
		int month = input.nextInt();
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.printf("%s年 %s月有 31天",year,month);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("%s年 %s月有 30天",year,month);
			break;
		case 2:
			if(is_year)
				System.out.printf("%s年 %s月有 29天",year,month);
			else
				System.out.printf("%s年 %s月有 28天",year,month);
		}
		input.close();
	}

}
