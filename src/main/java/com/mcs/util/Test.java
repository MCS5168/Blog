package com.mcs.util;

import java.io.File;

public class Test {

    private static void showFile(String path) {
        File f = new File(path);
        File[] fs = f.listFiles();

        if (fs == null) {
            return;
        }

        for (File file : fs) {
            if (file.isFile()) {
                System.out.println(file.getPath());
            } else {
                showFile(file.getPath());
            }
        }
    }

    public static void main(String[] args) {
        String path = "D:\\微信";
        showFile(path);
    }

}
