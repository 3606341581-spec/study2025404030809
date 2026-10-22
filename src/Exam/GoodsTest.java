package Exam;

import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("比亚迪",89999,100);
        Goods g2 = new Goods("问界",500000,50);
        Goods g3 = new Goods("小米",199999,30);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for(int i = 0; i < 3; i++){
            Goods goods = arr[i];
            System.out.println(goods.getName()+"的价格为"+goods.getPrice()+",剩余数量为"+goods.getQuantity());
        }


    }
}
