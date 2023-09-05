import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI implements ActionListener {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        JPanel panel = new JPanel(new GridBagLayout());
        frame.setSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        // User Label
        userLabel = new JLabel("User");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(userLabel, constraints);

        // User Text Field
        userText = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.add(userText, constraints);

        // Password Label
        passwordLabel = new JLabel("Password");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(passwordLabel, constraints);

        // Password Text Field
        passwordText = new JPasswordField();
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(passwordText, constraints);

        // Login Button
        button = new JButton("Login");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2; 
        constraints.fill = GridBagConstraints.NONE;
        panel.add(button, constraints);

        button.addActionListener(new GUI());

        // Success Label
        success = new JLabel("");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(success, constraints);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if (user.equals("Jireh") && password.equals("pass123")) {
            success.setText("Login successful!");
        } else {
            success.setText("Wrong username or password");
        }
        userText.setText("");
        passwordText.setText("");
    }
}
