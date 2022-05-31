package com.cg.lambdassignment;


import java.util.ArrayList;
import java.util.List;

public class OddLength {
    public static void main(String[] args) {
        List<String> Names=new ArrayList<>();
        Names.add("Ramya");
        Names.add("Sasi");
        Names.add("Keerthi");
        Names.add("Kavya");
        Names.add("Pravina");
        
        
        Names.removeIf(s ->(s.length())%2!=0);

        for (String n : Names) {
            System.out.println(n);
        }

    }
}


