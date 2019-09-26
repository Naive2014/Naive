package Naive0925;
/**
 * 接口
 * @author Naive
 * @date: 2019年9月25日 下午5:31:36
 */
public interface Comparable {
	/**
	 * 用来比较两个图形的面积大小
	 * @param geometry
	 * @return 1、0、-1，来代表比较结果，当前对象大、两者相等或者当前对象小
	 */
	public int compareTo(Geometry geometry);
}
