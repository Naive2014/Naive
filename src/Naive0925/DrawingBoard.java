package Naive0925;
/**
 * 
 * @author Naive
 * @date: 2019年9月25日 下午5:27:04
 */
public class DrawingBoard {
	public static void main(String[] args){
		//向上转型
		Geometry circular  = new Circular("圆形", "green", "is fill", 3.0);
		Geometry rectangle = new Rectangle("长方形", "red", "No fill", 10.0, 5.0);
		Geometry square = new Square("正方形", "yellow", "No fill", 4.0);
		
		System.out.println(circular);
		System.out.println(rectangle);
		System.out.println(square);
	}
}
