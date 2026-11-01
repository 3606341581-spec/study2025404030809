package study;
//根据id找索引
import java.util.ArrayList;

public class study08Test {
    static void main() {
        study08 stu1 = new study08("zhangsan",111,18);
        study08 stu2 = new study08("lisi",222,19);
        study08 stu3 = new study08("wangwu",333,20);
        ArrayList<study08> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        int num = getInfoArrayList(list,150);
        System.out.println(num);


    }

    public static int getInfoArrayList(ArrayList<study08> list,int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}