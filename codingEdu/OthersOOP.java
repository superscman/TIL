package codingEdu;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
    public static void main(String[] args) throws IOException {
        // class : System, Math, FileWriter
        // intance : f1, f2

        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));

        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" Java");

        FileWriter f2 = new FileWriter("data.txt");
        f2.write("Hello");
        f2.write(" Java2");
        f2.close();

        f1.write("!!!");
        f1.close();
    }
}
