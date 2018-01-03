/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.io;

import java.io.*;

/**
 *
 * @author Probir
 */
public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;

        try {
            InputStream in
                    = new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
