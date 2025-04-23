package edu.AGa.swing;

import java.awt.*;

record ButtonConfig(
        String windowTitle,
        String initialText,
        String updatedText,
        Dimension buttonSize,
        Font buttonFont,
        Color textColor
) {}
