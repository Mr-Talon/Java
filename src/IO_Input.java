import java.io.*;

public class IO_Input {
    public static void main(String [] args) throws IOException {
        //输出部分的准备
        FileWriter fileWriter=new FileWriter("学校课程/IO.txt");   //输出的文件字符流对象
        BufferedWriter out=new BufferedWriter(fileWriter);

        //输入部分
        System.out.println("请输入需要存入文件的字符串：\n");
        InputStreamReader str=new InputStreamReader(System.in);     //从控制台输入
        BufferedReader in =new BufferedReader(str);

        String s=in.readLine();
        while (!s.equals("Y")){
            out.write(s);
            out.newLine();
            System.out.println("是否退出输入，输入 Y 退出");
            s=in.readLine();
        }

        in.close();
        out.close();
    }
}
