package com.cg.lambdassignment;


import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValue {
	public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(33 ,"Navya ");
        map.put(10 ,"Ramya ");
        map.put(28 ,"Veena ");


        StringBuilder result=new StringBuilder();

        map.forEach((k, v) -> result.append(k).append(v));
        System.out.println("Result String is : "+result);
        
    }
	
}

