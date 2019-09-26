package Naive0925;
/**
 * 
 * @author Naive
 * @date: 2019年9月25日 下午5:31:46
 */
public class Rectangle extends Geometry {

	private double wide;
	private double hight;
	public Rectangle(double wide,double hight,String color, String fill) {
		super(color, fill);
		this.wide = wide;
		this.hight = hight;
	}

	@Override
	public void getGraphicArea() {
		System.out.println("长方形的面积是"+wide*hight);

	}

	@Override
	public void getGraphicCircumference() {
		System.out.println("长方形的周长是"+wide*2+hight*2);

	}

	@Override
	public String toString() {
		getGraphicArea();
		getGraphicCircumference();
		return "长方形的属性 [wide=" + wide + ", hight=" + hight + ", color=" + color + ", fill=" + fill + "]";
	}

}
