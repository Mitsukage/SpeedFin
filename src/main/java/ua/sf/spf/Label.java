package ua.sf.spf;

import javax.swing.*;
import java.awt.*;

/**
 * Created by SupRas
 */
class Label extends JLabel {
    Label(String s, int x, int y, Font font){
        super(s);
        setSize(80,20);
        setLocation(x,y);
        setForeground(new Color(23, 218, 23));
        setVerticalAlignment(JLabel.TOP);
        setHorizontalAlignment(JLabel.CENTER);
        setFont(font);
    }
}
