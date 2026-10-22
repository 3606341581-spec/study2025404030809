package Exam;

import java.util.Scanner;

public class GoodsTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Goods[] arr = new Goods[3];
        for (int i = 0; i < 3; i++) {
            Goods g1 = new Goods();
            System.out.println("请输入名字");
            String bound = sc.next();
            g1.setName(bound);
            System.out.println("请输入价格");
            int price = sc.nextInt();
            g1.setPrice(price);
            System.out.println("请输入数量");
            int quantity = sc.nextInt();
            g1.setQuantity(quantity);
            arr[i] = g1;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i].getName()+"的价格为"+arr[i].getPrice()+"剩余数量为"+arr[i].getQuantity());
        }
    }
}