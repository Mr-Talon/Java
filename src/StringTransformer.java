import static java.lang.Character.isDigit;
import static java.lang.Character.toUpperCase;

public class StringTransformer {
    public static void main(String args[]){
        String demo="hello1234";
        int lenth=demo.length();
        char[] demoArray=new char[lenth];     //临时存放字符数粗

        for(int i=0;i<lenth;i++){
            demoArray[i]=demo.charAt(i);

            if(isDigit(demoArray[i])){    //如果这个字符是数字
                int p=Integer.valueOf(demoArray[i])+1;
                char c= (char) p;
                demoArray[i]=c;
            }
            else {
                demoArray[i]=toUpperCase(demoArray[i]);     //不是数字就变成大写形式
            }
        }
        String ans=new String(demoArray);
        System.out.println(ans);
    }
}
