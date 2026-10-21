package number;

public class girlFriend {
    private int age;
    private String gender;
    private String name;
    public girlFriend(){}
    public girlFriend(String name,String gender,int age){
        this.name = name;
        setAge(age);
        this.gender = gender;
    }

    public void setAge(int age){
        if(age >= 18 && age <= 50){
            this.age = age;
        }else{
            System.out.println("非法数据");
        }
    }
    public int getAge(){
        return this.age;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void sleep () {
        System.out.println("sleep");
    }

    public void eat () {
        System.out.println("eat");
    }

}
