package Naive0925;
/**
 * 
 * @author Naive
 * @date: 2019年9月25日 下午5:31:42
 */
public class Square extends Geometry {
	private double side;

	public Square(double side,String color, String fill) {
		super(color, fill);
		this.side = side;
	}

	@Override
	public void getGraphicArea() {
		System.out.println("正方形的面积是"+side*side);

	}

	@Override
	public void getGraphicCircumference() {
		System.out.println("正方形的周长是"+side*4);
	}

	@Override
	public String toString() {
		getGraphicArea();
		getGraphicCircumference();
		return "长方形的属性是 [side=" + side + ", color=" + color + ", fill=" + fill + "]";
	}
	
	

}
