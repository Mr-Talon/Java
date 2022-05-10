package 魔法屋;

public class Person {
    protected int height;
    Person(int h){
        this.height=h;
    }
    public void changeHeightByBread(Bread bd){
        this.height+= bd.getHeightImprovement();
    }
    public void changeHeightByMachine(MagicMachine machine){
        this.height+= machine.getHeightImprovement();
    }
    int getHeight(){
        return height;
    }
}
