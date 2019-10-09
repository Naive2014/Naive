package Naive0923;
/**
 * 值传递与引用传递
 * @author Naive
 * @date: 2019年10月9日 下午5:18:32
 */
public class CitationTransfer {
    private int num;
    public CitationTransfer(int num){
    	this.num=num;
    }
    public int getNum(){
    	return num;
    }
    public void setNum(int temp){
    	this.num=temp;
    }
    
    public static void swap(CitationTransfer a,CitationTransfer b){
    	int temp=a.getNum();
    	 a.setNum(b.getNum());
    	    b.setNum(temp);
    }
    
    public static void main(String[] args){
    	CitationTransfer a=new CitationTransfer(10);
    	CitationTransfer b=new CitationTransfer(100);
        System.out.println("交换之前a的值为："+a.getNum());
        System.out.println("交换之前b的值为："+b.getNum());
        swap(a,b);
        System.out.println("交换之后a的值为："+a.getNum());
        System.out.println("交换之后b的值为："+b.getNum());
      }
}