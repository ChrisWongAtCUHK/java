package net.twcic;
 
import java.util.Map;
import java.util.EnumMap;
 
public class EnumMapDemo {
    // 內部定義的 Enumerated Type
    private enum Action {TURN_LEFT, TURN_RIGHT, SHOOT};
 
    public static void main(String args[]) {
        // 加入的元素僅限於 Enumerated Type 中所限定的
        Map<Action, String> map = new EnumMap<Action, String>(Action.class);
        map.put(Action.TURN_LEFT, "向左轉");
        map.put(Action.TURN_RIGHT, "向右轉");
        map.put(Action.SHOOT, "射擊");
        
        for(Action action : Action.values())
            System.out.println(map.get(action));
    }
}