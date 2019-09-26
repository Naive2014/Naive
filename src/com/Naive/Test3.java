package com.Naive;
/**
 * 乘法表
 * @author Naive
 *
 */
public class Test3 {
	public Test3(){
		
	}
	
	public void MultiplicationTable1(){
		int sum=0;//左下三角形
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=i; j++) {
				sum=i*j;
				System.out.print(i+"*"+j+"="+sum+"\t");
			}
			System.out.println();
		}
		//System.out.println();
	}
	
	public void MultiplicationTable2(){
		int sum=0;//左上三角形
		for(int i = 9; i >=1; i--){
			for(int j = 1; j <=i; j++){
				sum=i*j;
				System.out.print(i+"*"+j+"="+sum+"\t");
			}
			System.out.println();
		}
	}
	
	public void MultiplicationTable3(){
		int sum=0;//右上三角形
		for(int i = 9; i >=1; i--){
			for(int j = i-1; j >=1; j--){
				System.out.print("\t");
			}
			for(int j = 9; j >=i; j--){
				sum=i*j;
				System.out.print(i+"*"+j+"="+sum+"\t");
			}
			System.out.println();
		}
	}
	
	public void MultiplicationTable4(){
		int sum=0;//右下三角形
		for(int i = 1; i <=9; i++){
			for(int j = 9; j >=i; j--){
				sum=i*j;
				System.out.print(i+"*"+j+"="+sum+"\t");
			}
			System.out.println();
		}
	}
}
