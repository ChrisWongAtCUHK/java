import java.lang.reflect.*;

public class Code {
	public String E000 = "a";
	public String E001 = "b";
	String E099 = "zz";
	
	// 假設 str = "E000" 要怎麼樣傳回 變數 E001 的值
	public void getCode(String str) {
		// http://www.javaworld.com.tw/jute/post/view?bid=5&id=11049&sty=3
		Field[] fields = this.getClass().getFields();
		// http://openhome.cc/Gossip/JavaEssence/ClassInfo.html
		//Field[] fields = this.getClass().getDeclaredFields();
		
		System.out.println("fields.length=" + fields.length);
		for (int i = 0; i < fields.length; i++)
			System.out.println("field[" + i + "]=[" + fields[i].toString()
					+ "]");
		// 目前我是利用上面的方式可以去得 變數的名稱, 可是值呢?

		// 又看到 可以用 Class.getDeclaredField 方式取得 Field
		// 可是 Field怎麼用在這裡??
	}
	
}