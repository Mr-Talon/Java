package 魔法屋;

public class Person3 extends Person2{
    private int money=0;
    Person3(int h,char sex,int money){
        super(h,sex);
        this.money=money;
    }

    int getMoney(){
        return this.money;
    }

    void cost(int m){
        this.money-=m;
    }

    void addMoney(int m){
        this.money+=m;
    }

    public void changeHeightByMachineForSVIp(MagicMachine machine,Person3 p,int change ,int model){
        try{
            this.height+= machine.changeHeightForSVIP(p,change,model);
        }
        catch (NoMoneyException e){
            System.out.println(e.toString());
        }
        catch (ModelException e){
            System.out.println(e.toString());
        }
    }
}
