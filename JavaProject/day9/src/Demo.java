public class Demo{
	public static void main(String[] args){
		//关系运算符只与值的大小有关，与类型无关
		float a = 1.0f;
		int b = 1;
		int d = 56;
		System.out.println(a == b);
		//位运算，小于表示*2的X次方，大于表示/2的X次方
		System.out.println(16 >> 3);
		System.out.println("HelloWorld");
		for (int c = 0;b <= 100;++b){
			c += b;
			System.out.print(c);
			System.out.println("------------" + b);
		}
		System.out.println("====================================");
		System.out.println(b);
		//由左至右进行运算，+被当成字符串连接用
		System.out.println("b + d ="+ b + d);
		//加上括号，使b + d优先运算
		System.out.println("b + d ="+ (b + d));
		//也可以引用另一个值，直接代入
		int r;
		r = b + d;
		System.out.println("b + d =" + r);
		//使b,d的值可见，加号做字符串连接用
		System.out.println(d + "+" + b + "=" + (d + b) );
		String username = "username";
		System.out.println("登陆成功，欢迎"+username+"回来");
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		//三目运算符----布尔表达式?表达式1:表达式2
		//值1，值2类型必须一致
		//布尔值为true输出1，布尔值为false输出2，例：
		boolean name = true;
		String q = name ? "真名字" : "假名字";
		System.out.println(q);
		boolean z = true;
		boolean v = false;
		if (v) {
			System.out.println("123");
		} else {
			System.out.println("456");
		}
		//设一个成绩
		int demo = 94;
		//控制成绩的输入范围，这段可以加入else里面
		if (demo < 0 || demo > 100){
			System.out.println("对不起，您输入的成绩有误");
		} else if (demo >= 90){
			System.out.println("A");
		} else if (demo >= 80){
			System.out.println("B");
		}
	}
	
}