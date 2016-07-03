package com.jason.caipiao;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Integer[] is = { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31 };
//		Integer[] is = {15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
//				27, 28, 29, 30, 31,32,33};
		List<List<Integer>> lst = new ArrayList<List<Integer>>();
		for (int i1 = 0; i1 < is.length - 5; i1++) {
			for (int i2 = i1 + 1; i2 < is.length - 4; i2++) {
				for (int i3 = i2 + 1; i3 < is.length - 3; i3++) {
					for (int i4 = i3 + 1; i4 < is.length - 2; i4++) {
						for (int i5 = i4 + 1; i5 < is.length - 1; i5++) {
							for (int i6 = i5 + 1; i6 < is.length; i6++) {
								List<Integer> s1 = new ArrayList<Integer>();
								s1.add(is[i1]);
								s1.add(is[i2]);
								s1.add(is[i3]);
								s1.add(is[i4]);
								s1.add(is[i5]);
								s1.add(is[i6]);
								lst.add(s1);
							}
						}
					}
				}
			}
		}
		System.out.println(lst.size());
	}
}
