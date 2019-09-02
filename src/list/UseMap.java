package list;


import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String,String>();
        map.put("FRANCE", "PARIS");
        map.put("MEXICO","ACAPULCO");
        map.put("BRAZIL","RIO");

        for(Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println(entry.getValue());

        }



    }
}
