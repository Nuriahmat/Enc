package com.yah;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Mtest {
	public static void main(String[] args){
		int[] arr = {2,5,100,200,1,4,2,5,100,45,100,678,100};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				int count = map.get(arr[i]);
				map.put(arr[i], count+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		Collection<Integer> co = map.values();
		int maxCount = Collections.max(co);
		int maxNum = 0;
		for(Map.Entry<Integer, Integer> ent : map.entrySet()){
			if(maxCount==ent.getValue()){
				maxNum=ent.getKey();
			}
		}
		System.out.println("Num"+maxNum+"cishi:"+maxCount);
	}

}
