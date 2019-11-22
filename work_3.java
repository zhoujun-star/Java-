package java_work;
class MyDate{
	public int day,month,year;
	MyDate(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Boolean equals(MyDate m){
		String time1 = day+""+month+""+year;
		String time2 = m.day+""+m.month+""+m.year;
		if(time1.equals(time2)){
			return true;
		}
		else
			return false;
	}
}
class work_3 {  
     public static void main(String[] args) {
    	 MyDate m1 = new MyDate(14, 3, 1996);
    	 MyDate m2 = new MyDate(14, 3, 1996);
	 if ( m1 == m2 ) {
		 System.out.println("m1==m2"); 
	 } 
	 else {
		 System.out.println("m1!=m2"); 
	 }
	 if ( m1.equals(m2) ) {
		 System.out.println("m1 is equal to m2"); 
	 } 
	 else {
		 System.out.println("m1 is not  equal to m2");

} 

}

}

