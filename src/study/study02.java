package study;

import java.util.Scanner;

public class study02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码");
        String card = sc.nextLine();
        if (card.length() != 18) {
            System.out.println("身份证号必须是 18 位");
            return;
        }
        String year = card.substring(6,10);
        String month = card.substring(10,12);
        String day = card.substring(12,14);
        System.out.println("个人信息为:");
        System.out.println("出生日期为:" + year + "年" + month + "月" + day + "日");
        char gender = card.charAt(16);
        if((gender-'0') % 2 == 0){
            System.out.println("性别为女");
        }else {
            System.out.println("性别为男");
        }
    }
}
