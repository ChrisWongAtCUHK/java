package net.twcic;
 
import java.util.EnumSet;
 
enum FontConstant { Plain, Bold, Italic };
 
public class EnumSetDemo {
    public static void main(String args[]) {
        // �إ� EnumSet �ó]�w�䤸�����e
        EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Plain, FontConstant.Bold);
        //��� Set �����e
        showEnumSet(enumSet);
        // ��� Set �� Enumerate �����ɤ��e
        showEnumSet(EnumSet.complementOf(enumSet));
 
        // �إߪŪ� EnumSet �A�@�@�[�J����
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