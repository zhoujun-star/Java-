package java_work;
interface BankShape{
	public static final double minBalace=10.0;
	
}
class Bank implements BankShape{
	private int id;
	private int pwd;
	private double balance;
	private double interestRate;
	private static int init= 1000;
	
	Bank(int pwd,double balance,double interestRate){
		init =  init + 1;
		this.id = init;
		this.pwd = pwd;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public String toString(){
		return "Bank [id="+id+", pwd="+pwd+", balace="+balance+", interestRate="+interestRate+", minBalace="+minBalace+"]";
	}
}
public class work_6 {
	public static void main(String[] args){
		Bank a = new Bank(123,1000.0,0.023);
		Bank b = new Bank(456,2000.0,0.031);
		Bank c = new Bank(789,5000.0,0.038);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}