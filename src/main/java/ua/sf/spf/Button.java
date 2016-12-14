package ua.sf.spf;

import javax.swing.*;
import java.awt.*;

/**
 * Created by SupRas
 */
class Button extends JButton {

    Button(int x, int y){
        super("Buy");
        setVerticalTextPosition(AbstractButton.BOTTOM);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setEnabled(true);
        setSize(29,20);
        setMargin (new Insets(1, 1, 1, 1));
        setFocusPainted(false);
        setLocation(x,y);


    }

}
