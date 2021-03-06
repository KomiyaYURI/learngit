package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.String;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> map = new HashMap<String, Integer>();//新建一个map集合，用来保存重复的次数
        //String obj = new String();
        for (String obj : collection1){
                if(obj.length()>2)
                {
                    String item = Character.toString(obj.charAt(0));

                            int num = ((int)obj.charAt(2))-48;
                    if (map.containsKey(item)) {//判断是否已经有该数值，如有，则将次数加1
                        map.put(item , map.get(obj).intValue() + num);
                    } else {
                        map.put(item, num);
                    }
                }
                else {
                    if (map.containsKey(obj)) {//判断是否已经有该数值，如有，则将次数加1
                        map.put(obj, map.get(obj).intValue() + 1);
                    } else {
                        map.put(obj, 1);
                    }

                }
        }
        return map;


    }
}
