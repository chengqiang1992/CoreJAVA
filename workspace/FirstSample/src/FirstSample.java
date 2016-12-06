import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FirstSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We will not use Hello WOrld");
		System.out.println(new Date());
		String s = new Date().toString();
		System.out.println(s);
		
		Date birthday = new Date();
		System.out.println(birthday);
		
		new GregorianCalendar();
		System.out.println("日历类");
		System.out.println(new GregorianCalendar());
		System.out.println(new GregorianCalendar(1999, 11, 31));
		System.out.println(new GregorianCalendar(1999, Calendar.DECEMBER, 31));
		
		System.out.println("更改器方法与访问器方法");
		GregorianCalendar now = new GregorianCalendar();
		int a = now.get(Calendar.ALL_STYLES);
		int b = now.get(Calendar.AM);
		int c = now.get(Calendar.AM_PM);
		int d = now.get(Calendar.APRIL);
		int e = now.get(Calendar.AUGUST);
		int f = now.get(Calendar.DATE);
		int g = now.get(Calendar.DAY_OF_MONTH);
		int h = now.get(Calendar.DAY_OF_WEEK);
		int i = now.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int j = now.get(Calendar.DAY_OF_YEAR);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
//		get 访问器方法
//		set add 更改器方法
		
		System.out.print("GregorianCalendar 与 date之间的一些操作");
//		GregorianCalendar calendar = new GregorianCalendar(year, month, day);
		
		
		
		
		
		
		
		
		
	}

}
