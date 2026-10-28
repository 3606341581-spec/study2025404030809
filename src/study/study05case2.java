package study;
//输入阿拉伯数字转化为罗马数字
import java.util.Scanner;

public class study05case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while(true){
            System.out.println("请输入一个字符串");
            str = sc.next();
            boolean flag = checkStr(str);
            if(flag){
                break;
            }else{
                System.out.println("当前字符串不符合规则");
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;
            String roma = roma(number);
            sb.append(roma);
        }
        System.out.println(sb);

    }

    public static String roma(int number) {
        String str;
       switch(number){
           case 0 -> str = "";
           case 1 -> str = "I";
           case 2 -> str = "II";
           case 3 -> str = "III";
           case 4 -> str = "IV";
           case 5 -> str = "V";
           case 6 -> str = "VI";
           case 7 -> str = "VII";
           case 8 -> str = "VIII";
           case 9 -> str = "IX";
           default -> str = "";
       }
       return str;
    }

    public static boolean checkStr(String str){
        if(str.length() > 9){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
