package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        Collection exists=new ArrayList<String>(collection1);
        Collection notexists=new ArrayList<String>(collection1);
        List<String> collection3 = collection2.get(0);
        exists.removeAll(collection3);
        notexists.removeAll(exists);
        List res = new ArrayList(notexists);
        //System.out.println("_second中存在于_set中的："+notexists);
        return res;
    }
}
