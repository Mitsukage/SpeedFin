package ua.sf.spf;

import org.hibernate.Session;
import ua.sf.spf.entity.Result;
import ua.sf.spf.entity.User;
import ua.sf.spf.persistence.HibernateUtil;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;
import java.util.List;

/**
 * Created by SupRas
 */
public class Game extends JFrame {
    private List<Integer> li1=new ArrayList<>();
    private List<Integer> li2=new ArrayList<>();
    private List<Integer> li3=new ArrayList<>();
    private List<Integer> li4=new ArrayList<>();
    private List<Integer> li5=new ArrayList<>();
    private List<Integer> li6=new ArrayList<>();
    private int porah=0;
    private int j1=0;
    private int j2=0;
    private  int j3=0;
    private  int j4=0;
    private  int j5=0;
    private  int j6=0;
    private  int w1=0;
    private  int w2=0;
    private  int w3=0;
    private  int w4=0;
    private  int w5=0;
    private   int w6=0;
    private  int d1= 99;
    private  int d2= 199;
    private  int d3= 299;
    private  int d4= 29;
    private  int d5= 59;
    private  int d6= 89;
    private int f1=500;
    private String login ="New User";
    private String password ="password";
    private String time ="";

    private String getLogin() {
        return login;
    }

    private String getPassword() {
        return password;
    }

    private String getTime() {
        return time;
    }

    private void setLogin(String login) {
        this.login = login;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private void setTime(String time) {
        this.time = time;
    }

    private TimerLabel timerLabel = null;

    private TimerLabel getTimerLabel() {
        return timerLabel;
    }

    private void setTimerLabel(TimerLabel timerLabel) {
        this.timerLabel = timerLabel;
      try{
        timerLabel.setPreferredSize(new Dimension(60,30));
        timerLabel.setLocation(398,40);}catch(NullPointerException e){e.printStackTrace();}
    }

    private int getF1() {
        return f1;
    }

    private void setF1(int f1) {
        this.f1 = f1;
    }

    private String getR1() {
        return ""+Integer.toString(j1)+"("+w1+")";
    }

    private String getR2() {
        return ""+Integer.toString(j2)+"("+w2+")";
    }

    private String getR3() {
        return ""+Integer.toString(j3)+"("+w3+")";
    }

    private String getR4() {
        return ""+Integer.toString(j4)+"("+w4+")";
    }

    private String getR5() {
        return ""+Integer.toString(j5)+"("+w5+")";
    }

    private String getR6() {
        return ""+Integer.toString(j6)+"("+w6+")";
    }

    private void setW1(int w1) {
        this.w1 = w1;
    }

    private void setW2(int w2) {
        this.w2 = w2;
    }

    private void setW3(int w3) {
        this.w3 = w3;
    }

    private void setW4(int w4) {
        this.w4 = w4;
    }

    private void setW5(int w5) {
        this.w5 = w5;
    }

    private void setW6(int w6) {
        this.w6 = w6;
    }

    private void setJ1(int j1) {
        this.j1 = j1;
    }

    private void setJ2(int j2) {
        this.j2 = j2;
    }

    private void setJ3(int j3) {
        this.j3 = j3;
    }

    private void setJ4(int j4) {
        this.j4 = j4;
    }

    private void setJ5(int j5) {
        this.j5 = j5;
    }

    private void setJ6(int j6) {
        this.j6 = j6;
    }
    private int getPorah() {
        return porah;
    }

    private void setPorah(int porah) {
        this.porah = porah;
    }

    private int getJ1() {
        return j1;
    }

    private int getJ2() {
        return j2;
    }

    private int getJ3() {
        return j3;
    }

    private int getJ4() {
        return j4;
    }

    private int getJ5() {
        return j5;
    }

    private int getJ6() {
        return j6;
    }

    private int getW1() {
        return w1;
    }

    private int getW2() {
        return w2;
    }

    private int getW3() {
        return w3;
    }

    private int getW4() {
        return w4;
    }

    private int getW5() {
        return w5;
    }

    private int getW6() {
        return w6;
    }

    private void setD1(int d1) {
        this.d1 = d1;
    }

    private void setD2(int d2) {
        this.d2 = d2;
    }

    private void setD3(int d3) {
        this.d3 = d3;
    }

    private void setD4(int d4) {
        this.d4 = d4;
    }

    private void setD5(int d5) {
        this.d5 = d5;
    }

    private void setD6(int d6) {
        this.d6 = d6;
    }

    private int getD1() {
        return d1;
    }

    private int getD2() {
        return d2;
    }

    private int getD3() {
        return d3;
    }

    private int getD4() {
        return d4;
    }

    private int getD5() {
        return d5;
    }

    private int getD6() {
        return d6;
    }

    private List<Integer> getLi1() {
        return li1;
    }

    private List<Integer> getLi2() {
        return li2;
    }

    private List<Integer> getLi3() {
        return li3;
    }

    private List<Integer> getLi4() {
        return li4;
    }

    private List<Integer> getLi5() {
        return li5;
    }

    private List<Integer> getLi6() {
        return li6;
    }

    private void setLi1(List<Integer> li1) {
        this.li1 = li1;
    }

    private void setLi2(List<Integer> li2) {
        this.li2 = li2;
    }

    private void setLi3(List<Integer> li3) {
        this.li3 = li3;
    }

    private void setLi4(List<Integer> li4) {
        this.li4 = li4;
    }

    private void setLi5(List<Integer> li5) {
        this.li5 = li5;
    }

    private void setLi6(List<Integer> li6) {
        this.li6 = li6;
    }

    private Game() {
        super("SpeedFin");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final Panel panel = new Panel();
        panel.setLayout(null);
        try {

            panel.setImage(ImageIO.read(getClass().getResource("/back3.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        panel.setPreferredSize(new Dimension(500, 500));

        final List<Integer> li1=new ArrayList<>();
        final List<Integer> li2=new ArrayList<>();
        final List<Integer> li3=new ArrayList<>();
        final List<Integer> li4=new ArrayList<>();
        final List<Integer> li5=new ArrayList<>();
        final List<Integer> li6=new ArrayList<>();

        int d1= 99;
        int d2= 199;
        int d3= 299;
        int d4= 29;
        int d5= 59;
        int d6= 89;

        int j1= 0;
        int j2= 0;
        int j3= 0;
        int j4= 0;
        int j5= 0;
        int j6= 0;

        int w1=0;
        int w2=0;
        int w3=0;
        int w4=0;
        int w5=0;
        int w6=0;

        String r1=""+Integer.toString(j1)+"("+w1+")";
        String r2=""+Integer.toString(j2)+"("+w2+")";
        String r3=""+Integer.toString(j3)+"("+w3+")";
        String r4=""+Integer.toString(j4)+"("+w4+")";
        String r5=""+Integer.toString(j5)+"("+w5+")";
        String r6=""+Integer.toString(j6)+"("+w6+")";

        Font font = new Font("Century Gothic", Font.BOLD, 18);
        Font font1 = new Font("Verdana", Font.BOLD, 12);

        JLabel l1=new JLabel("Assets:");
        l1.setSize(100,20);
        l1.setLocation(70,300);
        l1.setFont(font);
        panel.add(l1);

        JLabel l2=new JLabel("Stocks");
        l2.setSize(50,20);
        l2.setLocation(30,320);
        l2.setForeground(Color.blue);
        panel.add(l2);

        JLabel l3=new JLabel("BAVL");
        l3.setSize(50,20);
        l3.setLocation(30,340);
        panel.add(l3);

        JLabel l10=new JLabel("-");
        l10.setSize(5,20);
        l10.setLocation(80,338);
        panel.add(l10);

        final Label l29=new Label(r1,90,342,font1);
        panel.add(l29);

        JLabel l4=new JLabel("CEEN");
        l4.setSize(50,20);
        l4.setLocation(30,355);
        panel.add(l4);

        JLabel l11=new JLabel("-");
        l11.setSize(5,20);
        l11.setLocation(80,353);
        panel.add(l11);

        final Label l30=new Label(r2,90,357,font1);
        panel.add(l30);

        JLabel l5=new JLabel("UNAF");
        l5.setSize(50,20);
        l5.setLocation(30,370);
        panel.add(l5);

        JLabel l12=new JLabel("-");
        l12.setSize(5,20);
        l12.setLocation(80,368);
        panel.add(l12);

        final Label l31=new Label(r3,90,372,font1);
        panel.add(l31);

        JLabel l6=new JLabel("Currency");
        l6.setSize(100,20);
        l6.setLocation(30,390);
        l6.setForeground(Color.blue);
        panel.add(l6);

        JLabel l7=new JLabel("USD");
        l7.setSize(50,20);
        l7.setLocation(30,410);
        panel.add(l7);

        JLabel l13=new JLabel("-");
        l13.setSize(5,20);
        l13.setLocation(80,408);
        panel.add(l13);

        final Label l32=new Label(r4,90,412,font1);
        panel.add(l32);

        JLabel l8=new JLabel("EUR");
        l8.setSize(50,20);
        l8.setLocation(30,425);
        panel.add(l8);

        JLabel l14=new JLabel("-");
        l14.setSize(5,20);
        l14.setLocation(80,423);
        panel.add(l14);

        final Label l33=new Label(r5,90,427,font1);
        panel.add(l33);

        JLabel l9=new JLabel("GBP");
        l9.setSize(50,20);
        l9.setLocation(30,440);
        panel.add(l9);

        JLabel l15=new JLabel("-");
        l15.setSize(5,20);
        l15.setLocation(80,438);
        panel.add(l15);

        final Label l34=new Label(r6,90,442,font1);
        panel.add(l34);

        JLabel l16=new JLabel("Stock market:");
        l16.setSize(200,20);
        l16.setLocation(260,300);
        l16.setFont(font);
        panel.add(l16);

        JLabel l17=new JLabel("BAVL");
        l17.setSize(50,20);
        l17.setLocation(208,327);
        panel.add(l17);

        final Label l23=new Label(Integer.toString(d1),183,347,font1);
        panel.add(l23);

        JLabel l18=new JLabel("CEEN");
        l18.setSize(50,20);
        l18.setLocation(308,327);
        panel.add(l18);

        final Label l24=new Label(Integer.toString(d2),283,347,font1);
        panel.add(l24);

        JLabel l19=new JLabel("UNAF");
        l19.setSize(50,20);
        l19.setLocation(408,327);
        panel.add(l19);

        final Label l25=new Label(Integer.toString(d3),383,347,font1);
        panel.add(l25);

        JLabel l20=new JLabel("USD");
        l20.setSize(50,20);
        l20.setLocation(212,397);
        panel.add(l20);

        final Label l26=new Label(Integer.toString(d4),185,417,font1);
        panel.add(l26);

        JLabel l21=new JLabel("EUR");
        l21.setSize(50,20);
        l21.setLocation(312,397);
        panel.add(l21);

        final Label l27=new Label(Integer.toString(d5),285,417,font1);
        panel.add(l27);

        JLabel l22=new JLabel("GBP");
        l22.setSize(50,20);
        l22.setLocation(412,397);
        panel.add(l22);

        final Label l28=new Label(Integer.toString(d6),385,417,font1);
        panel.add(l28);

        final Gold g1=new Gold(Integer.toString(getF1()),39,244,font);
        panel.add(g1);

        final JLabel l201=new JLabel(getLogin());
        l201.setSize(200,26);
        l201.setLocation(147,180);
        l201.setForeground(Color.WHITE);
        Font font3 = new Font("Calibri",Font.BOLD, 16);
        l201.setFont(font3);
        l201.setVerticalAlignment(JLabel.TOP);
        l201.setHorizontalAlignment(JLabel.CENTER);
        panel.add(l201);



        final JLabel imageLabel = new JLabel(new ImageIcon(getClass().getResource("/1.png")));
        imageLabel.setSize(103,120);
        imageLabel.setLocation(196,47);
        panel.add(imageLabel);


        Thread myThready = new Thread(new Runnable()
        {
            public void run()
            {
                while(getF1()<10000){
                    try{
                        int t4=(int)(Math.random()*29+1);
                        int t5=(int)(Math.random()*29+30);
                        int t6=(int)(Math.random()*29+60);

                        if (t4<getD4()){
                            l26.setForeground(new Color(245,9,31));
                            setD4(t4);
                            l26.setText(Integer.toString(getD4()));
                        }else{
                            l26.setForeground(new Color(23, 218, 23));
                            setD4(t4);
                            l26.setText(Integer.toString(getD4()));
                        }
                        if (t5<getD5()){
                            l27.setForeground(new Color(245,9,31));
                            setD5(t5);
                            l27.setText(Integer.toString(getD5()));
                        }else{
                            l27.setForeground(new Color(23, 218, 23));
                            setD5(t5);
                            l27.setText(Integer.toString(getD5()));
                        }
                        if (t6<getD6()){
                            l28.setForeground(new Color(245,9,31));
                            setD6(t6);
                            l28.setText(Integer.toString(getD6()));
                        }else{
                            l28.setForeground(new Color(23, 218, 23));
                            setD6(t6);
                            l28.setText(Integer.toString(getD6()));

                        }
                        Thread.sleep(2500);
                    }catch(Exception e){e.printStackTrace();}}}
        });

        Thread myThready2 = new Thread(new Runnable()
        {
            public void run()
            {
                while(getF1()<10000){
                    try{
                        int t1=(int)(Math.random()*99+1);
                        int t2=(int)(Math.random()*99+100);
                        int t3=(int)(Math.random()*99+200);
                        if (t1<getD1()){
                            l23.setForeground(new Color(245,9,31));
                            setD1(t1);
                            l23.setText(Integer.toString(getD1()));
                        }else{
                            l23.setForeground(new Color(23, 218, 23));
                            setD1(t1);
                            l23.setText(Integer.toString(getD1()));
                        }
                        if (t2<getD2()){
                            l24.setForeground(new Color(245,9,31));
                            setD2(t2);
                            l24.setText(Integer.toString(getD2()));
                        }else{
                            l24.setForeground(new Color(23, 218, 23));
                            setD2(t2);
                            l24.setText(Integer.toString(getD2()));
                        }
                        if (t3<getD3()){
                            l25.setForeground(new Color(245,9,31));
                            setD3(t3);
                            l25.setText(Integer.toString(getD3()));
                        }else{
                            l25.setForeground(new Color(23, 218, 23));
                            setD3(t3);
                            l25.setText(Integer.toString(getD3()));
                        }
                        Thread.sleep(4500);

                    }catch(Exception e){e.printStackTrace();}}}
        });
      final Thread myThready3 = new Thread(new Runnable()
        {
            public void run()
            {
                while(getF1()<20000){
                    try{
                        int ff=getF1();
                        if(ff>1000){
                            timerLabel.StopTimer();


                            class Winner extends JFrame {
                                private Winner() {
                                    super("Win!");
                                    setLayout(null);
                                    final JLabel l1=new JLabel("You WIN!!!");
                                    l1.setSize(200,20);
                                    l1.setLocation(0,0);
                                    l1.setVerticalAlignment(JLabel.TOP);
                                    l1.setHorizontalAlignment(JLabel.CENTER);
                                    getContentPane().add(l1);
                                    JLabel l2=new JLabel("Your result : "+timerLabel.getText());
                                    l2.setSize(200,20);
                                    l2.setLocation(0,20);
                                    l2.setVerticalAlignment(JLabel.TOP);
                                    l2.setHorizontalAlignment(JLabel.CENTER);
                                    getContentPane().add(l2);
                                    JButton but1=new JButton("Yeah!");
                                    but1.setVerticalTextPosition(AbstractButton.BOTTOM);
                                    but1.setHorizontalTextPosition(AbstractButton.CENTER);
                                    but1.setEnabled(true);
                                    but1.setSize(40,20);
                                    but1.setMargin (new Insets(1, 1, 1, 1));
                                    but1.setFocusPainted(false);
                                    but1.setLocation(80,50);
                                    but1.addActionListener((new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            System.out.println("Maven + Hibernate + MySQL");

                                            Session session = HibernateUtil.getSessionFactory().openSession();
                                            session.beginTransaction();
                                            Result res = new Result();
                                            res.setId(1);
                                            res.setLogin(getLogin());
                                            setTime(timerLabel.getText());
                                            res.setTime(getTime());
                                            session.save(res);
                                            session.getTransaction().commit();
                                            session.beginTransaction();

                                            final List<Result> result = session.createQuery("from Result order by id").list();
                                            session.getTransaction().commit();
                                            session.close();
                                            for(int aa=1;aa<result.size();aa++) {
                                                int sss= Character.getNumericValue(result.get(aa).getTime().charAt(0))*1000+Character.getNumericValue(result.get(aa).getTime().charAt(1))*100+Character.getNumericValue(result.get(aa).getTime().charAt(3))*10+Character.getNumericValue(result.get(aa).getTime().charAt(4));
                                                int sss2 = Character.getNumericValue(result.get(aa-1).getTime().charAt(0))*1000+Character.getNumericValue(result.get(aa-1).getTime().charAt(1))*100+Character.getNumericValue(result.get(aa-1).getTime().charAt(3))*10+Character.getNumericValue(result.get(aa-1).getTime().charAt(4));
                                                if (sss2>sss){
                                                    result.add(result.size(),result.get(aa-1));
                                                    result.set(aa-1,result.get(aa));
                                                    result.set(aa,result.get(result.size()-1));
                                                    result.remove(result.size()-1);
                                                    aa=0;
                                                }

                                                for(int aaa=0;aaa<result.size();aaa++) {
                                                    result.get(aaa).setId(aaa+1);
                                                }
                                            }
                                            class Results222 extends JFrame {
                                                private Results222() {
                                                    super("Results");
                                                    setLayout(null);
                                                    int yy=25;

                                                    if (result.size()>10){
                                                        for(int aa=0;aa<10;aa++) {
                                                            JLabel l1=new JLabel(result.get(aa).getId()+" "+result.get(aa).getLogin()+" "+result.get(aa).getTime());
                                                            l1.setSize(250, 20);
                                                            if(aa==0)l1.setBorder(BorderFactory.createLineBorder(Color.green));
                                                            else if(aa==1||aa==2)l1.setBorder(BorderFactory.createLineBorder(Color.blue));
                                                            else if(aa==3||aa==4||aa==5)l1.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
                                                            else if(aa>5)l1.setBorder(BorderFactory.createLineBorder(Color.black));
                                                            l1.setLocation(25, yy);
                                                            l1.setVerticalAlignment(JLabel.TOP);
                                                            l1.setHorizontalAlignment(JLabel.CENTER);
                                                            getContentPane().add(l1);
                                                            yy+=25;
                                                        }}
                                                    else{
                                                        for(int aa=0;aa<result.size();aa++) {
                                                            JLabel l1=new JLabel(result.get(aa).getId()+" "+result.get(aa).getLogin()+" "+result.get(aa).getTime());
                                                            l1.setSize(250, 20);
                                                            if(aa==0)l1.setBorder(BorderFactory.createLineBorder(Color.green));
                                                            else if(aa==1||aa==2)l1.setBorder(BorderFactory.createLineBorder(Color.blue));
                                                            else if(aa==3||aa==4||aa==5)l1.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
                                                            else if(aa>5)l1.setBorder(BorderFactory.createLineBorder(Color.black));
                                                            l1.setLocation(25, yy);
                                                            l1.setVerticalAlignment(JLabel.TOP);
                                                            l1.setHorizontalAlignment(JLabel.CENTER);
                                                            getContentPane().add(l1);
                                                            yy+=25;
                                                        }
                                                    }
                                                    setSize(300, 400);
                                                    setLocationRelativeTo(null);
                                                    setResizable(false);
                                                    setVisible(true);
                                                }
                                            }
                                            new Results222();
                                           dispose();
                                        }}));
                                    getContentPane().add(but1);
                                    addWindowListener(new WindowAdapter() {
                                        @Override
                                        public void windowClosing(WindowEvent e) {
                                            System.out.println("Maven + Hibernate + MySQL");

                                            Session session = HibernateUtil.getSessionFactory().openSession();

                                            session.beginTransaction();
                                            Result res = new Result();
                                            res.setId(1);
                                            res.setLogin(getLogin());
                                            setTime(timerLabel.getText());
                                            res.setTime(getTime());
                                            session.save(res);
                                            session.getTransaction().commit();
                                            session.beginTransaction();

                                            final List<Result> result = session.createQuery("from Result order by id").list();
                                            session.getTransaction().commit();
                                            session.close();
                                            for(int aa=1;aa<result.size();aa++) {
                                                int sss= Character.getNumericValue(result.get(aa).getTime().charAt(0))*1000+Character.getNumericValue(result.get(aa).getTime().charAt(1))*100+Character.getNumericValue(result.get(aa).getTime().charAt(3))*10+Character.getNumericValue(result.get(aa).getTime().charAt(4));
                                                int sss2 = Character.getNumericValue(result.get(aa-1).getTime().charAt(0))*1000+Character.getNumericValue(result.get(aa-1).getTime().charAt(1))*100+Character.getNumericValue(result.get(aa-1).getTime().charAt(3))*10+Character.getNumericValue(result.get(aa-1).getTime().charAt(4));
                                                if (sss2>sss){
                                                    result.add(result.size(),result.get(aa-1));
                                                    result.set(aa-1,result.get(aa));
                                                    result.set(aa,result.get(result.size()-1));
                                                    result.remove(result.size()-1);
                                                    aa=0;
                                                }

                                                for(int aaa=0;aaa<result.size();aaa++) {
                                                    result.get(aaa).setId(aaa+1);
                                                }
                                            }
                                            class Results222 extends JFrame {
                                                private Results222() {
                                                    super("Results");
                                                    setLayout(null);
                                                    int yy=25;

                                                    if (result.size()>10){
                                                        for(int aa=0;aa<10;aa++) {
                                                            JLabel l1=new JLabel(result.get(aa).getId()+" "+result.get(aa).getLogin()+" "+result.get(aa).getTime());
                                                            l1.setSize(250, 20);
                                                            if(aa==0)l1.setBorder(BorderFactory.createLineBorder(Color.green));
                                                            else if(aa==1||aa==2)l1.setBorder(BorderFactory.createLineBorder(Color.blue));
                                                            else if(aa==3||aa==4||aa==5)l1.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
                                                            else if(aa>5)l1.setBorder(BorderFactory.createLineBorder(Color.black));
                                                            l1.setLocation(25, yy);
                                                            l1.setVerticalAlignment(JLabel.TOP);
                                                            l1.setHorizontalAlignment(JLabel.CENTER);
                                                            getContentPane().add(l1);
                                                            yy+=25;
                                                        }}
                                                    else{
                                                        for(int aa=0;aa<result.size();aa++) {
                                                            JLabel l1=new JLabel(result.get(aa).getId()+" "+result.get(aa).getLogin()+" "+result.get(aa).getTime());
                                                            l1.setSize(250, 20);
                                                            if(aa==0)l1.setBorder(BorderFactory.createLineBorder(Color.green));
                                                            else if(aa==1||aa==2)l1.setBorder(BorderFactory.createLineBorder(Color.blue));
                                                            else if(aa==3||aa==4||aa==5)l1.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
                                                            else if(aa>5)l1.setBorder(BorderFactory.createLineBorder(Color.black));
                                                            l1.setLocation(25, yy);
                                                            l1.setVerticalAlignment(JLabel.TOP);
                                                            l1.setHorizontalAlignment(JLabel.CENTER);
                                                            getContentPane().add(l1);
                                                            yy+=25;
                                                        }
                                                    }
                                                    setSize(300, 400);
                                                    setLocationRelativeTo(null);
                                                    setResizable(false);
                                                    setVisible(true);
                                                }
                                            }
                                            new Results222();
                                        }
                                    });
                                    setSize(200, 110);
                                    setLocationRelativeTo(null);
                                    setResizable(false);
                                    setVisible(true);
                                }
                            }
                            setF1(500);
                            setPorah(1);
                            new Winner();

                        }
                        Thread.sleep(500);
                    }catch(Exception e){e.printStackTrace();}}}
        });
        Button b1=new Button(190,367);
        panel.add(b1);
        b1.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(getPorah()==0){
                if (getTimerLabel()== null) {
                    setTimerLabel(new TimerLabel(new java.util.Timer(),398,40));
                    panel.add(getTimerLabel());
                }
                if(getD1()<=getF1()){
                    if (getJ1() == 0) {
                        int l1 = getJ1() + getD1();
                        setF1(getF1()-getD1());
                        g1.setText(Integer.toString(getF1()));
                        li1.add(l1);
                        setLi1(li1);
                        setW1(1);
                        setJ1(l1);
                        l29.setText(getR1());

                    } else {
                        setW1(getW1()+1);
                        setF1(getF1()-getD1());
                        g1.setText(Integer.toString(getF1()));
                        getLi1().add(getD1());
                        setLi1(li1);
                        int l1 =0;
                        for(int t=0;t<getLi1().size();t++){
                            l1 = l1+getLi1().get(t);
                        }
                        l1=l1/getW1();
                        setJ1(l1);
                        l29.setText(getR1());
                    }}}}}));

        Button2 b7=new Button2(225,367);
        panel.add(b7);
        b7.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(getPorah()==0){
                if (getTimerLabel()== null) {
                    setTimerLabel(new TimerLabel(new java.util.Timer(),398,40));
                    panel.add(getTimerLabel());
                }
                setF1(getF1()+getD1()*getW1());
                g1.setText(Integer.toString(getF1()));
                List<Integer> lo1=new ArrayList<>();
                li1.clear();
                setLi1(lo1);
                setW1(0);
                setJ1(0);

                l29.setText(getR1());
            }}}));

        Button b2=new Button(290,367);
        panel.add(b2);
        b2.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(getPorah()==0){
                if (getTimerLabel()== null) {
                    setTimerLabel(new TimerLabel(new java.util.Timer(),398,40));
                    panel.add(getTimerLabel());
                }
                if(getD2()<=getF1()){
                    if (getJ2() == 0) {
                        int l2 = getJ2() + getD2();
                        setF1(getF1()-getD2());
                        g1.setText(Integer.toString(getF1()));
                        li2.add(l2);
                        setLi2(li2);
                        setW2(1);
                        setJ2(l2);
                        l30.setText(getR2());

                    } else {
                        setW2(getW2() + 1);
                        setF1(getF1() - getD2());
                        g1.setText(Integer.toString(getF1()));
                        getLi2().add(getD2());
                        setLi2(li2);
                        int l2 = 0;
                        for (int t = 0; t < getLi2().size(); t++) {
                            l2 = l2 + getLi2().get(t);
                        }
                        l2 = l2 / getW2();
                        setJ2(l2);
                        l30.setText(getR2());
                    }}}}}));

        Button2 b8=new Button2(325,367);
        panel.add(b8);
        b8.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(getPorah()==0) {
                    if (getTimerLabel() == null) {
                        setTimerLabel(new TimerLabel(new java.util.Timer(), 398, 40));
                        panel.add(getTimerLabel());
                    }
                    setF1(getF1() + getD2() * getW2());
                    g1.setText(Integer.toString(getF1()));
                    setW2(0);
                    setJ2(0);
                    List<Integer> lo2 = new ArrayList<>();
                    li2.clear();
                    setLi2(lo2);
                    l30.setText(getR2());
                } }}));

        Button b3=new Button(390,367);
        panel.add(b3);
        b3.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(getPorah()==0){
                if (getTimerLabel()== null) {
                    setTimerLabel(new TimerLabel(new java.util.Timer(),398,40));
                    panel.add(getTimerLabel());
                }
                if(getD3()<=getF1()){
                    if (getJ3() == 0) {
                        int l3 = getJ3() + getD3();
                        setF1(getF1()-getD3());
                        g1.setText(Integer.toString(getF1()));
                        li3.add(l3);
                        setLi3(li3);
                        setW3(1);
                        setJ3(l3);
                        l31.setText(getR3());

                    } else {
                        setW3(getW3() + 1);
                        setF1(getF1() - getD3());
                        g1.setText(Integer.toString(getF1()));
                        getLi3().add(getD3());
                        setLi3(li3);
                        int l3 = 0;
                        for (int t = 0; t < getLi3().size(); t++) {
                            l3 = l3 + getLi3().get(t);
                        }
                        l3 = l3 / getW3();
                        setJ3(l3);
                        l31.setText(getR3());
                    }   }}}}));

        Button2 b9=new Button2(425,367);
        panel.add(b9);
        b9.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(getPorah()==0) {
                    if (getTimerLabel() == null) {
                        setTimerLabel(new TimerLabel(new java.util.Timer(), 398, 40));
                        panel.add(getTimerLabel());
                    }
                    setF1(getF1() + getD3() * getW3());
                    g1.setText(Integer.toString(getF1()));
                    setW3(0);
                    setJ3(0);
                    List<Integer> lo3 = new ArrayList<>();
                    li3.clear();
                    setLi3(lo3);
                    l31.setText(getR3());
                }}}));

        Button b4=new Button(190,437);
        panel.add(b4);
        b4.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(getPorah()==0){
                if (getTimerLabel()== null) {
                    setTimerLabel(new TimerLabel(new java.util.Timer(),398,40));
                    panel.add(getTimerLabel());
                }
                if(getD4()<=getF1()){
                    if (getJ4() == 0) {
                        int l4 = getJ4() + getD4();
                        setF1(getF1()-getD4());
                        g1.setText(Integer.toString(getF1()));
                        li4.add(l4);
                        setLi4(li4);
                        setW4(1);
                        setJ4(l4);
                        l32.setText(getR4());

                    } else {
                        setW4(getW4() + 1);
                        setF1(getF1() - getD4());
                        g1.setText(Integer.toString(getF1()));
                        getLi4().add(getD4());
                        setLi4(li4);
                        int l4 = 0;
                        for (int t = 0; t < getLi4().size(); t++) {
                            l4 = l4 + getLi4().get(t);
                        }
                        l4 = l4 / getW4();
                        setJ4(l4);
                        l32.setText(getR4());
                    }   }}}}));

        Button2 b10=new Button2(225,437);
        panel.add(b10);
        b10.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(getPorah()==0) {
                    if (getTimerLabel() == null) {
                        setTimerLabel(new TimerLabel(new java.util.Timer(), 398, 40));
                        panel.add(getTimerLabel());
                    }
                    setF1(getF1() + getD4() * getW4());
                    g1.setText(Integer.toString(getF1()));
                    setW4(0);
                    setJ4(0);
                    List<Integer> lo4 = new ArrayList<>();
                    li4.clear();
                    setLi4(lo4);
                    l32.setText(getR4());
                } }}));

        Button b5=new Button(290,437);
        panel.add(b5);
        b5.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(getPorah()==0){
                if (getTimerLabel()== null) {
                    setTimerLabel(new TimerLabel(new java.util.Timer(),398,40));
                    panel.add(getTimerLabel());
                }
                if(getD5()<=getF1()){
                    if (getJ5() == 0) {
                        int l5 = getJ5() + getD5();
                        setF1(getF1()-getD5());
                        g1.setText(Integer.toString(getF1()));
                        li5.add(l5);
                        setLi5(li5);
                        setW5(1);
                        setJ5(l5);
                        l33.setText(getR5());

                    } else {
                        setW5(getW5() + 1);
                        setF1(getF1() - getD5());
                        g1.setText(Integer.toString(getF1()));
                        getLi5().add(getD5());
                        setLi5(li5);
                        int l5 = 0;
                        for (int t = 0; t < getLi5().size(); t++) {
                            l5 = l5 + getLi5().get(t);
                        }
                        l5 = l5 / getW5();
                        setJ5(l5);
                        l33.setText(getR5());
                    } }}}}));

        Button2 b11=new Button2(325,437);
        panel.add(b11);
        b11.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(getPorah()==0) {
                    if (getTimerLabel() == null) {
                        setTimerLabel(new TimerLabel(new java.util.Timer(), 398, 40));
                        panel.add(getTimerLabel());
                    }
                    setF1(getF1() + getD5() * getW5());
                    g1.setText(Integer.toString(getF1()));
                    setW5(0);
                    setJ5(0);
                    List<Integer> lo5 = new ArrayList<>();
                    li5.clear();
                    setLi5(lo5);
                    l33.setText(getR5());
                }  }}));

        Button b6=new Button(390,437);
        panel.add(b6);
        b6.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(getPorah()==0){
                if (getTimerLabel()== null) {
                    setTimerLabel(new TimerLabel(new java.util.Timer(),398,40));
                    panel.add(getTimerLabel());
                }
                if(getD6()<=getF1()){
                    if (getJ6() == 0) {
                        int l6 = getJ6() + getD6();
                        setF1(getF1()-getD6());
                        g1.setText(Integer.toString(getF1()));
                        li6.add(l6);
                        setLi6(li6);
                        setW6(1);
                        setJ6(l6);
                        l34.setText(getR6());

                    } else {
                        setW6(getW6() + 1);
                        setF1(getF1() - getD6());
                        g1.setText(Integer.toString(getF1()));
                        getLi6().add(getD6());
                        setLi6(li6);
                        int l6 = 0;
                        for (int t = 0; t < getLi6().size(); t++) {
                            l6 = l6 + getLi6().get(t);
                        }
                        l6 = l6 / getW6();
                        setJ6(l6);
                        l34.setText(getR6());
                    } }}}}));

        Button2 b12=new Button2(425,437);
        panel.add(b12);
        b12.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(getPorah()==0) {
                    if (getTimerLabel() == null) {
                        setTimerLabel(new TimerLabel(new java.util.Timer(), 398, 40));
                        panel.add(getTimerLabel());
                    }
                    setF1(getF1() + getD6() * getW6());
                    g1.setText(Integer.toString(getF1()));
                    setW6(0);
                    setJ6(0);
                    List<Integer> lo6 = new ArrayList<>();
                    li6.clear();
                    setLi6(lo6);
                    l34.setText(getR6());
                }   }}));
           class MyButton extends JButton {

                private Color hoverBackgroundColor;
                private Color pressedBackgroundColor;



                private MyButton(String text) {
                    super(text);
                    super.setContentAreaFilled(false);
                }

                @Override
                protected void paintComponent(Graphics g) {

                    if (getModel().isPressed()) {
                        g.setColor(pressedBackgroundColor);

                    } else if (getModel().isRollover()) {
                        g.setColor(hoverBackgroundColor);

                    } else {
                        g.setColor(getBackground());

                    }

                    g.fillRect(0, 0, getWidth(), getHeight());
                    super.paintComponent(g);
                }

                @Override
                public void setContentAreaFilled(boolean b) {
                }

                private void setHoverBackgroundColor(Color hoverBackgroundColor) {
                    this.hoverBackgroundColor = hoverBackgroundColor;
                }

                private void setPressedBackgroundColor(Color pressedBackgroundColor) {
                    this.pressedBackgroundColor = pressedBackgroundColor;
                }
            }
        MyButton but201 = new MyButton("Retry");
        but201.setForeground(new Color(255, 255, 255).brighter());
        but201.setBorder(BorderFactory.createLineBorder(Color.black));
        but201.setBackground(new Color(90, 50, 30).brighter());
        but201.setHoverBackgroundColor(new Color(90, 50, 30).brighter().brighter());
        but201.setPressedBackgroundColor(new Color(90, 50, 30).brighter().brighter().brighter());
        but201.setVerticalTextPosition(AbstractButton.BOTTOM);
        but201.setHorizontalTextPosition(AbstractButton.CENTER);
        but201.setEnabled(true);
        but201.setSize(60,18);
        but201.setMargin (new Insets(1, 1, 1, 1));
        but201.setFocusPainted(false);
        but201.setLocation(45,32);
        panel.add(but201);
        but201.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (getTimerLabel()!= null) {
                    timerLabel.StopTimer();
                   timerLabel.setVisible(false);
                   setTimerLabel(null);
                }
                g1.setText(Integer.toString(500));
                setF1(500);
                setW1(0);
                setJ1(0);
                setW2(0);
                setJ2(0);
                setW3(0);
                setJ3(0);
                setW4(0);
                setJ4(0);
                setW5(0);
                setJ5(0);
                setW6(0);
                setJ6(0);
                List<Integer> lo1=new ArrayList<>();
                List<Integer> lo2=new ArrayList<>();
                List<Integer> lo3=new ArrayList<>();
                List<Integer> lo4=new ArrayList<>();
                List<Integer> lo5=new ArrayList<>();
                List<Integer> lo6=new ArrayList<>();
                li1.clear();
                li2.clear();
                li3.clear();
                li4.clear();
                li5.clear();
                li6.clear();
                setLi1(lo1);
                setLi2(lo2);
                setLi3(lo3);
                setLi4(lo4);
                setLi5(lo5);
                setLi6(lo6);
                l29.setText(getR1());
                l30.setText(getR2());
                l31.setText(getR3());
                l32.setText(getR4());
                l33.setText(getR5());
                l34.setText(getR6());
                setPorah(0);
            }}));


        MyButton but202 = new MyButton("Settings");
        but202.setForeground(new Color(255, 255, 255).brighter());
        but202.setBorder(BorderFactory.createLineBorder(Color.black));
        but202.setBackground(new Color(90, 50, 30).brighter());
        but202.setHoverBackgroundColor(new Color(90, 50, 30).brighter().brighter());
        but202.setPressedBackgroundColor(new Color(90, 50, 30).brighter().brighter().brighter());
        but202.setVerticalTextPosition(AbstractButton.BOTTOM);
        but202.setHorizontalTextPosition(AbstractButton.CENTER);
        but202.setEnabled(true);
        but202.setSize(60,20);
        but202.setMargin (new Insets(1, 1, 1, 1));
        but202.setFocusPainted(false);
        but202.setLocation(45,57);
        panel.add(but202);
        class Settings extends JFrame {
            Settings() {
                super("Settings");
                setLayout(null);
                String ssss = "Login / Switch user / Register new user";
                String ssss2 = "Choose your avatar";
                class Beb1 extends JLabel {
                    private Beb1(String ssss, int y) {
                        super(ssss);
                        setSize(250, 20);
                        setLocation(0, y);
                        setVerticalAlignment(JLabel.TOP);
                    }
                }
                Beb1 b1 = new Beb1(ssss, 20);
                b1.setLocation(11, 20);
                getContentPane().add(b1);
                Beb1 b2 = new Beb1(ssss2, 20);
                b2.setLocation(11, 140);
                getContentPane().add(b2);
                final JTextField t1=new JTextField(20);
                t1.setVisible(true);
                t1.setDocument(new PlainDocument() {
                    @Override
                    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
                        if(!str.matches("^[a-zA-Z\\s]*$")) return;
                        if ((getLength() + str.length()) <= 20) {
                            super.insertString(offset, str, attr);
                        }
                    }
                });
                t1.setBounds(50,50,150,20);
                getContentPane().add(t1);
                final JTextField t2=new JTextField(20);
                t2.setVisible(true);
                t2.setDocument(new PlainDocument() {
                    @Override
                    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
                        if(!str.matches("^[a-zA-Z\\s]*$")) return;
                        if ((getLength() + str.length()) <= 20) {
                            super.insertString(offset, str, attr);
                        }
                    }
                });
                t2.setBounds(50,80,150,20);
                getContentPane().add(t2);
                JButton but301=new JButton("OK");
                but301.setBounds(90,110,70,20);
                but301.setFocusPainted(false);
                getContentPane().add(but301);
                but301.addActionListener((new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(!t1.getText().equals("")&&!t2.getText().equals("")&&!t1.getText().equals(" ")&&!t2.getText().equals(" ")) {
                            setLogin(t1.getText());
                            setPassword(t2.getText());
                            l201.setText(t1.getText());

                            Session session = HibernateUtil.getSessionFactory().openSession();
                            session.beginTransaction();
                            final List<User> result = session.createQuery("from User order by id").list();
                            session.getTransaction().commit();
                            for(int aa=1;aa<result.size();aa++) {
                                if(result.get(aa).getLogin().equals(t1.getText())&&result.get(aa).getPassword().equals(t2.getText())){
                                    setLogin(t1.getText());
                                    setPassword(t2.getText());
                                    l201.setText(t1.getText());
                                    System.out.println("1");
                                    break;
                                }else if(result.get(aa).getLogin().equals(t1.getText())&&!result.get(aa).getPassword().equals(t2.getText())){
                                    System.out.println("2");
                                    JOptionPane.showMessageDialog(null, "Wrong login or password!");
                                    break;
                                }else if(aa==result.size()-1&&!result.get(aa).getLogin().equals(t1.getText())){

                                    System.out.println("3");
                                    setLogin(t1.getText());
                                    setPassword(t2.getText());
                                    session.beginTransaction();
                            User user = new User();
                            user.setId(1);
                            user.setLogin(getLogin());
                            user.setPassword(getPassword());
                            session.save(user);
                            session.getTransaction().commit();
                                    l201.setText(t1.getText());
                                    JOptionPane.showMessageDialog(null, "Created new user!");
                                }}
                        }else JOptionPane.showMessageDialog(null, "Wrong login or password!");

                    }}));
                class RadioButtonDemo extends JPanel
                        implements ActionListener {
                    private String birdString = "1";
                    private String catString = "2";
                    private String dogString = "3";


                    private JLabel picture;

                    private RadioButtonDemo() {
                        super(new BorderLayout());
                        setEnabled(true);
                        setSize(250,200);
                        setLocation(10,140);
                        //Create the radio buttons.
                        JRadioButton birdButton = new JRadioButton(birdString);
                        birdButton.setMnemonic(KeyEvent.VK_B);
                        birdButton.setActionCommand(birdString);
                        birdButton.setSelected(true);

                        JRadioButton catButton = new JRadioButton(catString);
                        catButton.setMnemonic(KeyEvent.VK_C);
                        catButton.setActionCommand(catString);

                        JRadioButton dogButton = new JRadioButton(dogString);
                        dogButton.setMnemonic(KeyEvent.VK_D);
                        dogButton.setActionCommand(dogString);


                        //Group the radio buttons.
                        ButtonGroup group = new ButtonGroup();
                        group.add(birdButton);
                        group.add(catButton);
                        group.add(dogButton);

                        //Register a listener for the radio buttons.
                        birdButton.addActionListener(this);
                        catButton.addActionListener(this);
                        dogButton.addActionListener(this);


                        //Set up the picture label.
                        picture = new JLabel(createImageIcon("/"
                                + birdString
                                + ".png"));

                        //The preferred size is hard-coded to be the width of the
                        //widest image and the height of the tallest image.
                        //A real program would compute this.
                        picture.setPreferredSize(new Dimension(177, 102));


                        //Put the radio buttons in a column in a panel.
                        JPanel radioPanel = new JPanel(new GridLayout(0, 1));
                        radioPanel.add(birdButton);
                        radioPanel.add(catButton);
                        radioPanel.add(dogButton);


                        add(radioPanel, BorderLayout.LINE_START);
                        add(picture, BorderLayout.CENTER);
                        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));


                    }

                    /**
                     * Listens to the radio buttons.
                     */
                    public void actionPerformed(ActionEvent e) {
                        picture.setIcon(createImageIcon("/"
                                + e.getActionCommand()
                                + ".png"));
                        imageLabel.setIcon(new ImageIcon(getClass().getResource("/"+e.getActionCommand()+".png")));
                        System.out.println(" " + e.getActionCommand());
                    }

                    /**
                     * Returns an ImageIcon, or null if the path was invalid.
                     */
                    private ImageIcon createImageIcon(String path) {
                        java.net.URL imgURL = RadioButtonDemo.class.getResource(path);
                        if (imgURL != null) {
                            return new ImageIcon(imgURL);
                        } else {
                            System.err.println("Couldn't find file: " + path);
                            return null;
                        }
                    }

                }

                RadioButtonDemo newContentPane = new RadioButtonDemo();

                newContentPane.setOpaque(true); //content panes must be opaque
                newContentPane.setVisible(true);

                getContentPane().add(newContentPane);

                setSize(250, 400);
                setLocationRelativeTo(null);
                setResizable(false);
                setVisible(true);
            }}
        but202.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Settings();
            }}));

        MyButton but203 = new MyButton("Rules");
        but203.setForeground(new Color(255, 255, 255).brighter());
        but203.setBorder(BorderFactory.createLineBorder(Color.black));
        but203.setBackground(new Color(90, 50, 30).brighter());
        but203.setHoverBackgroundColor(new Color(90, 50, 30).brighter().brighter());
        but203.setPressedBackgroundColor(new Color(90, 50, 30).brighter().brighter().brighter());
        but203.setVerticalTextPosition(AbstractButton.BOTTOM);
        but203.setHorizontalTextPosition(AbstractButton.CENTER);
        but203.setEnabled(true);
        but203.setSize(60,20);
        but203.setMargin (new Insets(1, 1, 1, 1));
        but203.setFocusPainted(false);
        but203.setLocation(45,82);
        panel.add(but203);
        but203.addActionListener((new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    new Rules();
                    }}));

        myThready.start();
        myThready2.start();
        myThready3.start();


        setContentPane(panel);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
       new Game();

    }
}