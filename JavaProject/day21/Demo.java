public class Demo{
	/*以下方法功能相似，使用起来麻烦
	//计算两个int值
	public static int sumInt(int a,int b){
		return a + b;
	}
	//计算两个double值
	public static double sumDouble(double a,double b){
		return a + b;
	}
	//计算两个long值
	public static long sumLong(long a,long b){
		return a + b;
	}
	public static void main(String[] args) {
		int end1 = sumInt(1,2);
		System.out.println(end1);
		double end2 = sumDouble(1,2);
		System.out.println(end2);
		long end3 = sumLong(1,2);
		System.out.println(end3);
	}*/
	//方法重载(overLoad)   前提:方法的功能相似
	//功能不同时尽量不要用同一个名称
	public static int sum(int a,int b){
		return a + b;
	}
	public static double sum(double a,double b){
		return a + b;
	}
	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(2.1,3.1));
	}
}