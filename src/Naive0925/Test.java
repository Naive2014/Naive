package Naive0925;

import java.util.ArrayList;

/**
 * 测试类
 * @author Naive
 * @date 2019年9月26日
 */
public class Test {
	ArrayList<Geometry> geometries = new ArrayList<>();
	
	/**
	 * 
	 * @param geometry
	 */
	public void add(Geometry geometry){
		geometries.add(geometry);
	}
	
	/**
	 * 判断最大值
	 * @return
	 */
	public Geometry logic(){
		Geometry geometry = null;
		for (int i = 0; i < geometries.size(); i++) {
			if (i == 0) {
				geometry = geometries.get(i);
			}else if (geometry.compareTo(geometries.get(i)) != 1) {
				geometry = geometries.get(i);
			}
		}
		return geometry;
	}
	
	public static void main(String[] args){
		Circular circular  = new Circular("圆形", "green", "is fill", 3.0);
		Rectangle rectangle = new Rectangle("长方形", "red", "No fill", 10.0, 5.0);
		Square square = new Square("正方形", "yellow", "No fill", 4.0);
		Test test = new Test();
		
		test.add(circular);
		test.add(rectangle);
		test.add(square);
		
		System.out.println("面积最大的是:"+test.logic().getName());
		System.out.println(test.logic());
	}
}
