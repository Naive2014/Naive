package Naive0923;
/**
 * 学生对象
 * @author Naive
 * @date: 2019年9月23日 下午3:50:05
 */
public class Student {
	private String sno;
	private String name;
	private int english;
	private int highspeed;
	private int sports;
	
	/**
	 * 
	 * @param sno 学号
	 * @param name 名字
	 * @param english 英语成绩
	 * @param highspeed 高数成绩
	 * @param sports 体育成绩
	 */
	public Student(String sno,
			String name,
			int english,
			int highspeed,
			int sports){
		this.sno = sno;
		this.name = name;
		this.english = english;
		this.highspeed = highspeed;
		this.sports = sports;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getHighspeed() {
		return highspeed;
	}

	public void setHighspeed(int highspeed) {
		this.highspeed = highspeed;
	}

	public int getSports() {
		return sports;
	}

	public void setSports(int sports) {
		this.sports = sports;
	}

	@Override
	public String toString() {
		return "学生 [学号=" + sno + ", 名字=" + name + ", 英语成绩=" + english + ", 高数成绩=" + highspeed
				+ ", 体育成绩=" + sports + "]";
	}
	
}
