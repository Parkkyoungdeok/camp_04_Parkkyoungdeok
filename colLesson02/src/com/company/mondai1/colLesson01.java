package com.company.mondai1;

import com.sun.tools.classfile.Instruction;

import java.sql.Connection;
import java.util.Scanner;

public class colLesson01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("わからなかった単語とその意味をスペースで区切って入力して下さい。");
        while (true) {
            Word tan = new Word();
            System.out.println("次の単語と意味を入力してください。e で終了します。");
            String exit = scanner.nextLine();
                if (exit.equals("e")) {
                    System.out.println(tan.toString());
                    break;
                }
            }
            System.out.println("2件、登録しました。");


        }


    }



