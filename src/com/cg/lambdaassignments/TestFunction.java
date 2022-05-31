package com.cg.lambdassignment;

import java.util.function.Function;
import java.util.function.Supplier;

public class TestFunction {

	public static void main(String[] args) {
		 int n = 5;
		    modifyTheValue(n, val-> val + 10);
		    modifyTheValue(n, val-> val * 100);
		  }

		  static void modifyTheValue(int v, Function<Integer, Integer> function){
		    int result = function.apply(v);
		    System.out.println(result);
		  }

		  
	}


