package Naive0925;
/**
 * 
 * @author Naive
 * @date: 2019年9月25日 下午5:26:56
 */
public abstract class Geometry {
	String color;
	String fill;
	
	public Geometry(String color,String fill){
		this.color = color;
		this.fill = fill;
	}
	
	/**
	 * 计算面积
	 */
	public abstract void getGraphicArea();
	
	/**
	 * 计算周长
	 */
	public abstract void getGraphicCircumference();
	
	@Override
	public String toString() {
		return "图形属性 [颜色=" + color + ", 是否填充=" + fill + "]";
	} 
	
}
