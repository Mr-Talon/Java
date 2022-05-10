import javax.swing.*;

public class HelloWorldSwing {
    public static void main(String []args){
        JFrame frame=new JFrame("HelloWorldSwing");    //创建容器
        final JLabel label=new JLabel("Hello world!!");      //一个标签组件
        frame.getContentPane().add(label);    //向容器内加入标签组件
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //设置关闭事件
        frame.pack();
        frame.setVisible(true);
    }
}
