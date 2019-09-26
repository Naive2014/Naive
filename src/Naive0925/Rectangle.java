package Naive0925;
/**
 * 长方形类
 * @author Naive
 * @date: 2019年9月25日 下午5:31:46
 */
public class Rectangle extends Geometry {
	private double wide;
	private double hight;

	
	public Rectangle(String name, String color, String fill, double wide, double hight) {
		super(name, color, fill);
		this.wide = wide;
		this.hight = hight;
	}

	@Override
	public double getGraphicArea() {
		//System.out.println("长方形的面积是"+wide*hight);
		return wide*hight;
	}

	@Override
	public double getGraphicCircumference() {
		return wide*2+hight*2;
		
	}

	@Override
	public String toString() {
		System.out.println("长方形的面积是"+getGraphicArea());
		System.out.println("长方形的周长是"+getGraphicCircumference());
		return "长方形的属性 [wide=" + wide + ", hight=" + hight + ", color=" + color + ", fill=" + fill + "]";
	}

}
