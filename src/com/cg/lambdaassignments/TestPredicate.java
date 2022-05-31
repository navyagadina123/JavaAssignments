package com.cg.lambdassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPredicate {
	/*Predicate<String> isALongWord = new Predicate<String>() {
    @Override
    public boolean test(String t) {
        return t.length() > 10;
    }
  };
    String s = "successfully";
   boolean result = isALongWord.test(s);*/
	
	Predicate<String> isALongWord = t -> t.length() > 10;
	String s = "successfully";
	boolean result = isALongWord.test(s);
	public static void main(String[] args) {
		 List<String> l = new ArrayList<>();
		    l.add("successfully");
		    l.add("easy");
		    l.add("fortune");
		    List<String> filtered = l.stream().filter( s -> s.length() > 5 ).collect(Collectors.<String>toList());
		    System.out.println(filtered);

	}

}
