package Naive0925;
/**
 * 图形类, 父类
 * @author Naive
 * @date: 2019年9月25日 下午5:26:56
 */
public abstract class Geometry implements Comparable{
	String color;
	String fill;
	private String name;
	
	public Geometry(String name, String color,String fill){
		this.name = name;
		this.color = color;
		this.fill = fill;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 计算面积
	 */
	public abstract double getGraphicArea();
	
	/**
	 * 计算周长
	 */
	public abstract double getGraphicCircumference();
	
	/**
	 * 实现接口
	 * 1、0、-1，来代表比较面积结果，当前对象大、两者相等或者当前对象小
	 * this 当前对象
	 */
	public int compareTo(Geometry geometry){
		int result = 0;
		if (this.getGraphicArea() > geometry.getGraphicArea()) {
			result = 1;
		} else if (this.getGraphicArea() < geometry.getGraphicArea()) {
			result = -1;
		}else if (this.getGraphicArea() == geometry.getGraphicArea()) {
			result = 0;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "图形属性 [颜色=" + color + ", 是否填充=" + fill + "]";
	} 
	
}
