import java.util.*;
public class test_�ж�ĳ������ {
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = input.nextInt();
		boolean is_year = true;
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
			System.out.println("����Ϊ����");
		}
		else{
			System.out.println("����Ϊƽ��");
			is_year = false;
		}
		System.out.println("�������·ݣ�");
		int month = input.nextInt();
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.printf("%s�� %s���� 31��",year,month);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("%s�� %s���� 30��",year,month);
			break;
		case 2:
			if(is_year)
				System.out.printf("%s�� %s���� 29��",year,month);
			else
				System.out.printf("%s�� %s���� 28��",year,month);
		}
		input.close();
	}

}
