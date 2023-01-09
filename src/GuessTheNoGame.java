import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import java.time.Period;

public class GuessTheNoGame {
    public static void main(String[] args) {
        new guessingNumber();
    }
}

class guessingNumber extends JFrame {
    // front end
    JLabel l1, l2, l3, title, GNbackground;
    JTextField t1;
    JButton ok, restart, exit;
    ImageIcon restartIcon, gameIcon;
    Image gameImage;
    JPanel pN;
    JPanel pC;
    JPanel pW;
    JPanel pS;

    // back end
    int chances = 5;
    int number = 1 + (int) (100 * Math.random());
    int guess;
    int K = chances;
    int flag = 0;

    public guessingNumber() {
        System.out.println(number);
        restartIcon = new ImageIcon(
                "C:\\Users\\apeer\\OneDrive\\Desktop\\New folder\\java mini project\\Miniproject-main\\src\\restart.png");
        gameIcon = new ImageIcon(
                "C:\\Users\\IRFAN\\OneDrive\\Desktop\\java programs\\Login page\\Login\\src\\GnBackground.jpg");
        gameImage = gameIcon.getImage();
        gameImage = gameImage.getScaledInstance(325, 300, java.awt.Image.SCALE_SMOOTH);
        gameIcon = new ImageIcon(gameImage);

        l1 = new JLabel("Enter the number from 1-100");
        l2 = new JLabel("Start Guessing.....");
        l3 = new JLabel("Trials left: " + chances);
        GNbackground = new JLabel(gameIcon);
        // GNbackground.setSize(50,50);
        t1 = new JTextField(25);
        ok = new JButton("Ok");
        restart = new JButton("Restart");
        exit = new JButton("EXIT");
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.setBackground(new Color(145, 255, 229));
        // Top elements
        pN = new JPanel();
        pN.add(new JLabel("Guess The Number..? "));
        c.add(pN, BorderLayout.NORTH);

        // center elements

        pC = new JPanel();
        pC.setLayout(new FlowLayout(4, 4, 4));
        pW = new JPanel();
        pW.setLayout(new GridLayout(5, 1, 0, 20));
        pW.add(l3);
        pW.add(l1);
        pW.add(t1);
        pW.add(ok);
        pW.add(l2);
        pC.add(pW);
        JLabel label = new JLabel("Center Box", SwingConstants.CENTER);
        label.setOpaque(true);
        c.add(GNbackground);
        c.add(pC, BorderLayout.WEST);

        // Bottom elements
        pS = new JPanel();
        pS.setLayout(new FlowLayout());
        pS.add(restart);
        pS.add(exit);
        c.add(pS, BorderLayout.SOUTH);

        // setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(600, 400);
        setResizable(false);
        setLocationRelativeTo(null);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guess = Integer.parseInt(t1.getText());
                if (chances >= 0 && flag == 0) {
                    if (number == guess) {
                        l2.setText("You Guessed Correctly ");
                        flag = 1;
                    } else if (number > guess) {
                        l2.setText(
                                "The number is "
                                        + "greater than " + guess);
                    } else if (number < guess) {
                        l2.setText(
                                "The number is"
                                        + " less than " + guess);
                    }

                    if (chances == 0) {
                        l2.setText(
                                "You Failed, Better luck next time" +
                                        "You have exhausted all trials." +
                                        "The number was " + number);
                        flag = -1;
                    }
                    chances--;
                    l3.setText("Trials left: " + chances);
                } else if (flag == -1) {
                    l2.setText(
                            "You Failed, Please restart the game to play again!");
                } else if (flag == 1) {
                    l2.setText("You Won!..." + "Please restart the game to play again");
                }
            }

        });

        restart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new guessingNumber();
                dispose();
            }
        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainFrame mf = new MainFrame();
                mf.initialize(null);
                dispose();
            }
        });
    }
}
