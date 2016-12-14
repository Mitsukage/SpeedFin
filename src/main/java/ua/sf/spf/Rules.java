package ua.sf.spf;

import javax.swing.*;

/**
 * Created by SupRas
 */
class Rules extends JFrame {
    Rules() {
        super("Rules of SpeedFin");
        setLayout(null);
        String ssss="Rules";
        String ssss2="1.Гравець перемагає, коли назбирує 1000 очків;";
        String ssss3="2.Купляйте дешевше - продавайте дорожче;";
        String ssss4="3.Ціна валюти змінюється швидше ніж ціна акцій;";
        String ssss5="4.При купівлі більше одного товару - виводиться ";
        String ssss6="середня ціна за товари та їх кількість;";
        String ssss7="5.Логін та пароль можуть бути лише з букв та пробілів;";
        class Beb extends JLabel{
            private Beb(String ssss, int y){
                super(ssss);
                setSize(400, 20);
                setLocation(50, y);
                setVerticalAlignment(JLabel.TOP);
            }
        }
        Beb b1=new Beb(ssss,20);
        b1.setLocation(0, 20);
        b1.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(b1);
        Beb b2=new Beb(ssss2,40);
        getContentPane().add(b2);
        Beb b3=new Beb(ssss3,60);
        getContentPane().add(b3);
        Beb b4=new Beb(ssss4,80);
        getContentPane().add(b4);
        Beb b5=new Beb(ssss5,100);
        getContentPane().add(b5);
        Beb b6=new Beb(ssss6,115);
        getContentPane().add(b6);
        Beb b7=new Beb(ssss7,135);
        getContentPane().add(b7);

        setSize(400, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
public static void testik(){
        new Rules();
}
}