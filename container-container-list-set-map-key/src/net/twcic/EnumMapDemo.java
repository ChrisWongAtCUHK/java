package net.twcic;
 
import java.util.Map;
import java.util.EnumMap;
 
public class EnumMapDemo {
    // �����w�q�� Enumerated Type
    private enum Action {TURN_LEFT, TURN_RIGHT, SHOOT};
 
    public static void main(String args[]) {
        // �[�J�������ȭ��� Enumerated Type ���ҭ��w��
        Map<Action, String> map = new EnumMap<Action, String>(Action.class);
        map.put(Action.TURN_LEFT, "�V����");
        map.put(Action.TURN_RIGHT, "�V�k��");
        map.put(Action.SHOOT, "�g��");
        
        for(Action action : Action.values())
            System.out.println(map.get(action));
    }
}