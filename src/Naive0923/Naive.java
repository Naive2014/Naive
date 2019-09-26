package Naive0923;
/**
 * main
 * @author Naive
 * @date: 2019年9月23日 下午3:50:21
 */
public class Naive {
	public static void main(String[] args){
		StudentList studentList = new StudentList();
		Student Naive = new Student("20190923", "Naive", 98, 89, 37);
		Student Naive2 = new Student("20190923", "Naive2", 59, 65, 78);
		Student Naive3 = new Student("20190923", "Naive3", 78, 25, 58);
		Student Naive4 = new Student("20190923", "Naive4", 45, 45, 78);
		Student Naive5 = new Student("20190923", "Naive5", 65, 23, 58);
		
		studentList.addList(Naive);
		studentList.addList(Naive2);
		studentList.addList(Naive3);
		studentList.addList(Naive4);
		studentList.addList(Naive5);
		
		//System.out.println(studentList.Query("N"));
		
		studentList.print();
		studentList.QueryScore();
	}
}
