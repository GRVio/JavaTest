//当我们把成员变量看成方法，把创建对象看成调用方法
//他们只是不在同一个源文件中.....
//用户类
public class User{

	//属性【成员变量之{实例变量}】
	//一个类的具体属性--实例变量
	//如游戏角色的属性，攻击力、生命值

	//用户编号
	//int--基本数据类型--整数型
	//no--实例变量
	int no;

	//用户名
	//String--基本数据类型--字符串
	//name--实例变量
	String name;

	//家庭住址
	//Address--引用数据类型--自定义
	//addr--实例变量
	Address addr;

}