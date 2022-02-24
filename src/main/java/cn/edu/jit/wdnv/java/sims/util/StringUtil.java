package cn.edu.jit.osmiumsilver.java.sims.util;

public class StringUtil { //判断数据的真实空白
    public static boolean isEmpty(String str) {
        return "".equals(str) || str == null;
    }
}
