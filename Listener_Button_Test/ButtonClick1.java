package org.example;

import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.CENTER;

public class ButtonClick1 extends JFrame {

    private JLabel labelUsername = new JLabel("Enter username: ");
    private JTextField textUsername = new JTextField(20);
    private JButton buttonLogin = new JButton("Login");

    public ButtonClick1() {

        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        newPanel.add(labelUsername, constraints);

        constraints.gridx = 1;
        newPanel.add(textUsername, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);

        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Input name "));

        // add the panel to this frame
        add(newPanel);

        pack();
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonClick1().setVisible(true);
            }
        });



    }
}