import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Kalkulator {
    private JPanel MainPanel;
    private JPanel topPanel;
    private JPanel buttonPanel;
    private JButton STARTbutton;
    private JTextField vypisField;

    public Kalkulator() {
        STARTbutton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {


            String ip = ("XXXXXXXXXXXXXXX");
            vypisField.setText(ip + "");


               // String ip = ("c");
               // vypisField.setText(ip + "");

               // String text  = ("15");
               // vypisField.setText(text + "");

            }
        });
    }

// konec konstruktoru

 public static void main(String[] args) {
        JFrame frame = new JFrame("Sken IP adres");
        frame.setContentPane(new Kalkulator ().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

  // konec prorgramu