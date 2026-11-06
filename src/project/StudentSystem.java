package project;
//学生选课系统
import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void studentMenu(ArrayList<Student> list,Scanner sc){
        //打印选项
        loop:while (true) {
            System.out.println("欢迎来到学生选课系统");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择");
            //switch语句做出选择
            String choose = sc.next();
            switch(choose){
                case "1" -> addStudent(list,sc);
                case "2" -> deleteStudent(list,sc);
                case "3" -> updateStudent(list,sc);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("输入错误,请重试");
            }
        }
    }

    //添加学生方法
    public static void addStudent(ArrayList<Student> list,Scanner sc){
        Student stu = new Student();

        System.out.println("请添加学生id");
        String id = sc.next();
        if(flag(list,id)){
            System.out.println("id重复,添加失败");
            return;
        }
        stu.setId(id);

        System.out.println("请添加学生姓名");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入学生家庭地址");
        String address = sc.next();
        stu.setAddress(address);
        //将学生对象添加进集合
        list.add(stu);

    }

    //删除学生方法
    public static void deleteStudent(ArrayList<Student> list,Scanner sc){
        System.out.println("请输入要删除的id");
        String id = sc.next();
        boolean flag = flag(list,id);
        if(flag){
            delete(list,id);
            System.out.println("删除学生成功");
        }else{
            System.out.println("不存在当前学生id,请重试");
        }
    }

    //修改学生方法
    public static void updateStudent(ArrayList<Student> list,Scanner sc){
        if (list.size() == 0) {
            System.out.println("当前无学生信息");
            return;
        }
        System.out.println("请输入要更改的学生id");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(stu.getId().equals(id)){
                System.out.println("找到了该学生,请按照要求更改");

                System.out.println("请输入新学生id");
                String id1 = sc.next();
                stu.setId(id1);

                System.out.println("请输入新学生姓名");
                String name = sc.next();
                stu.setName(name);

                System.out.println("请输入新学生年龄");
                int age = sc.nextInt();
                stu.setAge(age);

                System.out.println("请输入新学生家庭地址");
                String address = sc.next();
                stu.setAddress(address);

                System.out.println("修改完毕");
                return;
            }
        }
        System.out.println("无当前学生,请重试");
    }

    //查询学生方法
    public static void queryStudent(ArrayList<Student> list) {
        //如果没有数据,则重试
        if (list.size() == 0) {
            System.out.println("当前无学生信息,请退出重试");
            return;
        }
        //如果有数据,则打印集合
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
        System.out.println("查询完毕");
    }

    //检验是否有id
    public static boolean flag(ArrayList<Student> list,String id){
        for(int i = 0; i < list.size(); i++){
            Student stu = list.get(i);
            if(stu.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    //删除id
    public static void delete(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            boolean flag = stu.getId().equals(id);
            if(flag){
                list.remove(i);
                return;
            }
        }
    }

}
