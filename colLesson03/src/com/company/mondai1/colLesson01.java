package com.company.mondai1;

import com.sun.tools.classfile.Instruction;

import java.sql.Connection;
import java.util.Scanner;

public class colLesson01 {
    public static void main(String[] args) {

       try{ while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
            Word tan1 = new Word();
            System.out.println("次の単語と意味を入力してください。e で終了します。");
            Word tan2 = new Word();
            System.out.println("次の単語と意味を入力してください。e で終了します。");

            while(true){
                String input = scanner.nextLine();

                if (input.equals("e")) {
                    System.out.println(tan1.toString());
                    System.out.println(tan2.toString());
                    break;
                }
            }
            System.out.println("2件、登録しました。");


        }}catch (Exception e){
           System.out.println("登録制限を越えました。登録済みテータ以下になります。");
       }

        }
    }



