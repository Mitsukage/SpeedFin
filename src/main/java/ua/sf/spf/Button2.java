package ua.sf.spf;

import javax.swing.*;
import java.awt.*;

/**
 * Created by SupRas on 06.12.2016.
 */
public class Button2 extends JButton {

    public Button2(int x, int y){
        super("Sell");
        setVerticalTextPosition(AbstractButton.BOTTOM);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setEnabled(true);
        setSize(32,20);
        setMargin (new Insets(1, 1, 1, 1));
        setFocusPainted(false);
        setLocation(x,y);


    }
}
