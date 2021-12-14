package edu.cscc;

import java.util.Comparator;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        // Add custom comparator that reverses order of keys
        // Standard String comparator: returns 0 if o1 & o2 are equal
        // returns negative if o1 should precede o2 and
        // returns positive if o1 should follow o2 in ordering
        //
        // Negating the result reverses the ordering
        TreeMap<String,String> capitals = new TreeMap<>(new Comparator<String>()
        {
            public int compare(String o1, String o2) {
                int i = o1.compareTo(o2);
                return -(i);
            }
        }
        );

        capitals.put("United States","Washington, DC");
        capitals.put("United Kingdom","London");
        capitals.put("Canada","Ottawa");
        capitals.put("Brazil","Brasilia");
        capitals.put("Kenya","Nairobi");
        capitals.put("Australia","Canberra");
        capitals.put("Japan","Tokyo");
        capitals.put("France","Paris");
        capitals.put("Russia","Moscow");
        capitals.put("India","New Delhi");
        capitals.put("Spain","Madrid");
        capitals.put("China","Beijing");

        for (String country : capitals.keySet()) {
            System.out.println("The capital of "+country+" is "+capitals.get(country));
        }
    }
}
