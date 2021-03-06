package thinkjava.chapter2;

public class BasicType {
	// 基本类型：boolean char byte short int long float double void
	// 成员变量的默认值
	// boolean - ? - false
	// char - 16bit - '\u0000' （null）
	// byte - 8bit - 0
	// short - 16bit - 0
	// int - 32bit - 0
	// long - 64bit - 0
	// float - 32bit - 0.0
	// double - 64bit - 0.0
	// 局部变量不会初始化，而 Java 不允许使用使用未初始化的局部变量

	// 每个基本类型都对应一个包装类型
	
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}

	@SuppressWarnings("unused") // 忽略警告
	public void localVariable(int i) { // 方法名和参数列表被称为“方法签名”，唯一标识一个方法
		int var;
		// System.out.println(var); // Java 不允许使用使用未初始化的局部变量
	}

	@Deprecated // 弃用紧邻标签的属性
	public String localVariable(String s) {
		return s;
	}
}
