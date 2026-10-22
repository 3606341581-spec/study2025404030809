package Exam;

public class Student {
    private String name;
    private int age;
    private int id;

    public Student(){
    }
    public Student(String name,int age,int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }



}
