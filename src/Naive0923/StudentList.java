package Naive0923;

import java.util.ArrayList;
/**
 * 
 * @author Naive
 * @date: 2019年9月23日 下午2:59:30
 */
public class StudentList {
	/**
	 * 声明数组
	 */
	private ArrayList<Student> studentlist = new ArrayList<>();
	
	/**
	 * 根据姓名查询
	 * @param name
	 */
	public Student Query(String name){
		for (int i = 0; i < studentlist.size(); i++) {
			if (studentlist.get(i).getName().contains(name)) {
				return studentlist.get(i);
			}
		}
		return null;
	}
	
	/**
	 * 查询全部学生
	 */
	public void print(){
		for (int i = 0; i < studentlist.size(); i++) {
			System.out.println(studentlist.get(i));
		}
	}
	
	/**
	 * 添加学生对象
	 * @param student
	 */
	public void addList(Student student){
		studentlist.add(student);
	}
	
	/**
	 * 查询成绩
	 */
	public void QueryScore(){
		StudentSelect();
		HighspeedSelect();
		SportsSelect();
	}
	
	/**
	 * 查询英语
	 */
	public void StudentSelect(){
		int people = 0;
		System.out.print("英语不及格的有  ");
		for (int i = 0; i < studentlist.size(); i++) {
			if (studentlist.get(i).getEnglish()<60) {
				System.out.print(studentlist.get(i).getName()+" ");
				people++;
			}
		}
		System.out.print("总共有"+people+"人\n");
	}
	
	/**
	 * 查询高数
	 */
	public void HighspeedSelect(){
		int people = 0;
		System.out.print("高数不及格的有  ");
		for (int i = 0; i < studentlist.size(); i++) {
			if (studentlist.get(i).getHighspeed()<60) {
				System.out.print(studentlist.get(i).getName()+" ");
				people++;
			}
		}
		System.out.print("总共有"+people+"人\n");
	}
	
	/**
	 * 查询体育
	 */
	public void SportsSelect(){
		int 	people = 0;
		System.out.print("体育不及格的有  ");
		for (int i = 0; i < studentlist.size(); i++) {
			if (studentlist.get(i).getSports()<60) {
				System.out.print(studentlist.get(i).getName()+" ");
				people++;
			}
		}
		System.out.print("总共有"+people+"人\n");
	}
}
