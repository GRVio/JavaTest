public class Demo{
	public static void sum(int a,int b){
		int c = a + b;
		System.out.println(a + "+" +b + "=" +c);
		//调用abc方法，这..也算一种嵌套？大概
		//即使是调用方法，依然为java语句
		if(true){
			Demo.abc();
		}
	}
	public static void main(String[] args){
		//由于sum方法中嵌套了一个方法
		//所以此处执行完sum时，执行abc
		//abc结束后，结束sum，此时main继续执行
		Demo.sum(1,6);
		System.out.println("Hello world!");
	}
	public static void abc(){
		System.out.println("这是abc");
	}
}