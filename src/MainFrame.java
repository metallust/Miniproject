import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public void initialize(User user) {

        /*************** info panel ****************/
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(0, 2, 5, 5));

        // infoPanel.add(new JLabel("Name"));
        // infoPanel.add(new JLabel(user.name));
        // infoPanel.add(new JLabel("Username"));
        // infoPanel.add(new JLabel(user.userName));
        // infoPanel.add(new JLabel("score1"));
        // infoPanel.add(new JLabel(user.score1));
        // infoPanel.add(new JLabel("score2"));
        // infoPanel.add(new JLabel(user.score2));
        // infoPanel.add(new JLabel("score3"));
        // infoPanel.add(new JLabel(user.score3));

        add(infoPanel, BorderLayout.NORTH);

        setTitle("Dashboard");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(1100, 650);
        // setMinimumSize(new Dimension(350, 450));
        // serResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

    }

}
