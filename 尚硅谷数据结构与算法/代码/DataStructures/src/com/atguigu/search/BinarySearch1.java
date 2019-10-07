package com.atguigu.search;

import java.util.ArrayList;
import java.util.List;

//ע�⣺ʹ�ö��ֲ��ҵ�ǰ���� �������������.
public class BinarySearch1 {

	public static void main(String[] args) {
		int arr[] = { 1, 8, 10, 89,1000,1100, 1234 };
		int resIndex = binarySearch(arr, 0, arr.length - 1, 1000);
		System.out.println("resIndex=" + resIndex);
	}

	// ���ֲ����㷨
	/**
	 * 
	 * @param arr ����
	 * @param left ��ߵ�����
	 * @param right �ұߵ�����
	 * @param findVal Ҫ���ҵ�ֵ
	 * @return ����ҵ��ͷ����±꣬���û���ҵ����ͷ��� -1
	 */
	public static int binarySearch(int[] arr, int left, int right, int findVal) {
		// �� left > right ʱ��˵���ݹ��������飬����û���ҵ�  ����������ݹ�
		if (left > right) {
			return -1;
		}
		int mid = (left + right) / 2;
		int midVal = arr[mid];
		if (findVal > midVal) { // ���ҵݹ�
			return binarySearch(arr, mid + 1, right, findVal);
		} else if (findVal < midVal) { // ����ݹ�
			return binarySearch(arr, left, mid - 1, findVal);
		} else {
			return mid;
		}
	}
}
