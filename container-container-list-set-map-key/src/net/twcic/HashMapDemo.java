package net.twcic;
 
import java.util.Map;
import java.util.HashMap;
 
public class HashMapDemo {
    public static void main(String args[]) {
        Map<String, String> map = new HashMap<String, String>();
 
        // �ŧi key
        String key1 = "leon";
        String key2 = "godleon";
 
        // �ϥ� put() �N��Ʀs�J Map container ��
        map.put(key1, "leon �����");
        map.put(key2, "godleon �����");
 
        // �ϥ� get() �N��Ʊq Map container ���X
        System.out.println(map.get(key1));
        System.out.println(map.get(key2));
    }
}