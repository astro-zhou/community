package com.zhou.community;

import java.io.IOException;

/**
 * @author zyh
 * @create 2022-10-26 10:15
 */
public class WkTests {

    public static void main(String[] args) {
        String cmd = "/usr/local/bin/wkhtmltoimage --quality 75 https://www.nowcoder.com /Users/mac/work/data/wk-images/4.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
