package com.anna.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class OrderArrayByLenght {
    public static void orderArrayByLenght() {
        System.out.println("Write numbers due spase. For end programm enter stop:");
        
        Scanner scan = new Scanner(System.in);
        Map<Integer, String>hashMap = new HashMap<Integer, String>();
        String numbStr;
        int number;
        int lenghtStr;
        
        while(scan.hasNextInt()){
            number = scan.nextInt();
            numbStr = Integer.toString(number);
            lenghtStr = numbStr.length();
            hashMap.put(lenghtStr, numbStr);//
            System.out.println(hashMap.toString());
        }
        
        
//       Map<Integer, String> treeMap = new TreeMap<Integer, String>(hashMap);
//       for(int key : treeMap.keySet()){
//             System.out.println(treeMap.toString()); 
//       }
    }
    
    
}
