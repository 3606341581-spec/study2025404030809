package Game;
import java.util.Random;
public class Role {
    private String name;
    private char gender;
    private String face;
    private int blood;

    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};

    //attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };


    public Role(){
    }

    public Role(String name, char gender, int blood){
        this.blood = blood;
        this.gender = gender;
        this.name = name;
        setFace(gender);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }

    public void setFace(char gender){
        Random r = new Random();
        if(gender == '男'){
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];

        }
    }
    public String getFace(){
        return this.face;
    }

    public void setBlood(int blood){
        this.blood = blood;
    }
    public int getBlood(){
        return this.blood;
    }
    //role r1 = new role;
    //role r2 = new role;
    //r1.attack(r2);

    public void showRoleInfo(){
        System.out.println(getName() + "的属性:性别为:" + getGender() + ",长相为:" + getFace() + ",血量为:" + getBlood());
    }
    public void attack(Role role){
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String kongfu = attacks_desc[index];
        System.out.printf(kongfu,this.getName(),role.getName());
        System.out.println();
        int hurt = r.nextInt(30) + 1;
            int HP = role.getBlood() - hurt;
            HP = HP < 0 ? 0 : HP;
            role.setBlood(HP);
        System.out.println(this.getName() + "对" + role.getName() + "造成了" + hurt + "点伤害,剩余血量为" + HP);
        if(HP > 90){
                System.out.printf(injureds_desc[0],role.getName());
            }else if(HP > 80 && HP <= 90){
            System.out.printf(injureds_desc[1],role.getName());
            }else if(HP > 70 && HP <= 80){
            System.out.printf(injureds_desc[2],role.getName());
            }else if(HP > 60 && HP <= 70){
            System.out.printf(injureds_desc[3],role.getName());
            }else if(HP > 40 && HP <= 60){
            System.out.printf(injureds_desc[4],role.getName());
            }else if(HP > 20 && HP <= 40){
            System.out.printf(injureds_desc[5],role.getName());
            }else if(HP > 0 && HP <= 20){
            System.out.printf(injureds_desc[6],role.getName());
            }else if(HP == 0){
            System.out.printf(injureds_desc[7],role.getName());
            }
            System.out.println();


    }



}
