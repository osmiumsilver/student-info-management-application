package sim.view;

import sim.model.UserType;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class MainFrm extends JFrame {

    public static UserType userType;
    public static Object userObject;
    private final JPanel contentPane;
    private final JDesktopPane desktopPane;
    private final JMenuItem addStudentMenuItem;
    private final JMenu manageClassMenu;
    private final JMenu manageTeacherMenu;
    private final JMenuItem addTeacherMenuItem;
    private final JMenu courseMenu;
    private final JMenuItem studentAttdentanceMenuItem;
    private final JMenuItem manageAttendanceMenuItem;
    private final JMenuItem statsAttendanceMenuItem;
    private final JMenuItem addScoreMenuItem;
    private final JMenuItem viewScoreMenuItem;
    private final JMenuItem manageScoreMenuItem;
    private final JMenuItem scoreStatsMenuItem;
    /**
     * Launch the application.
     */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainFrm frame = new MainFrm(null,null);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

    /**
     * Create the frame.
     */
    public MainFrm(UserType userType, Object userObject) {
        MainFrm.userType = userType;
        MainFrm.userObject = userObject;
        setTitle("\u5B66\u751F\u4FE1\u606F\u7CFB\u7EDF\u4E3B\u754C\u9762");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 936, 774);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("\u7CFB\u7EDF\u8BBE\u7F6E");
        menu.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menuBar.add(menu);

        JMenuItem menuItem = new JMenuItem("\u4FEE\u6539\u5BC6\u7801");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                editPassword(ae);
            }
        });
        menuItem.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menu.add(menuItem);

        JMenuItem menuItem_1 = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
        menuItem_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(MainFrm.this, "确定退出么？") == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });
        menuItem_1.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menu.add(menuItem_1);

        JMenu menu_1 = new JMenu("\u5B66\u751F\u7BA1\u7406");
        menu_1.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menuBar.add(menu_1);

        addStudentMenuItem = new JMenuItem("\u5B66\u751F\u6DFB\u52A0");
        addStudentMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddStudentFrm addStudentFrm = new AddStudentFrm();
                addStudentFrm.setVisible(true);
                desktopPane.add(addStudentFrm);
            }
        });
        addStudentMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menu_1.add(addStudentMenuItem);

        JMenuItem menuItem_3 = new JMenuItem("\u5B66\u751F\u5217\u8868");
        menuItem_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ManageStudentFrm studentManageFrm = new ManageStudentFrm();
                studentManageFrm.setVisible(true);
                desktopPane.add(studentManageFrm);
            }
        });
        menuItem_3.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menu_1.add(menuItem_3);

        manageClassMenu = new JMenu("\u73ED\u7EA7\u7BA1\u7406");
        manageClassMenu.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menuBar.add(manageClassMenu);

        JMenuItem menuItem_4 = new JMenuItem("\u73ED\u7EA7\u6DFB\u52A0");
        menuItem_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                addStudentClass(ae);
            }
        });
        menuItem_4.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        manageClassMenu.add(menuItem_4);

        JMenuItem menuItem_5 = new JMenuItem("\u73ED\u7EA7\u7BA1\u7406");
        menuItem_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ManageClassFrm classManageFrm = new ManageClassFrm();
                classManageFrm.setVisible(true);
                desktopPane.add(classManageFrm);
            }
        });
        menuItem_5.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        manageClassMenu.add(menuItem_5);

        manageTeacherMenu = new JMenu("\u6559\u5E08\u7BA1\u7406");
        manageTeacherMenu.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menuBar.add(manageTeacherMenu);

        addTeacherMenuItem = new JMenuItem("\u6DFB\u52A0\u6559\u5E08");
        addTeacherMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddTeacherFrm addTeacherFrm = new AddTeacherFrm();
                addTeacherFrm.setVisible(true);
                desktopPane.add(addTeacherFrm);
            }
        });
        addTeacherMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        manageTeacherMenu.add(addTeacherMenuItem);

        JMenuItem menuItem_8 = new JMenuItem("\u6559\u5E08\u5217\u8868");
        menuItem_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ManageTeacherFrm manageTeacherFrm = new ManageTeacherFrm();
                manageTeacherFrm.setVisible(true);
                desktopPane.add(manageTeacherFrm);
            }
        });
        menuItem_8.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        manageTeacherMenu.add(menuItem_8);

        courseMenu = new JMenu("\u8BFE\u7A0B\u7BA1\u7406");
        courseMenu.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menuBar.add(courseMenu);

        JMenuItem addCourseMenuItem = new JMenuItem("\u6DFB\u52A0\u8BFE\u7A0B");
        addCourseMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                AddCourseFrm addCourseFrm = new AddCourseFrm();
                addCourseFrm.setVisible(true);
                desktopPane.add(addCourseFrm);
            }
        });
        addCourseMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        courseMenu.add(addCourseMenuItem);

        JMenuItem courseListMenuItem = new JMenuItem("\u8BFE\u7A0B\u5217\u8868");
        courseListMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ManageCourseFrm manageCourseFrm = new ManageCourseFrm();
                manageCourseFrm.setVisible(true);
                desktopPane.add(manageCourseFrm);
            }
        });
        courseListMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        courseMenu.add(courseListMenuItem);

        JMenu menu_4 = new JMenu("\u9009\u8BFE\u7BA1\u7406");
        menu_4.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menuBar.add(menu_4);

        JMenuItem menuItem_2 = new JMenuItem("\u9009\u8BFE\u7BA1\u7406");
        menuItem_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ManageSelectedCourseFrm manageSelectedCourseFrm = new ManageSelectedCourseFrm();
                manageSelectedCourseFrm.setVisible(true);
                desktopPane.add(manageSelectedCourseFrm);
            }
        });
        menuItem_2.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menu_4.add(menuItem_2);

        JMenu menu_2 = new JMenu("\u7B7E\u5230\u8003\u52E4");
        menu_2.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menuBar.add(menu_2);

        studentAttdentanceMenuItem = new JMenuItem("\u5B66\u751F\u7B7E\u5230");
        studentAttdentanceMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                AttendanceStudentFrm attendanceStudentFrm = new AttendanceStudentFrm();
                attendanceStudentFrm.setVisible(true);
                desktopPane.add(attendanceStudentFrm);
            }
        });
        studentAttdentanceMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        studentAttdentanceMenuItem.setEnabled(false);
        menu_2.add(studentAttdentanceMenuItem);

        manageAttendanceMenuItem = new JMenuItem("\u7B7E\u5230\u7BA1\u7406");
        manageAttendanceMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ManageAttendanceFrm manageAttendanceFrm = new ManageAttendanceFrm();
                manageAttendanceFrm.setVisible(true);
                desktopPane.add(manageAttendanceFrm);
            }
        });
        manageAttendanceMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menu_2.add(manageAttendanceMenuItem);

        statsAttendanceMenuItem = new JMenuItem("\u7B7E\u5230\u7EDF\u8BA1");
        statsAttendanceMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StatsAttendanceFrm statsAttendanceFrm = new StatsAttendanceFrm();
                statsAttendanceFrm.setVisible(true);
                desktopPane.add(statsAttendanceFrm);
            }
        });
        statsAttendanceMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menu_2.add(statsAttendanceMenuItem);

        JMenu menu_5 = new JMenu("\u6210\u7EE9\u7BA1\u7406");
        menu_5.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menuBar.add(menu_5);

        addScoreMenuItem = new JMenuItem("\u5F55\u5165\u6210\u7EE9");
        addScoreMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                AddScoreFrm addScoreFrm = new AddScoreFrm();
                addScoreFrm.setVisible(true);
                desktopPane.add(addScoreFrm);
            }
        });
        addScoreMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menu_5.add(addScoreMenuItem);

        viewScoreMenuItem = new JMenuItem("\u6210\u7EE9\u67E5\u770B");
        viewScoreMenuItem.setEnabled(false);
        viewScoreMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ViewScoreFrm viewScoreFrm = new ViewScoreFrm();
                viewScoreFrm.setVisible(true);
                desktopPane.add(viewScoreFrm);
            }
        });
        viewScoreMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menu_5.add(viewScoreMenuItem);

        manageScoreMenuItem = new JMenuItem("\u6210\u7EE9\u7BA1\u7406");
        manageScoreMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ManageScoreFrm manageScoreFrm = new ManageScoreFrm();
                manageScoreFrm.setVisible(true);
                desktopPane.add(manageScoreFrm);
            }
        });
        manageScoreMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menu_5.add(manageScoreMenuItem);

        scoreStatsMenuItem = new JMenuItem("\u6210\u7EE9\u7EDF\u8BA1");
        scoreStatsMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                StatsScoreFrm statsScoreFrm = new StatsScoreFrm();
                statsScoreFrm.setVisible(true);
                desktopPane.add(statsScoreFrm);
            }
        });
        scoreStatsMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menu_5.add(scoreStatsMenuItem);

        JMenu menu_3 = new JMenu("\u5E2E\u52A9");
        menu_3.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menuBar.add(menu_3);

        JMenuItem menuItem_6 = new JMenuItem("\u5173\u4E8E\u6211\u4EEC");
        menuItem_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                aboutUs(ae);
            }
        });
        menuItem_6.setIcon(new ImageIcon(MainFrm.class.getResource("")));
        menu_3.add(menuItem_6);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        desktopPane = new JDesktopPane();
        desktopPane.setBackground(new Color(0, 128, 128));
        contentPane.add(desktopPane, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setAuthority();
    }

    protected void addStudentClass(ActionEvent ae) {
        // TODO Auto-generated method stub
        AddStudentClassFrm sca = new AddStudentClassFrm();
        sca.setVisible(true);
        desktopPane.add(sca);
    }

    protected void editPassword(ActionEvent ae) {
        // TODO Auto-generated method stub
        EditPasswordFrm editPasswordFrm = new EditPasswordFrm();
        editPasswordFrm.setVisible(true);
        desktopPane.add(editPasswordFrm);
    }

    protected void aboutUs(ActionEvent ae) {
        // TODO Auto-generated method stub
        String info = "【LittleUgly】制作\n";
        info += "计应1903李海光，学号：20191210088";
        info += "网址：http://www.littleugly.cn \n";
        info += "如果可以的话请关注我的B站账号：该号违规！";
        String[] buttons = {"迫不及待去看看!", "心情不好以后再说!"};
        int ret = JOptionPane.showOptionDialog(this, info, "关于我们", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION, new ImageIcon(LoginFrm.class.getResource("/images/logo.png")), buttons, null);
        if (ret == 0) {
            //采用Java 调用系统浏览器打开制定
            try {
                URI uri = new URI("http://www.littleugly.cn");
                Desktop.getDesktop().browse(uri);
                //Runtime.getRuntime().exec("explorer http://www.littleugly.cn");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "你真是狠心，坏淫！");
        }
    }

    private void setAuthority() {
        if ("学生".equals(userType.getName())) {
            addStudentMenuItem.setEnabled(false);
            manageClassMenu.setEnabled(false);
            manageTeacherMenu.setEnabled(false);
            courseMenu.setEnabled(false);
            studentAttdentanceMenuItem.setEnabled(true);
            manageAttendanceMenuItem.setEnabled(false);
            statsAttendanceMenuItem.setEnabled(false);
            addScoreMenuItem.setEnabled(false);
            viewScoreMenuItem.setEnabled(true);
            manageScoreMenuItem.setEnabled(false);
            scoreStatsMenuItem.setEnabled(false);
        }
        if ("教师".equals(userType.getName())) {
            addTeacherMenuItem.setEnabled(false);
        }
    }
}
