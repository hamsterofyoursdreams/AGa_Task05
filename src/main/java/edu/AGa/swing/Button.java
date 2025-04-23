package edu.AGa.swing;

import javax.swing.*;
import java.awt.*;


class Button extends JFrame {
    private final JButton button;

    public Button(ButtonConfig config) {
        setTitle(config.windowTitle());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        button = new JButton(config.initialText());
        button.setPreferredSize(config.buttonSize());
        button.setFont(config.buttonFont());
        button.setForeground(config.textColor());

        button.addActionListener(e -> button.setText(config.updatedText()));

        setLayout(new FlowLayout());
        add(button);
        pack();
    }
}
