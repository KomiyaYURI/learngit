package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<String, Integer>();//新建一个map集合，用来保存重复的次数
        //String obj = new String();
        for (String obj : collection1){
            if(map.containsKey(obj)){//判断是否已经有该数值，如有，则将次数加1
                map.put(obj, map.get(obj).intValue() + 1);
            }else{
                map.put(obj, 1);
            }
        }
        return map;
    }
}
