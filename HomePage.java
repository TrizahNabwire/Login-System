import javax.swing.*;
import java.awt.*;

//import static javax.swing.text.rtf.RTFAttributes.BooleanAttribute.True;

public class HomePage {

    JFrame frame = new JFrame();
    JLabel homepageLabel = new JLabel("");
//constructor
    HomePage(String userId){
        homepageLabel.setBounds(0,0,200,35);
        homepageLabel.setFont(new Font(null, Font.PLAIN,25));
        homepageLabel.setText("Hello "+ userId);

        frame.add(homepageLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
