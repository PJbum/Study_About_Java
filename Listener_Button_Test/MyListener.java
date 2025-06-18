package lab7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class MyListener implements ActionListener {
    public JLabel label;

    public MyListener(JLabel label) {
        this.label = label;
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button was Clicked!");
    }
}

