package 魔法屋;

public class ModelException extends Exception{
    String message;
    public ModelException(){
        message="模式选项错误！！";
    }
    public String toString(){
        return message;
    }
}
