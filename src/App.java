import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args) {
        new Login_signUp();
    }
}

class Login_signUp extends JFrame{
    JButton login , sign_up;
    Container mainContainer = this.getContentPane();
    public Login_signUp(){
        login = new JButton("LOGIN");
        sign_up = new JButton("SIGNUP");

        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            LoginForm loginForm = new LoginForm();
            loginForm.initialize();
            dispose();
            }
        });
        sign_up.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            SignUp signUp = new SignUp();
            signUp.initialize();
            dispose();
            }
        });

        mainContainer.setLayout(new BorderLayout(8,6));
        mainContainer.setBackground(Color.BLACK);
        login.setBackground(Color.black);
        sign_up.setBackground(Color.black);
        JPanel panel = new JPanel();
        // panel.setLayout(new GridLayout(1,2,10,20)); 
        panel.setBounds(150,150,100,70);   
        panel.add(login);
        panel.add(sign_up);
        panel.setBackground(Color.GRAY);
        mainContainer.add(panel, BorderLayout.NORTH);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));

        setLayout(null);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(3);
    }
}
