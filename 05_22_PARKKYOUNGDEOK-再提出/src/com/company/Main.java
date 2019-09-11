package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                System.out.println("ストレス自家診断表");
                System.out.println("自分のストレスの程度をチェックしてみよう。");
                System.out.println("Yes : 1 , No : 0 を入力してください");

                String situmon[] = new String[10];
                int kotae[] = new int[10];

                situmon[0] = "1.よくかぜをひくし、かぜが治りにくい";
                situmon[1] = "2.手、足が冷たいことが多い";
                situmon[2] = "3.手のひらや、わきの下に汗をかくことが多い";
                situmon[3] = "4.急に息苦しくなることがある";
                situmon[4] = "5.動悸がすることがある";
                situmon[5] = "6.胸が痛くなることがある";
                situmon[6] = "7.頭がスッキリしない（頭が重い";
                situmon[7] = "8.眼がよく疲れる";
                situmon[8] = "9.鼻づまりがすることがある";
                situmon[9] = "10.めまいを感じることがある";




        int sum = 0;


                while (true) {
                    Scanner scanner = new Scanner(System.in);

                    for (int i = 0; i < kotae.length; i++){
                        System.out.println(situmon[i]);
                        kotae[i] = scanner.nextInt();
                    }


                for (int i = 0; i < kotae.length; i++) {
                    sum = sum + kotae[i];
                }

                if (8 < sum && sum < 11) {
                    System.out.println("あなたの点数は" + sum + "です。");
                    System.out.println("ストレスが大分たまっている状態で、ご自分で不調を感じている方が多いかもしれません。症状によっては、早めに医師やカウンセラーに相談してみることも必要でしょう。");
                } else if (5 < sum && sum < 9) {
                    System.out.println("あなたの点数は" + sum + "です。");
                    System.out.println("軽度のストレス状態で心にストレスがたまってきている状態です。睡眠を多めにとったり気分転換を図ったりすることで自分で回復可能な段階です。");
                } else if (0 <= sum && sum < 6) {
                    System.out.println("あなたの点数は" + sum + "です。");
                    System.out.println("今のところストレスがほとんどなく問題がありません。このまま健康の維持に努めて下さい。");
                } else {
                    System.out.println("入力した答えが　０、１じゃありません。");
                    System.out.println("０、１しかできないのでまた入力してください");
                }


                if (kotae.length == 10) {
                    break;
                }

            }
        }
    }
