package camp.sparta.exception;

import java.io.*;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String readFile = sc.nextLine();
        String writeFile = sc.nextLine();

        Step1 step1 = new Step1();
        step1.fileReadAndWrite(readFile, writeFile);
    }

    void fileReadAndWrite(String readFile, String writeFile) throws RuntimeException {
        System.out.println("읽을 파일 : " + readFile);
        System.out.println("작성할 파일 : " + writeFile);

        try {
            InputStream in = new FileInputStream(readFile);
            OutputStream out = new FileOutputStream(writeFile);

            byte[] buffer = new byte[1024];
            int n;
            try {
                while ((n = in.read(buffer)) >= 0) {
                    out.write(buffer, 0, n);
                }
            }catch (IOException e) {
                System.out.println("예외4");
            }

            try {
                in.close();
                out.close();
            }catch (IOException e) {
                System.out.println("예외5");
            }
        }catch (FileNotFoundException e){
            System.out.println("예외6");
        }
    }
}