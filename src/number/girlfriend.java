package number;

public class girlfriend {
    private int age;
    public void setAge(int a){
        if(a >= 18 && a <= 50){
            age = a;
        }else{
            System.out.println("非法数据");
        }

    }
    public int getAge(){
        return age;
    }
}
