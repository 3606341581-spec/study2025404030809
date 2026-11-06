package project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserTest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        //打印菜单
        while (true) {
            System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作");
        System.out.println("1.登录");
        System.out.println("2.注册");
        System.out.println("3.忘记密码");
        System.out.println("4.退出");
        String choose = sc.next();
            switch (choose) {
                case "1" -> {
                    if (login(users, sc)) {
                        StudentSystem.studentMenu(students, sc);
                    }
                }
                case "2" -> register(users, sc);
                case "3" -> forgot(users, sc);
                case "4" -> {return;}
                default -> System.out.println("输入有误，请输入 1~4");
            }
        }
    }

    //注册
    public static void register(ArrayList<User> list, Scanner sc) {
        User us = new User();
        System.out.println("请输入用户名(长度3-15位,并且要含有字母)");
        String name = sc.next();
        //判断用户名是否重复
        boolean flag = contains(list, name);
        if (flag) {
            System.out.println("用户名已存在,请重新尝试");
            return;
        }//验证用户名长度
        else if (name.length() < 3 || name.length() > 15) {
            System.out.println("用户名长度不符合,请重试");
            return;
        }//如果用户名规格不符则重试,正确则进入下一步
        else if (!containsusername(name)) {
            System.out.println("用户名规格不符合,请重试");
            return;
        }
        //录入用户名
        us.setUsername(name);
        System.out.println("用户名可注册,请输入密码");
        String password = sc.next();
        System.out.println("请再次输入密码");
        String password1 = sc.next();
        //对比两次密码,错误则重试,正确则进入下一步
        if (!password.equals(password1)) {
            System.out.println("两次密码不相同,请重试");
            return;
        }
        us.setPassword(password);
        System.out.println("录入密码成功");
        System.out.println("进行身份证验证");
        System.out.println("请输入身份证号");
        String idcard = sc.next();
        //如果身份证不符合则重试,正确则进入下一步
        if (!idcard(idcard)) {
            System.out.println("身份证输入错误,请重试");
            return;
        }
        //录入身份证
        us.setIdcard(idcard);
        System.out.println("录入身份证成功");
        System.out.println("请输入电话号码");
        String number = sc.next();
        //身份证错误则退出,正确则进入下一步
        if (!containsphonenumber(number)) {
            System.out.println("电话号码错误,请重试");
            return;
        }
        us.setPhonenumber(number);
        System.out.println("录入电话号码成功");
        list.add(us);
        System.out.println("注册成功");
    }

    //登录
    public static boolean login(ArrayList<User> list, Scanner sc) {
        int count = 0;
        System.out.println("请输入用户名");
        String name = sc.next();
        if (!contains(list, name)) {
            System.out.println("无当前用户名,请重试");
            return false;
        }
        String code = code();
        while (true) {
            System.out.println("验证码为:" + code + ",请输入验证码");
            String code1 = sc.next();
            if (!code.equals(code1)) {
                System.out.println("验证码错误,请重试");
            } else {
                System.out.println("验证成功");
                break;
            }
        }
        while (true) {
            System.out.println("请输入密码");
            String password = sc.next();
            if (!containspassword(list, name, password)) {
                System.out.println("密码错误,请重试");
                count++;
                if (count >= 3) {
                    System.out.println("密码错误3次,账户已锁定");
                    return false;
                }
                System.out.println("还剩余" + (3 - count) + "次机会");
            } else {
                System.out.println("登陆成功");
                return true;
            }
        }
    }


    //忘记密码
    public static void forgot(ArrayList<User> list, Scanner sc) {
        System.out.println("请输入用户名");
        String name = sc.next();
        if (!contains(list, name)) {
            System.out.println("无当前用户名,请重试");
            return;
        }
        System.out.println("请输入身份证");
        String idcard = sc.next();
        System.out.println("请输入电话号码");
        String number = sc.next();
        for (int i = 0; i < list.size(); i++) {
            User us = list.get(i);
            if (us.getUsername().equals(name)) {
                if (!us.getIdcard().equals(idcard)) {
                    System.out.println("身份证输入错误,请重试");
                    return;
                }
                if (!us.getPhonenumber().equals(number)) {
                    System.out.println("手机号码输入错误,请重试");
                    return;
                }
                System.out.println("身份验证成功,请输入新的密码");
                String newpassword = sc.next();
                us.setPassword(newpassword);
                System.out.println("密码更改成功,请前往登录");
                return;
            }
        }
    }

    //查询是否存在相同用户名
    public static boolean contains(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            User us = list.get(i);
            if (us.getUsername().equals(name)) {
                return true;
            }
        }
        return false;
    }

    //查询用户名是否为纯数字
    public static boolean containsusername(String name) {
        char[] arr = name.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) {
                count++;
            } else if (arr[i] >= '0' && arr[i] <= '9') {
            } else {
                return false;
            }
        }
        if (count > 0) {
            return true;
        }
        return false;
    }

    //判断身份证是否正确
    public static boolean idcard(String idcard) {
        char[] arr = idcard.toCharArray();
        if (idcard.length() != 18) {
            return false;
        }
        if (idcard.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < 17; i++) {
            if (arr[i] < '0' || arr[i] > '9') {
                return false;
            }
        }
        if ((arr[17] >= '0' && arr[17] <= '9') || arr[17] == 'x' || arr[17] == 'X') {
            return true;
        }
        return false;
    }

    //判断手机号码是否正确
    public static boolean containsphonenumber(String number) {
        //判断号码是否为十一位
        if (number.length() == 11) {
            char[] arr = number.toCharArray();
            //判断首位是否为0
            if (arr[0] == '0') {
                return false;
            }//判断是否每位都是数字
            else {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < '0' || arr[i] > '9') {
                        return false;
                    }
                }
                return true;
            }
        } else {
            return false;
        }
    }

    //判断密码是否正确
    public static boolean containspassword(ArrayList<User> list, String name, String password) {
        for (int i = 0; i < list.size(); i++) {
            User us = list.get(i);
            if (us.getUsername().equals(name)) {
                if (us.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }

    //获取验证码
    public static String code() {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] arr1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Random r = new Random();
        int number = r.nextInt(10);
        //获取随机数放置数字
        int position = r.nextInt(5);
        char[] arr2 = new char[5];
        //获取验证码
        for (int i = 0; i < arr2.length; i++) {
            int letter = r.nextInt(52);
            arr2[i] = arr[letter];
        }
        arr2[position] = arr1[number];
        String code = new String(arr2);
        return code;
    }
}



