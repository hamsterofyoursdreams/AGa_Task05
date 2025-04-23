package edu.AGa.swing;

import javax.swing.*;
import java.awt.*;

public class Client {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ButtonConfig config = new ButtonConfig(
                    "Кнопка",
                    "Нажми меня!",
                    "Привет от Клиента!",
                    new Dimension(250, 80),
                    new Font("Arial", Font.BOLD, 16),
                    Color.BLUE
            );

            new Button(config).setVisible(true);
        });
    }
}
