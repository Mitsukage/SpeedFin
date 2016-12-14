package ua.sf.spf;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Created by SupRas
 */
class TimerLabel extends JLabel
{
    TimerLabel(java.util.Timer timer, int x, int y)
    {
        setLocation(x,y);
        setPreferredSize(new Dimension(60,30));
        setSize(60,30);
        setForeground(new Color(0, 0, 0));
        setFont(new Font(getFont().getFontName(), getFont().getStyle(), 20));
        setVerticalAlignment(JLabel.TOP);
        setHorizontalAlignment(JLabel.CENTER);
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }

    private TimerTask timerTask = new TimerTask()
    {
        private volatile int time = -1;

        private Runnable refresher = new Runnable()
        {
            @Override
            public void run ()
            {
                int t = time;
                TimerLabel.this.setText(String.format("%02d:%02d", t / 60, t % 60));
            }
        };

        @Override
        public void run ()
        {
            time++;
            SwingUtilities.invokeLater(refresher);
        }


    };
    void StopTimer() {
        timerTask.cancel();

    }
}