import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args)throws java.io.IOException {
Copy c= new Copy();
        String[] empNo={"800777","755524","123456"};
        for (int i = 0; i < empNo.length; i++) {
            c.copyFile("C:\\Users\\ahmad\\Desktop\\cat2.jpg","C:\\Users\\ahmad\\Desktop\\newNames\\"+empNo[i]+".jpg");
        }


        /*File file1 = new File("C:\\Users\\ahmad\\Desktop\\cat2.jpg");

        File file2 = new File("C:\\Users\\ahmad\\Desktop\\cat2.jpg");

        boolean success = file1.renameTo(file2);
        if (!success) {
            System.out.println("Error trying to rename file");
        }*/
    }


}
