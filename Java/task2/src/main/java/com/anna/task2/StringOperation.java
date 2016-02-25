package com.anna.task2;

import java.util.ArrayList;
import java.util.Scanner;


public class StringOperation {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> stringList = new ArrayList<String>();
    
    public static void ShortLongNumber(){
        int number;
        String numbStr;
        System.out.println("Write numbers due spase. For end programm enter stop: ");
        
        
        while(scan.hasNextInt()==true){
            number = scan.nextInt();
            numbStr = Integer.toString(number);
            stringList.add(numbStr);
            System.out.println(stringList.toString());
        }
        
        int minLenght = stringList.get(0).length();
        int maxLenght = stringList.get(0).length();
        String minvalue = stringList.get(0);
        String maxvalue = stringList.get(0);
        for(int i = 0; i < stringList.size(); i++){
            if(maxLenght < stringList.get(i).length()){
                maxLenght = stringList.get(i).length();
                maxvalue = stringList.get(i);
            }
            
            if(minLenght > stringList.get(i).length()){
                minLenght = stringList.get(i).length();
                minvalue = stringList.get(i);
            }
            
        }
        System.out.println("MaxLenght: " + maxvalue + "; "+ maxLenght);
        System.out.println("MinLenght: " + minvalue + "; "+ minLenght);
        
        
        
    }
    
}
