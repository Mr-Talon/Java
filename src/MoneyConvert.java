import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoneyConvert {
    private JPanel root;
    private JButton convertButton;
    private JTextField TextField;
    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;

    public MoneyConvert() {
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double money=Double.parseDouble(TextField.getText())/6.88;
                String str=String.format("%.2f",money);
                lb2.setText(str);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MoneyConvert");
        frame.setContentPane(new MoneyConvert().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
