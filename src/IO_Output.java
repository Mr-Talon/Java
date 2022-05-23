import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IO_Output {
    public static void main(String [] args)throws IOException {
        File inputFile = new File("学校课程/IO.txt");
        FileReader inputFileReader =new FileReader(inputFile);
        BufferedReader in =new BufferedReader(inputFileReader);    //包装成缓冲流
        String str;
        while ((str=in.readLine())!=null){
            System.out.println(str);
        }
    }
}
