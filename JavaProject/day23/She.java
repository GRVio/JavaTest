/*
对象的创建和使用
*/
public class She{

	public static void main(String[] args) {
		
		int i =10;
		/*
		1.通过一个类，可以实例化n个对象
			-实例化对象的语法：new 类名 ();
		2.new是java语言中的一个运算符
			-作用是创建对象，在堆内存中创建新的内存空间
		3.Student是一个引用数据
			-s是对象内存的变量名【局部变量】
			-s中保存的是对象在堆内存中的地址

		4.new Student() 是一个学生对象
			-s是一个局部变量，在栈内存中储存
		5.什么是对象？
			-new在堆内存中开辟的内存空间
		6.什么是引用？
			-引用是一个变量，不过这个变量中保存了另一个java对象的内存地址
			java语言中，程序员不能直接操作堆内存
			只能通过“引用”去访问堆内存当中对象内部的实例变量
		*/
		 Student s = new Student();

		 //访问实例变量的语法格式:   
		 //读取数据----引用.变量名
		 //修改数据----引用.变量名 = 值

		 //读取
		 int stuNo = s.no;
		 String stuName = s.name;
		 int stuAge = s.age;
		 System.out.println("学号=" + stuNo);
		 System.out.println("姓名=" + stuName);
		 System.out.println("年龄=" + stuAge);
		 System.out.println("*****************");
		 //修改
		 s.no = 10010;
		 s.name = "Jack";
		 s.age = 18;
		 System.out.println("学号=" + s.no);
		 System.out.println("姓名=" + s.name);
		 System.out.println("年龄=" + s.age);

		 //再通过类实例化一个新对象
		 Student s1 = new Student();



	}
}