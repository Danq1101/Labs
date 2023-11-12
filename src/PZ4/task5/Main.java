package PZ4.task5;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        Scanner s = new Scanner(System.in);
        System.out.print("enter info of ur file: ");
        String str = s.nextLine();
        File file = new File("newfile.txt");
        File file1 = new File("newfile1.txt");
        try {
            if (!file.exists())
                file.createNewFile();
            if (!file1.exists())
                file1.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.println(str);
            pw.close();
            String str1, str2 = null;
            br = new BufferedReader(new FileReader("newfile.txt"));
            System.out.println("Hello from first file");
            while ((str1 = br.readLine()) != null){
                System.out.println(str1);
                str2 = str1;
            }
            PrintWriter pw1 = new PrintWriter(file1);
            pw1.println(str2);
            pw1.close();
            br = new BufferedReader(new FileReader("newfile1.txt"));
            System.out.println("Hello from second file");
            while ((str2 = br.readLine()) != null)
                System.out.println(str2);
            br.close();
            file.delete();
            file1.delete();
//            File file1 = new File("newfile1.txt");
//            if (!file1.exists())
//                file1.createNewFile();
//            PrintWriter pw1 = new PrintWriter(file1);
//            pw1.println(str1);
//            pw1.close();
//            String str2;
//            System.out.println("Hello from second file");
//            while ((str2 = br.readLine()) != null){
//                System.out.println(str2);
//            }
//            pw1.println(str2);
//            pw1.close();
//            file.delete();
//            file1.delete();
        }catch (IOException e){
            System.out.println("Error" + e);
        }finally {
            try {
                br.close();
            }catch (IOException e){
                System.out.println("Error" + e);
            }
        }
    }
}
