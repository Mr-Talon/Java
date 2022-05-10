package 魔法屋;

public class NoMoneyException extends Exception{
    String message;
    public NoMoneyException(){
        message="魔法机器：错误：账户余额不足，机器停止工作！！！";
    }
    public String toString(){
        return message;
    }
}
