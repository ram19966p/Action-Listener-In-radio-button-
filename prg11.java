import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class ReasonForm extends JFrame {
    private JRadioButton option1, option2, option3;
    private JComboBox<String> reasonComboBox;
    private JTextField otherReasonTextField;

    public ReasonForm() {
        setTitle("Reason Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(4, 2));

        option1 = new JRadioButton("Option 1");
        option2 = new JRadioButton("Option 2");
        option3 = new JRadioButton("Option 3");

        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);

        reasonComboBox = new JComboBox<>(new String[]{"Reason 1", "Reason 2", "Reason 3"});
        reasonComboBox.setEnabled(false);

        otherReasonTextField = new JTextField();
        otherReasonTextField.setEnabled(false);

        option1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (option1.isSelected()) {
                    reasonComboBox.setEnabled(true);
                    otherReasonTextField.setEnabled(false);
                }
            }
        });

        option2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (option2.isSelected()) {
                    reasonComboBox.setEnabled(true);
                    otherReasonTextField.setEnabled(false);
                }
            }
        });

        option3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (option3.isSelected()) {
                    reasonComboBox.setEnabled(false);
                    otherReasonTextField.setEnabled(true);
                }
            }
        });

        add(option1);
        add(new JLabel(" "));
        add(option2);
        add(new JLabel(" "));
        add(option3);
        add(new JLabel(" "));
        add(reasonComboBox);
        add(otherReasonTextField);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ReasonForm();
            }
        });
    }
}
