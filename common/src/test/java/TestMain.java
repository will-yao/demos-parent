import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Lists;
import org.springframework.beans.BeanUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/19
 **/
public class TestMain {

    public static void main(String[] args) {

//        String s = "$awfja,哈哈\n" +
//                "alijfajf%\n" +
//                "$测试%";
//
//        String s1 = StringUtils.removeAll(s, "\\$|\\%");
//        System.out.println(s);
//        System.out.println(s1);


//        List<ActionDO> list = Lists.newArrayList();
//        list.add(new ActionDO());
//        list.add(new ActionDO());
//        list.add(new ActionDO());
//
//        //System.out.println(list.toString());
//
//        list.forEach(s -> s.setAttributes("2"));
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now.getYear());
//        System.out.println(now.minusYears(1).getYear());
//        System.out.println( now.plusYears(1).getYear());
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(2020, 1, 29);
//        System.out.println(simpleDateFormat.format(calendar.getTime()) );
//        calendar.add(Calendar.YEAR,4);
//        System.out.println(simpleDateFormat.format(calendar.getTime()) );
//        calendar.add(Calendar.YEAR,-1);
//        System.out.println(simpleDateFormat.format(calendar.getTime()) );
//        calendar.add(Calendar.YEAR,100);
//        System.out.println(simpleDateFormat.format(calendar.getTime()) );
        //Map<String,ActionDO> mapMap = Maps.newHashMap();
//        ActionDO actionDO = new ActionDO();
//        ActionDO actionDO2 = new ActionDO();
//        actionDO2.setActionDO(new ActionDO());
//        actionDO.setActionDO(actionDO2);
//
//
//        Optional.ofNullable(actionDO)
//                .map(m -> m.getActionDO())
//                .map(m2 -> m2.getActionDO())
//                .ifPresent(actionDO1 -> {
//                    actionDO1.setAttributes("222");
//                });
//        System.out.println(actionDO.getActionDO().getActionDO().getAttributes());

        List<Integer> l = Lists.newArrayList(1, 2, 18, 4, 5, 6, 7, 8, 9);
        Integer max = l.stream().reduce(10, (a, b) -> {
           return a > b ? a:b;
        });


        System.out.println(max);


    }

    private static void test(Test t){
        TT test = new TT();
        test.setM("haha");
        BeanUtils.copyProperties(test,t);
        t = new Test();
    }

    private static boolean isLocalPayAction(ActionDO paymentActionDO) {

        return Optional.ofNullable(paymentActionDO)
                .map(action -> action.getAttributes())
                .map(attributes -> JSONObject.parseObject(attributes))
                .map(attrJson -> StringUtils.equals(attrJson.getString("scenario"), "localPay"))
                .orElse(false);
    }
}
