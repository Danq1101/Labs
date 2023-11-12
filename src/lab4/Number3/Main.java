package lab4.Number3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        Scanner s = new Scanner(System.in);
        System.out.println("enter info of ur file:");
        String str = s.nextLine();
        try {
            File file = new File("newfile.txt");
            if (!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.println(str);
            pw.close();
            br = new BufferedReader(new FileReader("newfile.txt"));
            String str1;
            System.out.println("Hello from first file");
            while ((str1 = br.readLine()) != null){
                System.out.println(str1);
            }

            File file1 = new File("newfile1");
            if (!file1.exists())
                file1.createNewFile();
            PrintWriter pw1 = new PrintWriter(file1);
            pw1.println(br);
            pw1.close();
            br = new BufferedReader(new FileReader("newfile.txt"));
            String str2;
            System.out.println("Hello from second file");
            while ((str2 = br.readLine()) != null){
                System.out.println(str2);
            }
            file.delete();
            file1.delete();
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
