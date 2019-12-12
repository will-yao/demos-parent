import org.apache.commons.lang3.StringUtils;

import java.util.EnumSet;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/19
 **/
public class TestMain {

    public static void main(String[] args) {

        String s = "$awfja,哈哈\n" +
                "alijfajf%\n" +
                "$测试%";

        String s1 = StringUtils.removeAll(s, "\\$|\\%");
        System.out.println(s);
        System.out.println(s1);

    }
}
