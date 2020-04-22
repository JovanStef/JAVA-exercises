package com.company.Scope;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String , String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        }else{
            languages.put("Java" , "Java language");
            System.out.println("Java added successfully");
        }

        languages.put("Python" , "python language");
        languages.put("Algol" , "Algol language");
        languages.put("Java" , "Java language");

        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        }else{
            languages.put("Java" , "Java language");
        }

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        for (String key:languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }

}
