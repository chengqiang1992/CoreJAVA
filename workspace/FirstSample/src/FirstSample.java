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
		System.out.println("������");
		System.out.println(new GregorianCalendar());
		System.out.println(new GregorianCalendar(1999, 11, 31));
		System.out.println(new GregorianCalendar(1999, Calendar.DECEMBER, 31));
		
		System.out.println("���������������������");
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
//		get ����������
//		set add ����������
		
		System.out.print("GregorianCalendar �� date֮���һЩ����");
//		GregorianCalendar calendar = new GregorianCalendar(year, month, day);
		
		
		
		
		
		
		
		
		
	}

}
