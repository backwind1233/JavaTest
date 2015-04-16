import org.junit.Test;

/**
 * Created by zhihaoguo on 15/4/8.
 */
public class TestSubString {
    @Test
    public void test(){
        String str= "123";
        int endIndex = str.length()<4?str.length():4;
        System.out.println(str.substring(0,endIndex));
    }
}
