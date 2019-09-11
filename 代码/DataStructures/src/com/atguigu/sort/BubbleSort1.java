package com.atguigu.sort;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class BubbleSort1 {
	public static void main(String[] args) {
		int arr[]= {1,8,4,2,6};
		int temp=0;
		System.out.println(arr.length);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	

}
