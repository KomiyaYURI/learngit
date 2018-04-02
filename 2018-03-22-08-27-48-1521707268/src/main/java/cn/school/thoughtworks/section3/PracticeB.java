package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        for ( String i : collection2.get("value"))
        {
            if(collectionA.containsKey(i)){//判断
                int num = collectionA.get(i).intValue() /3;
                collectionA.put(i, collectionA.get(i).intValue() - num);


            }else{
                // collectionA.put(obj, 1);
            }
        }

        return collectionA;



    }
}
