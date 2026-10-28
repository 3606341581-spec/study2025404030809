package study;
import java.util.Scanner;
public class study01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while(true){
            System.out.println("请输入金额");
            money = sc.nextInt();
            if(money >= 0 && money <= 9999999){
                break;
            }else{
                System.out.println("金额不符合");
            }
        }
        String Money = "";
        while(true){
            int ge = money % 10;
            String capital = getCapitalNumber(ge);
            Money = capital + Money;
            money = money / 10;
            if(money == 0){
                break;
            }
        }
        int count = 7 - Money.length();
        for(int i = 0; i < count; i ++){
            Money = "零" + Money;
        }
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for(int i = 0; i < Money.length(); i ++){
            char c = Money.charAt(i);
            System.out.print(c);
            System.out.print(arr[i]);
        }
    }
    public static String getCapitalNumber(int number){
        String[] arr = {"零","壹","贰","叄","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
