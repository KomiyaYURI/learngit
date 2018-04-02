package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> collection2) {
        Map<String, Integer> map = new HashMap<String, Integer>();//新建一个map集合，用来保存重复的次数
        //String obj = new String();
        for (String obj : collectionA){
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

        for ( String i : collection2.get("value"))
        {
            if(map.containsKey(i)){//判断
                int num = map.get(i).intValue() /3;
                map.put(i, map.get(i).intValue() - num);


            }else{
                // collectionA.put(obj, 1);
            }
        }



        return map;


    }
}
