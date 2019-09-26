package test1;

import java.util.Date;

public class test {
	//获取时间
		public static String getTime1(){
			String time;
			java.text.DateFormat format2 = new java.text.SimpleDateFormat("yyyyMMddhhmmss");
			time = format2.format(new Date());
			return time;
		}
		
		//主函数调用测试
	    public static void main(String[] args) {;
	        System.out.println(getTime1());
	    }

}
