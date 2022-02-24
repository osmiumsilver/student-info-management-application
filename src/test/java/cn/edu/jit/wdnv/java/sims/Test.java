package cn.edu.jit.osmiumsilver.java.sims;

import cn.edu.jit.osmiumsilver.java.sims.view.MainFrm;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrm frame = new MainFrm(null,null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
