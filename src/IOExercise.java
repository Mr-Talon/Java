import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOExercise {
    public static void main(String args[])throws IOException {
        File inputFile = new File("C:\\Users\\16046\\Desktop\\Programming\\JAVA\\学校课程\\src\\io_exercise.txt");
        FileReader inputFileReader =new FileReader(inputFile);
        BufferedReader in =new BufferedReader(inputFileReader);
        String str;
        while ((str=in.readLine())!=null){
            System.out.println(str);
        }
    }
}
