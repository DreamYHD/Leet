package javaPack;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Administrator on 2018/5/26.
 */
public class Test {
    public static void main(String[] args) {

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>(0,0.75f,true);
        linkedHashMap.put("1","hi");
        linkedHashMap.put("2","how");
        linkedHashMap.put("3","are");
        linkedHashMap.put("4","you");
        linkedHashMap.get("1");
        linkedHashMap.get("2");
        for (HashMap.Entry<String, String> e :linkedHashMap.entrySet()) {
            System.out.printf(e.getKey()+" "+e.getValue());
        }


    }
}
