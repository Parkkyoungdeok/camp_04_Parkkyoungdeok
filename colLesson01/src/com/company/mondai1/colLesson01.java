package com.company.mondai1;

import java.util.Scanner;

public class colLesson01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] word = new String[5];
        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
        while(true) {
            String input = sc.nextLine();
            String[] inputs = input.split(" ");
            System.out.println("次の単語と意味を入力してください。e で終了します。");
            if (input.equals("e")){
            for (int i = 0; i < inputs.length; i++) {
                System.out.println(inputs[i]);
            }break;
            }

        }

    }

}



