package ua.sf.spf;

import javax.swing.*;
import java.awt.*;

/**
 * Created by SupRas
 */
public class Panel extends JPanel {

    private Image image;

    public Image getImage() {
        return image;
    }
    void setImage(Image image) {
        this.image = image;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(image != null){
            g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        }
    }
}
