import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login implements ActionListener{

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("Username:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel("Welcome to Trizah's login system");

    HashMap<String,String> logininfo;
    Login(HashMap<String,String> loginInfoOriginal){
        logininfo = loginInfoOriginal;

        userIdLabel.setBounds(50,100,95,25);
        userPasswordLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null, Font.ITALIC,9));

        userIdField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==resetButton){
            userIdField.setText("");
            userPasswordField.setText("");
        }
        if(e.getSource()==loginButton){
            String userId = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if (logininfo.containsKey(userId)){
                if (logininfo.get(userId).equals(password)){
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");
                    frame.dispose();
                    HomePage homePage = new HomePage(userId);
                }
                else {

                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong Password");

                }
            }
            else{
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username not Found");
            }
        }

    }
}
