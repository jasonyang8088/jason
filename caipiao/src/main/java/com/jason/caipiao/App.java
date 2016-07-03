package com.jason.caipiao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Integer[] is = { 5, 7, 8, 13, 14, 15, 17, 18, 19, 21, 22, 23, 24,  26,
				27, 28, 30, 31,32};
		Integer[] lianhao={0,1,2};
		List<Integer> lstLianHao=new ArrayList<Integer>();
		Collections.addAll(lstLianHao, lianhao);
		
		Integer[] contain ={18,19,20,21,22,23,24,25};
		List<Integer> lstContains=new ArrayList<Integer>();
		Collections.addAll(lstContains, contain);
		
		Integer[] contain1 ={7,8,9,10,11,12,13,14,15};
		List<Integer> lstContains1=new ArrayList<Integer>();
		Collections.addAll(lstContains1, contain1);
		
	
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
		Iterator<List<Integer>> it=lst.iterator();
		while(it.hasNext()){
			Boolean b =false;
			List<Integer> s =it.next();
	
			if(b||!mustContain(s, lstContains))b=true;
			if(b||!mustContain(s, lstContains1))b=true;
			if(b||qujian(s,3,1,2))b=true;
			if(b||qujian(s,0,0,6))b=true;
			if(b||qujian(s,0,6,0))b=true;
			if(b||qujian(s,6,0,0))b=true;
			if(b||qujian(s,0,1,5))b=true;
			if(b||qujian(s,1,1,4))b=true;
			if(b||qujian(s,2,1,3))b=true;
			if(b||qujian(s,3,1,2))b=true;
			if(b||qujian(s,4,1,1))b=true;
			if(b||qujian(s,5,1,0))b=true;
			if(b||removeji(s,0))b=true;
			if(b||removeji(s,5))b=true;
			if(b||removeji(s,6))b=true;
			if(b||removeda(s,2))b=true;
			if(b||removeda(s,0))b=true;
			if(b||removeda(s,6))b=true;
			if(b||!hezhi(s, 70,150))b=true;
			if(b||hezhi(s, 80,89))b=true;
			if(b||!weizhi(s, 14,35))b=true;
			if(b||weizhi(s, 27,27))b=true;
			if(b||!lianhao(s,lstLianHao))b=true;
			if(b)it.remove();
		}
		println(lst);
	}

	public static Boolean removeji(List<Integer> list, Integer ji) {
		Integer j = 0;
		for (Integer i : list) {
			if (i % 2 != 0)
				j++;
		}
		if (j == ji) {
			return true;
		} else {
			return false;
		}
	}
	public static Boolean removeda(List<Integer> list, Integer temp) {
		Integer j = 0;
		for (Integer i : list) {
			if (i>16)
				j++;
		}
		if (j ==temp) {
			return true;
		} else {
			return false;
		}
	}
	public static Boolean mustContain(List<Integer> list,List<Integer>  c1){
		for(Integer i:list){
			for(int j=0;j<c1.size();j++){
				if(i==c1.get(j))return true;
			}
		}
		return false;
	}
	
	public static Boolean lianhao(List<Integer> list,List<Integer> lian){
		Integer lianhao =0;
		for(int i=0;i<list.size()-1;i++){
			if(list.get(i+1)==list.get(i)+1)lianhao++;
		}
		for(Integer i1:lian){
			if(i1==lianhao)return true;
		}
		return false;
	}
	
	public static Boolean hezhi(List<Integer> list,Integer small,Integer big){
		Integer sum =0;
		for(int i=0;i<list.size()-1;i++){
			sum=sum+list.get(i);
		}
		if(sum>=small&&sum<=big){
			return true;
		}
		return false;
	}
	
	public static Boolean weizhi(List<Integer> list,Integer small,Integer big){
		Integer sum =0;
		for(int i=0;i<list.size()-1;i++){
			sum=sum+(list.get(i))%10;
		}
		if(sum>=small&&sum<=big){
			return true;
		}
		return false;
	}
	
	public static Boolean qujian(List<Integer> list,Integer i1,Integer i2,Integer i3){
		Integer t1=0;
		Integer t2=0;
		Integer t3=0;
		Integer[] c1 ={1,2,3,4,5,6,7,8,9,10,11};
		List<Integer> lst1=new ArrayList<Integer>();
		Collections.addAll(lst1, c1);
		
		Integer[] c2 ={12,13,14,15,16,17,18,19,20,21,22};
		List<Integer> lst2=new ArrayList<Integer>();
		Collections.addAll(lst2, c2);
		
		Integer[] c3 ={23,24,25,26,27,28,29,30,31,32,32};
		List<Integer> lst3=new ArrayList<Integer>();
		Collections.addAll(lst3, c3);
		for(int i=0;i<list.size();i++){
			if(lst1.contains(list.get(i)))t1++;
			if(lst2.contains(list.get(i)))t2++;
			if(lst3.contains(list.get(i)))t2++;
		}
		if(i1==t1&&i2==t2&&i3==t3)return true;
		return false;
	}
	
	public static void println(List<List<Integer>> lst){
		System.out.println("总投注数为："+lst.size());
		for(List<Integer> list:lst){
			System.out.println(Arrays.toString(list.toArray()));
		}
	}
}
