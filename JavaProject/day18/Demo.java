public class Demo{

	public static void sum(long a,long b){
		System.out.println(a + "+" + b + "=" + (a + b));
	}
	public static int s1(int a,int b){
		//返回值 a/b
		//在调用函数时可以选择接受或不接受
		//若要接受需定义变量
		return a/b;
	}
	public static void main(String[] args){
		//存在自动数值转换，可以将int自动转为long
		Demo.sum(12,54);
		//但类型不同依然不能转换
		//Demo.sum(true,false);
		//Demo.sum(3.0,12);
		//但是加上强制类型转换后可以
		Demo.sum((long)3.0,12);
		//方法修饰符列表中有static时，调用类名可以省略不写
		sum(21,4);
		//使用其他类中的方法时，必须加"类名."
		A.msa();
		//调用不同类的同名方法
		A.sum();

	}
}


	//新建一个类,此处不能加public，只能公开一个类
	//建议一个java写一个class，
class A{
		public static void msa(){
			System.out.println("This is another class");
		}
		public static void sum(){
			System.out.println("A Class");
		}
}


