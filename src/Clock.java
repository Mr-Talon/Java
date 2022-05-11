import java.awt.*;
import java.util.Calendar;
import javax.swing.JFrame;

public class Clock extends JFrame implements Runnable{
    public Thread clockThread;
    public Graphics mg;

    public Clock(){    //构造函数
        super("Digital Clock");
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        mg=this.getGraphics();

        clockThread = new Thread(this,"clock");    //创建时钟线程
        clockThread.start();
    }

    @Override
    public void run() {
        Thread myThread = Thread.currentThread();
        while(clockThread == myThread){
            repaint();        //间隔1s 刷新一下画面
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
            }
        }
    }


    public void paint(Graphics mg){    //绘制函数
        super.paint(mg);
        mg = this.getGraphics();

        Calendar cal = Calendar.getInstance();   //获得时分秒
        int hh = cal.get(Calendar.HOUR_OF_DAY);
        int mm = cal.get(Calendar.MINUTE);
        int ss = cal.get(Calendar.SECOND);

        int clockRadius = (int)(Math.min(getWidth(), getHeight()) * 0.8 * 0.5);   //钟面的半径  整个窗口宽度0.8倍作为直径
        int xCenter = getWidth() / 2;    //设置圆心
        int yCenter = getHeight() / 2;

        //画圆
        mg.setColor(Color.black);
        mg.drawOval(xCenter - clockRadius, yCenter - clockRadius, 2 * clockRadius, 2 * clockRadius);
        mg.drawString("12", xCenter - 5, yCenter - clockRadius + 17);
        mg.drawString("1", (int) (xCenter + 0.5*clockRadius-9), (int) (yCenter - clockRadius * Math.cos(Math.PI/6) + 15));
        mg.drawString("2", (int) (xCenter + clockRadius * Math.cos(Math.PI/6)-15), (int) (yCenter - 0.5*clockRadius)+7);
        mg.drawString("3", xCenter + clockRadius - 15, yCenter + 3);
        mg.drawString("4", (int) (xCenter + clockRadius * Math.cos(Math.PI/6)-15), (int) (yCenter + 0.5*clockRadius)-5);
        mg.drawString("5", (int) (xCenter + 0.5*clockRadius-10), (int) (yCenter + clockRadius * Math.cos(Math.PI/6) - 5));
        mg.drawString("6", xCenter - 3, yCenter + clockRadius - 7);
        mg.drawLine(xCenter, yCenter+clockRadius-5, xCenter, yCenter+clockRadius);
        mg.drawString("7", (int) (xCenter - 0.5*clockRadius), (int) (yCenter + clockRadius * Math.cos(Math.PI/6) - 10));
        mg.drawString("8", (int) (xCenter - clockRadius * Math.cos(Math.PI/6)+7), (int) (yCenter + 0.5*clockRadius)-3);
        mg.drawString("9", xCenter - clockRadius + 7, yCenter + 5);
        mg.drawString("10", (int) (xCenter - clockRadius * Math.cos(Math.PI/6)+7), (int) (yCenter - 0.5*clockRadius)+7);
        mg.drawString("11", (int) (xCenter - 0.5*clockRadius), (int) (yCenter - clockRadius * Math.cos(Math.PI/6) + 15));

        //画小线段
        for(int i=0;i<60;i++){
            mg.drawLine((int) (xCenter+(clockRadius-5)*Math.sin(i*Math.PI/30)), (int) (yCenter-(clockRadius-5)*Math.cos(i*Math.PI/30)), (int) (xCenter+clockRadius*Math.sin(i*Math.PI/30)), (int) (yCenter-clockRadius*Math.cos(i*Math.PI/30)));
        }

        //画秒针
        int sLength = (int)(clockRadius * 0.85);
        int xSecond = (int)(xCenter + sLength * Math.sin(ss * (Math.PI / 30)));    //通过三角函数关系计算秒针线段末尾的位置
        int ySecond = (int)(yCenter - sLength * Math.cos(ss * (Math.PI / 30)));
        mg.setColor(Color.red);
        mg.drawLine(xCenter, yCenter, xSecond, ySecond);

        //画分针
        int mLength = (int)(clockRadius * 0.7);
        int xMinute = (int)(xCenter + mLength * Math.sin(mm * (Math.PI / 30)));
        int yMinute = (int)(yCenter - mLength * Math.cos(mm * (Math.PI / 30)));
        mg.setColor(Color.blue);
        mg.drawLine(xCenter, yCenter, xMinute, yMinute);

        //画时针
        int hLength = (int)(clockRadius * 0.5);
        int xHour = (int)(xCenter + hLength * Math.sin((hh % 12 + mm / 60.0) * (2 * Math.PI / 12)));    //时针的角度和分针也有关系
        int yHour = (int)(yCenter - hLength * Math.cos((hh % 12 + mm / 60.0) * (2 * Math.PI / 12)));
        mg.setColor(Color.green);
        mg.drawLine(xCenter, yCenter, xHour, yHour);

        cal = null;
    }

    public static void main(String args[]) {
        Clock ck = new Clock();
        ck.setVisible(true);
    }

}
