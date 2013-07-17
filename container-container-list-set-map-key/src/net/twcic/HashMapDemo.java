package net.twcic;
 
import java.util.Map;
import java.util.HashMap;
 
public class HashMapDemo {
    public static void main(String args[]) {
        Map<String, String> map = new HashMap<String, String>();
 
        // 宣告 key
        String key1 = "leon";
        String key2 = "godleon";
 
        // 使用 put() 將資料存入 Map container 中
        map.put(key1, "leon 的資料");
        map.put(key2, "godleon 的資料");
 
        // 使用 get() 將資料從 Map container 取出
        System.out.println(map.get(key1));
        System.out.println(map.get(key2));
    }
}