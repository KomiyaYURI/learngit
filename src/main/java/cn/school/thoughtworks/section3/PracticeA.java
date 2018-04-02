package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> collection2)
    {    //实现练习要求，并改写该行代码。
        String item = "value";

        List<String> list = collection2.get(item);

        for ( String i : collection2.get(item))
        {
            if(collectionA.containsKey(i)){//判断是否已经有该数值，如有，则将次数加1
                collectionA.put(i, collectionA.get(i).intValue() - 1);
            }else{
               // collectionA.put(obj, 1);
            }
        }

        return collectionA;
    }
}
