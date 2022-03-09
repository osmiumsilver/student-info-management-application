package cn.edu.jit.osmiumsilver.java.sims;

import cn.edu.jit.osmiumsilver.java.sims.utils.Encryptor;
import org.junit.Test;

/**
 * @author abel
 * @date 2022/3/9
 * @apinote
 */

public class TestEncryptor {
    static String str = Encryptor.MD5Encrypt("123");

    @Test
    public static void main(String[] args) {
        System.out.println(str);
    }
}