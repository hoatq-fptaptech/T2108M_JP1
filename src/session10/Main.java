package session10;

import java.io.*;

public class Main {
    public static void main(String args[]){
        // write file
        try {
            FileOutputStream fos = new FileOutputStream("data.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeBytes("Xin chao T2108M\n");
            dos.writeBytes("Day la mon JP1\n");
            dos.writeBytes("Thu 4 tuan sau se thi het mon");

            // read file
            FileInputStream fis = new FileInputStream("data.bin");
            DataInputStream dis = new DataInputStream(fis);
            String txt = dis.readLine();
            while (txt != null){
                System.out.println(txt);
                txt = dis.readLine();
            }

        }catch (FileNotFoundException f){
            System.out.println("File not found");
        }catch (IOException io){
            System.out.println("Error..");
        }

    }
}
