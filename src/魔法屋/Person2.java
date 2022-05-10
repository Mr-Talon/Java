package 魔法屋;

public class Person2 extends Person {
    private char sex;
    Person2(int h,char sex){
        super(h);
        this.sex=sex;
    }
    String getSex() {
        if (sex=='F'||sex=='f'){
            return "女生";
        }
        else {
            return "男生";
        }
    }
    public void changeHeightByMachine(MagicMachine machine,Person2 p){
        this.height+= machine.changeHeightBySex(p);
    }
}
