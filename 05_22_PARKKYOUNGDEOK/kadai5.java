package kadai5;

import com.sun.codemodel.internal.JArray;
import jdk.nashorn.internal.ir.WhileNode;
import sun.plugin.javascript.navig.Array;

import java.util.Scanner;

public class kadai5 {
    public static void main(String[] args) {
        System.out.println("ストレス自家診断表");
        System.out.println("自分のストレスの程度をチェックしてみよう。");
        System.out.println("Yes : 1 , No : 0 を入力してください");

        int kotae[] = new int[30];

        int sum = 0 ;


        while(true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("1.よくかぜをひくし、かぜが治りにくい");
                kotae[0] = scanner.nextInt();
            System.out.println("2.手、足が冷たいことが多い");
                kotae[1] = scanner.nextInt();
            System.out.println("3.手のひらや、わきの下に汗をかくことが多い");
                kotae[2] = scanner.nextInt();
            System.out.println("4.急に息苦しくなることがある");
                kotae[3] = scanner.nextInt();
            System.out.println("5.動悸がすることがある");
                kotae[4] = scanner.nextInt();
            System.out.println("6.胸が痛くなることがある");
                kotae[5] = scanner.nextInt();
            System.out.println("7.頭がスッキリしない（頭が重い）");
                kotae[6] = scanner.nextInt();
            System.out.println("8.眼がよく疲れる");
                kotae[7] =scanner.nextInt();
            System.out.println("9.鼻づまりがすることがある");
                kotae[8] = scanner.nextInt();
            System.out.println("10.めまいを感じることがある");
                kotae[9] = scanner.nextInt();
            System.out.println("11.立ちくらみしそうになる");
                kotae[10] = scanner.nextInt();
            System.out.println("12.耳鳴りがすることがある");
                kotae[11] = scanner.nextInt();
            System.out.println("13.口の中が荒れたり、ただれたりする事がよくある");
                kotae[12] = scanner.nextInt();
            System.out.println("14.のどが痛くなることが多い");
                kotae[13] = scanner.nextInt();
            System.out.println("15.舌が白くなっていることがある");
                kotae[14] = scanner.nextInt();
            System.out.println("16.好きなものでも食べる気がしない");
                kotae[15] = scanner.nextInt();
            System.out.println("17.いつも食べ物が胃にもたれるような気がする");
                kotae[16] = scanner.nextInt();
            System.out.println("18.腹が張ったり、痛んだり、下痢や便秘をすることがよくある");
                kotae[17] = scanner.nextInt();
            System.out.println("19.肩がこりやすい");
                kotae[18] = scanner.nextInt();
            System.out.println("20.背中や腰が痛くなることがある");
                kotae[19] = scanner.nextInt();
            System.out.println("21.なかなか疲れが取れない");
                kotae[20] = scanner.nextInt();
            System.out.println("22.このごろ体重が減った");
                kotae[21] = scanner.nextInt();
            System.out.println("23.何かするとすぐに疲れる");
                kotae[22] = scanner.nextInt();
            System.out.println("24.気持ちよく起きられないことがよくある");
                kotae[23] = scanner.nextInt();
            System.out.println("25.仕事をやる気がおこらない");
                kotae[24] = scanner.nextInt();
            System.out.println("26.寝つきが悪い");
                kotae[25] = scanner.nextInt();
            System.out.println("27.夢を見ることが多い");
                kotae[26] = scanner.nextInt();
            System.out.println("28.夜中に目が覚めたあと、なかなか寝付けない");
                kotae[27] = scanner.nextInt();
            System.out.println("29.人と付き合うのがおっくうになってきた");
                kotae[28] = scanner.nextInt();
            System.out.println("30.ちょっとしたことでも腹がたったり、イライラしそうになることが多い");
                kotae[29] = scanner.nextInt();


                if (scanner != {0,1};){
                    System.out.println("dfdfdfdfdf");
                }
            scanner.close();



            for (int i = 0; i < kotae.length; i++) {
               sum  = sum + kotae[i];
            }

            if (16 < sum && sum < 31 ){
                System.out.println("あなたの点数は"+sum+"です。");
                System.out.println("ストレスが大分たまっている状態で、ご自分で不調を感じている方が多いかもしれません。症状によっては、早めに医師やカウンセラーに相談してみることも必要でしょう。");
            }
            else if( 7 < sum && sum < 17  ){
                System.out.println("あなたの点数は"+sum+"です。");
                System.out.println("軽度のストレス状態で心にストレスがたまってきている状態です。睡眠を多めにとったり気分転換を図ったりすることで自分で回復可能な段階です。");
            }
            else if(0 <= sum && sum < 8){
                System.out.println("あなたの点数は"+sum+"です。");
                System.out.println("今のところストレスがほとんどなく問題がありません。このまま健康の維持に努めて下さい。");
            }
            else{
                System.out.println("入力した答えが　０、１じゃありません。");
                System.out.println("０、１しかできないのでまた入力してください");
            }



            if ( kotae.length == 30 ){
                break;
            }

        }

    }
}