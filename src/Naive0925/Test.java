package Naive0925;
/**
 * 
 * @author Naive
 * @date: 2019年9月25日 下午5:27:04
 */
public class Test {
	public static void main(String[] args){
		Circular circular  = new Circular(3.0, "green", "is fill");
		Rectangle rectangle = new Rectangle(10.0, 5.0, "red", "No fill");
		Square square = new Square(4.0, "yellow", "No fill");
		
		System.out.println(circular);
		System.out.println(rectangle);
		System.out.println(square);
	}
}
