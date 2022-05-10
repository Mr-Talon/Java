package 魔法屋;

public class MagicMachine implements MagicHouseVIP,MagicHouseSVIP{
    private int heightImpovement;

    MagicMachine(){
        this.heightImpovement=50;
    }

    int getHeightImprovement(){
        return this.heightImpovement;
    }

    @Override
    public int changeHeightBySex(Person2 p) {
        if(p.getSex()=="女生"){
            return 30;
        }
        else if (p.getSex()=="男生"){
            return 40;
        }
        else {
            return 0;
        }
    }

    @Override
    public int changeHeightForSVIP(Person3 p,int change ,int model) throws NoMoneyException,ModelException {
        //参数 change为花的钱   model为选择的模式  1为长高 2为变矮
        if (p.getMoney()-(p.getSex()=="男生"?change*10:change*5)<0){
            throw new NoMoneyException();
        }
        else if(model!=1&&model!=2){
            throw new ModelException();
        }
        else {
            if (p.getSex()=="男生"){
                p.cost(change*10);
            }
            else {
                p.cost(change*5);
            }
            return model==1?change:-change;
        }
    }

}
