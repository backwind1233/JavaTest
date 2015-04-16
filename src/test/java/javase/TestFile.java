package javase;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by zhihaoguo on 15/4/8.
 */
public class TestFile {
    @Test
    public void testFile() throws FileNotFoundException {
        FileOutputStream excelFile;
        excelFile = new FileOutputStream("/Users/plato1233/tefm.txt", false);

        ByteArrayOutputStream os = null;
            os = new ByteArrayOutputStream();
        try {
            excelFile.write("sdf".getBytes());
            excelFile.write("123123123".getBytes());
            excelFile.write("fdd".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
