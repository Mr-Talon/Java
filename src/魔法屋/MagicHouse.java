package 魔法屋;

public class MagicHouse {
    private MagicMachine machine;
    private Bread[] bds;
    MagicHouse(int numOfBreads){
        machine= new MagicMachine();
        bds=new Bread[numOfBreads];
        for (int i=0;i<numOfBreads;i++){
            bds[i]=new Bread();
        }
    }
    MagicMachine getMachine(){
        return this.machine;
    }
    Bread getBd(int i){
        return bds[i];
    }
    public static void main(String [] args){
        MagicHouse house=new MagicHouse(5);
        Person3 xiaoming=new Person3(192,'m',0);
        System.out.println("####################\n“魔法屋的故事”续集2---魔法机器里的惊魂一刻!\n####################\n");
        System.out.println("老板：欢迎光临魔法屋！\n老板：好久不见，怎么？还想长高啊？！\n小明：不不，我想变矮一点可以吗？\n老板：可以啊，刚推出的服务，不过要超级VIP会员才可以享受欧！现在注册就送两个50元的红包。\n小明：多少钱变矮？\n老板：高矮一个价：男生每厘米10元，女生每厘米5元。\n小明：贵了点，不过有了100元，我正好减10厘米。\n===========\n进入魔法屋前\n小明的身高是："
                +xiaoming.getHeight()+"厘米\n");
        System.out.println("===========\n小明使用魔法机器\n**********************\n魔法机器：尊贵的超级VIP，感谢您体验魔法机器\n魔法机器：超级VIP可以享受定制的增高或降低服务\n魔法机器：本次服务将收取费用：100元\n");
        xiaoming.changeHeightByMachineForSVIp(house.machine,xiaoming,10,2);
        System.out.println("========\n紧急呼叫老板，魔法机器里面卡人了。。。\n小明：救命啊！！！！！！！我被卡在机器里面了！！！\n========\n老板打开机器，把小明拽了出来。\n小明：吓坏我了，什么破机器啊这是。\n老板拿出尺子量了量，小明的身高是："
                +xiaoming.getHeight()+"厘米\n");
        System.out.println("老板：还好身高没变，实在抱歉。。。\n老板：麻烦您查看一下账户余额，谢谢\n小明：好\n账户余额："
                +xiaoming.getMoney()+"元");
        System.out.println("老板：啊，没钱你变个啥啊？\n小明：哦，我忘记把红包充值进去了。。。\n老板：原来是这样，不好意思，让您受惊了\n老板：为了表示我们的歉意，我再送你5个50元红包吧\n老板：这次不要忘了充值啊\n小明：谢谢老板！\n小明往SVIP账户上充值350元。。。\n");
        xiaoming.addMoney(350);
        System.out.println("账户余额："+xiaoming.getMoney()+"元");
        System.out.println("===========\n小明使用魔法机器\n**********************\n魔法机器：尊贵的超级VIP，感谢您体验魔法机器\n魔法机器：超级VIP可以享受定制的增高或降低服务\n魔法机器：本次服务将收取费用：100元\n魔法机器：机器识别出您是："+xiaoming.getSex()+"\n魔法机器：机器将使您降低：10厘米\n**********************\n");
        xiaoming.changeHeightByMachineForSVIp(house.machine,xiaoming,10,2);
        System.out.println("现在，小明的身高是："+xiaoming.getHeight()+"厘米\n===========\n小明查看账户");
        System.out.println("账户余额："+xiaoming.getMoney()+"元");
        System.out.println("小明：哈哈哈。。。今天真是太开心了，还赚到250元\n老板：欢迎下次光临。不要忘记多介绍几个同学来啊，我给打折。啊哈哈哈哈哈。。。。。");
    }
}
