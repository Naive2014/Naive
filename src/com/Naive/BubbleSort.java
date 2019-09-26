package com.Naive;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args){
		int[] arr={6,3,8,2,9,1};
		String[] str={"java","python","php","c#","c++","programing","c"};
		System.out.print("排序前数组为：");
		for(int i = 0;i <str.length;i++){
			System.out.print(str[i]+" ");
		}
		System.out.println();
		
		for(int i = 0;i <arr.length;i++){
			for(int j = 0;j <arr.length-1;j++){
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] =temp;
				}
			}
		}
		
		Arrays.sort(str);
		
		System.out.print("排序后数组为：");
		for(int i = 0;i <str.length;i++){
			System.out.print(str[i]+" ");
		}
		System.out.println();
		System.out.print(arr[0]+" "+arr[arr.length-1]);
		
	}
}
