package com.company.mondai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class colLesson01 {
    public static void main(String[] args) {
        //String[][] abc = new String[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
        //{Words(word = "apple" , meaning = "りんご"),....}
        ArrayList <Word> inputs = new ArrayList<Word>();

        //words[0].word = "apple";
        //words[0].meaning = "りんご";
        int count = 0;
        try {
            while (count < 10) {

                String input = sc.nextLine();
                if(count >= 5){
                    throw new Exception();
                }
                String[] wordandmeaning = input.split(" "); // {"apple","りんご"}

                if ("e".equals(input)) {
                    break;
                }

                Word word = new Word(wordandmeaning[0], wordandmeaning[1]); // Wordのインスタンス化 : word = "apple" , meaning=  "りんご"

                inputs.add(word);
                count++;

                System.out.println("次の単語と意味を入力してください。e で終了します。");
            }
            for (int i = 0; i < count; i++) {
                System.out.println(inputs.get(i).toString());
            }
            System.out.println(count + "件登録しました。");
        } catch (Exception e) {
            System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
            for (int i = 0; i < count; i++) {
                System.out.println(inputs.get(i).toString());
            }
            System.out.println(count + "件登録しました。");
        }


    }
}



