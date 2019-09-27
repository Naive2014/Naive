package Naive0925;
/**
 * 圆形类
 * @author Naive
 * @date: 2019年9月25日 下午5:27:41
 */
public class Circular extends Geometry {
	private double radius;
	
	public Circular(String name,String color,String fill, double radius){
		super(name, color, fill);
		this.radius = radius;
	}

	@Override
	public double getGraphicArea() {
		//System.out.println("圆的面积是"+radius*radius*Math.PI);
		return radius*radius*Math.PI;
	}

	@Override
	public double getGraphicCircumference() {
		return radius*2*Math.PI;
	}

	@Override
	public String toString() {
		System.out.println("圆的面积是"+getGraphicArea());
		System.out.println("圆的周长是"+getGraphicCircumference());
		return "圆的属性 [radius=" + radius + ", color=" + color + ", fill=" + fill + "]";
	}
	
	

}
