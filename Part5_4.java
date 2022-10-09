/*Name: RISHI SHAH
ID: 21CE131
AIM : WAP to show use of character and byte stream.*/
 

import java.io.*;

public class Practical5_4 {
    public static void main(String[] args) throws IOException {
        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("C:\\Users\\RISHI\\OneDrive\\Desktop\\JAVA\\Part-5\\input.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);
        } finally {
            if (sourceStream != null)
                sourceStream.close();
        }
        
    }
}
