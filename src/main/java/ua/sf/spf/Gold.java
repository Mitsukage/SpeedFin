package ua.sf.spf;

import javax.swing.*;
import java.awt.*;

/**
 * Created by SupRas
 */
class Gold extends JLabel {
    Gold(String s, int x, int y, Font font){
        super(s);

        setSize(80,20);
        setLocation(x,y);
        setForeground(new Color(212, 218, 69));
        setVerticalAlignment(JLabel.TOP);
        setHorizontalAlignment(JLabel.CENTER);
        setFont(font);
    }}
