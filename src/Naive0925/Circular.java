package Naive0925;
/**
 * 
 * @author Naive
 * @date: 2019年9月25日 下午5:27:41
 */
public class Circular extends Geometry {
	private double radius;
	
	public Circular(double radius,String color,String fill){
		super(color, fill);
		this.radius = radius;
	}
	
	@Override
	public void getGraphicArea() {
		System.out.println("圆的面积是"+radius*radius*Math.PI);

	}

	@Override
	public void getGraphicCircumference() {
		System.out.println("圆的周长是"+radius*2*Math.PI);
	}

	@Override
	public String toString() {
		getGraphicArea();
		getGraphicCircumference();
		return "圆的属性 [radius=" + radius + ", color=" + color + ", fill=" + fill + "]";
	}
	
	

}
