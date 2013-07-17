package net.twcic;
 
import java.util.EnumSet;
 
enum FontConstant { Plain, Bold, Italic };
 
public class EnumSetDemo {
    public static void main(String args[]) {
        // 建立 EnumSet 並設定其元素內容
        EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Plain, FontConstant.Bold);
        //顯示 Set 中內容
        showEnumSet(enumSet);
        // 顯示 Set 中 Enumerate 的互補內容
        showEnumSet(EnumSet.complementOf(enumSet));
 
        // 建立空的 EnumSet 再一一加入元素
        EnumSet<FontConstant> enumSetEmpty = EnumSet.noneOf(FontConstant.class);
        enumSetEmpty.add(FontConstant.Bold);
        enumSetEmpty.add(FontConstant.Italic);
        showEnumSet(enumSetEmpty);
    }    
 
    public static void showEnumSet(EnumSet<FontConstant> enumSet) {
        for(FontConstant constant : enumSet)
            System.out.print(constant + " ");
        System.out.println();
    }
}