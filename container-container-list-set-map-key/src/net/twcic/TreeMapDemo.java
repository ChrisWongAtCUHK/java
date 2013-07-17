package net.twcic;
 
import java.util.Map;
import java.util.TreeMap;
 
public class TreeMapDemo {
    public static void main(String args[]) {
        Map<String, String> stringMap = new TreeMap<String, String>();
        stringMap.put("godleon", "godleon �����");
        stringMap.put("leon", "leon �����");
        stringMap.put("bill", "bill �����");
 
        for(String s : stringMap.values())
            System.out.println(s);
        System.out.println();
        
        Map<Integer, String> integerMap = new TreeMap<Integer, String>();
        integerMap.put(4, "four");
        integerMap.put(99, "ninty nine");
        integerMap.put(5, "five");
 
        for(String s : integerMap.values())
            System.out.println(s);
        System.out.println();
    }
}