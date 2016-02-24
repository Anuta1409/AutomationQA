package com.anna.task1.systemIn;

public class ArgsBack {
      
    public static void argsBack(String[] args){
        
      int i = args.length;
      try {
          while ( i >= 0){
            i--;
            System.out.println(args[i]);
        }
      }catch(ArrayIndexOutOfBoundsException e){}
    }
    
}
