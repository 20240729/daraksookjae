package camp.sparta.exception;

import java.io.*;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String readFile = sc.nextLine();
        String writeFile = sc.nextLine();

        Step1 step1 = new Step1();
        step1.fileReadAndWrite(readFile, writeFile);
    }

    void fileReadAndWrite(String readFile, String writeFile) {
        System.out.println("읽을 파일 : " + readFile);
        System.out.println("작성할 파일 : " + writeFile);

        InputStream in = new FileInputStream(readFile);
        OutputStream out = new FileOutputStream(writeFile);

        byte[] buffer = new byte[1024];
        int n;
        while ((n = in.read(buffer)) >= 0) {
            out.write(buffer, 0, n);
        }

        in.close();
        out.close();
    }
}