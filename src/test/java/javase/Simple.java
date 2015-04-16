package javase;

import com.apple.laf.AquaTreeUI;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by zhihaoguo on 15/4/9.
 */
public class Simple {
//    private  Simple(){}

    public static void main(String[] args) {
        Integer inta =new Integer(1);
        Object value = inta;
        if(value instanceof Float)
            System.out.println("Float");
        else if(value instanceof Integer)
            System.out.println("Integer");

        Map ob;


    }

}
