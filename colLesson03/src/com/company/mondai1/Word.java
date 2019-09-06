package com.company.mondai1;

import java.util.Scanner;

public class Word {

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String[] tango1 = input.split(" ",0);


public Word(){

    }



   @Override
    public String  toString(){
       return "単語：" + tango1[0] + "意味：" + tango1[1];
   }
}
