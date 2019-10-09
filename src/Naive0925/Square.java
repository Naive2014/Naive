package Naive0925;
/**
 * 正方形类
 * @author Naive
 * @date: 2019年9月25日 下午5:31:42
 */
public class Square extends Geometry {
	private double side;

	public Square(String name ,String color, String fill, double side) {
		super(name, color, fill);
		this.side = side;
	}

	@Override
	public double getGraphicArea() {
		//System.out.println("正方形的面积是"+side*side);
		return side*side;
	}

	@Override
	public double getGraphicCircumference() {
		return side*4;
	}

	@Override
	public String toString() {
		System.out.println("正方形的面积是"+getGraphicArea());
		System.out.println("正方形的周长是"+getGraphicCircumference());
		return "正方形的属性是 [side=" + side + ", color=" + color + ", fill=" + fill + "]";
	}
	
	

}
