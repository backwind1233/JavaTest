import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by zhihaoguo on 15/4/16.
 */
public class StringUtilTest {
    @Test
    public void TestContains(){
        String a = "1";
        String b = "12";
        boolean bl=StringUtils.contains(b,a);
        System.out.println(bl);

    }
}
