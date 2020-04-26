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

//        languages.remove("Algol");
if(languages.remove("Algol","Algol language")){
    System.out.println("Algol removed");
}else{
    System.out.println("Algol not removed");
}
if(languages.replace("Python" , "This will not work" , "python language")){
    System.out.println("Python was replaced");
}else{
    System.out.println("Python was not replaced");
}
        for (String key:languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }

}
