import java.lang.reflect.*;

public class Code {
	public String E000 = "a";
	public String E001 = "b";
	String E099 = "zz";
	
	// ���] str = "E000" �n���˶Ǧ^ �ܼ� E001 ����
	public void getCode(String str) {
		// http://www.javaworld.com.tw/jute/post/view?bid=5&id=11049&sty=3
		Field[] fields = this.getClass().getFields();
		// http://openhome.cc/Gossip/JavaEssence/ClassInfo.html
		//Field[] fields = this.getClass().getDeclaredFields();
		
		System.out.println("fields.length=" + fields.length);
		for (int i = 0; i < fields.length; i++)
			System.out.println("field[" + i + "]=[" + fields[i].toString()
					+ "]");
		// �ثe�ڬO�Q�ΤW�����覡�i�H�h�o �ܼƪ��W��, �i�O�ȩO?

		// �S�ݨ� �i�H�� Class.getDeclaredField �覡���o Field
		// �i�O Field���Φb�o��??
	}
	
}