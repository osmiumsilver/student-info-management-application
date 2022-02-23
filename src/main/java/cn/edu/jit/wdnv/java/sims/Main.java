package cn.edu.jit.osmiumsilver.java.sims;

import cn.edu.jit.osmiumsilver.java.sims.view.LoginView;

import java.awt.*;

/*
Launcher
 */

public class Main {
    public static void main(String[] args) { //初始化Main JFrame
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new LoginView();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}




