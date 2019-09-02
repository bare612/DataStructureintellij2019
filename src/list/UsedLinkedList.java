package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UsedLinkedList {

    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();
        list.add("MINNEAPOLIS");
        list.add("ST'PAUL");
        list.add("ROCHESTER");
        list.add("DULUTH");

         Iterator it1 = list.iterator();
         while (it1.hasNext()){
             System.out.println(it1.next());
         }
          list.remove("MINNEAPOLIS");
        System.out.println("After removing one node");
        Iterator it2 = list.iterator();
            while(it2.hasNext()){
                System.out.println(it2.next());
            }
    }
}
