package cn.school.thoughtworks.section1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        Collection exists=new ArrayList<String>(collection1);
		Collection notexists=new ArrayList<String>(collection1);
		exists.removeAll(collection2);

		notexists.removeAll(exists);

        List res = new ArrayList(notexists);
       // System.out.println("_second中存在于_set中的："+notexists);
        return res;
    }
}
