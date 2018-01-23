package com.chinasoft.lgh.swing.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Administrator
 */
public class DemoFrame extends JFrame {

    private static float opacity = 0f;
    private static int n = 1;
    private static DemoFrame demoFrame;

    private static Timer timer = new Timer(20, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if(opacity <= 1){
                System.out.println(opacity);
                demoFrame.setOpacity(opacity);
                opacity = 0.1f * n;
                n += 1;
            }else {
                timer.stop();
            }
        }
    });


    public DemoFrame() throws HeadlessException {
        super("asdasd");
        demoFrame = this;
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        this.setSize(800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setOpacity(opacity);
        timer.start();
    }



    public static void main(String[] args) {
        new DemoFrame();
    }
}
