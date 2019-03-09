package javaPack.basepac;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/1.
 */
public class TestClass<K,V> {
    private K k;
    private V v;

    public K say(){
        return k;
    }
    public <T>T say2(T t){
        return t;
    }
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put(null,null);

    }
}


