package com.bridgelabz.generics;

public class Generics {

  public String maximum(String a, String b, String c){
      String max = a;

      if(b.compareTo(a) > 0){
          max = b;
      }else if (c.compareTo(max) > 0){
          max = c;
      }
      return max;
  }
}
