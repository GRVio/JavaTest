/*
	需求:
		定义一一个计算机类[电脑/笔记本]，计算机类有哪些属性:
			*品牌
			*型号
			*颜色
		定义一一个学生类，学生类有哪些属性:
			*学号
			*姓名
			*学生有一台笔记本电脑
		请编写程序来表示以上的类，然后分别将类创建为对象，.
		对象数量不限，然后让其中的一个学生去使用其中的一台笔记本电脑.

		然后编译并运行，并且将整个执行过程采用图形的方武描述出来。
		所有的代码全部写到当前的java源文件当中
*/
class Computer{
	//
	String pinpai;
	//
	String xinghao;
	//
	String color;
}
class Studunt{
	//
	int id;
	//
	String name;
	//注意，此处Computer是引用，真正定义的变量为a
	//所以在引用时，要输入Studunt.a
	Computer a;
}
public class Test{

	public static void main(String[] args) {
		Computer com = new Computer();
		com.pinpai = "Lenovo";
		com.xinghao = "LEGION";
		com.color = "black";
		Studunt stu = new Studunt();
		stu.id = 123;
		stu.name = "Jack";
		stu.a = com;
		System.out.println(stu.a.pinpai);
	}
}