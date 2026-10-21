package number;

public class girlFriendTest {
    public static void main(String[] args) {
        girlFriend gf1 = new girlFriend();
        gf1.setAge(18);
        gf1.setGender("女");
        gf1.setName("小美");
        System.out.println(gf1.getName()+"/"+gf1.getAge()+"/"+gf1.getGender());
        gf1.sleep();
        gf1.eat();
        girlFriend gf2 = new girlFriend("小丽","女",20);
        System.out.println(gf2.getName()+"/"+gf2.getGender()+"/"+gf2.getAge());
        



    }
}
