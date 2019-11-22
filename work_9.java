package java_work;
import java.util.ArrayList;

class News{
	private String title;
	private String content;
	News(String title){
		this.title = title;
	}
	public String get(){
		return title;
	}
	public void set(String title,String content){
		this.title = title;
		this.content = content;
	}
	public String toString(){
		if(title.length()>15)
			title = title.substring(0,14)+"...";
		return "News [title="+title+"]";
	}
}
public class work_9 {
	public static void main(String args[]){
		ArrayList<News> a = new ArrayList<News>();
		String str1 = "从金山WPS窥探国内软件付费意愿";
		String str2 = "Java干货技术分享: SpringBoot多模块开发";
		String str3 = "晚点独家｜阿里菜鸟收网快递体系: 从永久免费到每单收取1分钱";
		a.add(new News(str1));
		a.add(new News(str2));
		a.add(new News(str3));
		for(int i=0;i<3;i++){
			System.out.println(a.get(i));
		}
	}
}
