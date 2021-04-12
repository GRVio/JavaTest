public class test {

	public static void main(String[] args) {
		//新建对象
		customer a = new customer();
		//输出会员号，int默认值为0
		System.out.println(a.idCard);
		//让对象为null
		a = null;
		//发生空指针异常，注：编译通过，运行报错
		//java.lang.NullPointerException
		//什么时候会发生空指针异常："空引用访问实例相关的数据"
		//某个数据被访问时必须有对象的参与。这种数据就是实例相关的数据。
		System.out.println(a.idCard);
	}
}