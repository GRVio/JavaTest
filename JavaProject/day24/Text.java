//测试类
//什么是引用？
//	-保存一个地址，指向对象就是引用！
public class Text{
	
	public static void main(String[] args) {
	
	//新建一个用户
	//u是局部变量/引用/指向堆内存
	User u = new User();

	//输出User内部实例变量的值
	System.out.println(u.no);
	System.out.println(u.name);
	System.out.println(u.addr);

	//修改user内部实例变量的值、
	//字符串也是引用数据类型，String.class
	//也会在堆内存中指向对象
	u.no = 123123001;
	u.name = "王小美";
	System.out.println("用户编号为: " + u.no);
	System.out.println("用户名称为: " + u.name);

	//新建一个新对象来替换user内部的值
	//去堆内存中开辟一个Address新空间指向addr对象
	//因为等号右边会先执行，所以会先在堆内存中开一块新空间
	//其中包括Address.class中所有的量
	//addr中只含有Address的地址
	//这个嵌套如同在计算机里不断点开文件夹一样
	//u文件夹下：no;name;addr  addr文件夹下又有city;street;zipcode
	u.addr = new Address();
	System.out.println("用户地址(城市): " + u.addr.city);
	//113---23.20
	}
}