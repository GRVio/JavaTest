/**
*1.九九乘法表
*	多次重复动作，用循环
*	首先for循环，因为有两个变量，使用两个for循环嵌套
*	在内循环中加入制表符，使其看起来工整
*	在外循环末尾写换行
*	错误1：变量初始值定义为0，输出了不该出现的等式
*	错误2：变量2判断语句有误，由s <= 9修改为s <= i
*	成功
*	**修改了输出语句中变量s与变量i的位置，使表格更好看
*1.1使用while循环
*	while循环与for循环不同，很多东西要写循环体里
*	同for一样，两层循环
*	自增写循环体末尾，外层循环最后重置b的值
*2.等腰三角形
*	先使用for循环输出一个三角形
*	在每行前加入空格，依然使用for循环
*	输出结果为半个三角，修改断语句，使其每行输出多一倍的"*"
*	成功
*/
public class homework{

	public static void main(String[] args) {

		//九九乘法表-1
		//外层循环
		for (int i = 1;i <= 9; i++){
			//内层循环
			for (int s = 1;s <= i;s++){
				System.out.print(s + "*" + i + "=" + (i*s));
				//等式间隔
				System.out.print("	");
			}//换行
			System.out.println("");
		}

		//九九乘法表-2
		//定义变量
		int a = 1;
		int b = 1;
		//外层循环
		while (a <= 9){
			//内层循环
			while (b <= a ){
				System.out.print(b + "*" + a + "=" + (b*a));
				b++;
				//等式间距
				System.out.print("	");
			}//换行
			System.out.println("");
			//重置b的值并使a自增
			b = 1;a++;
		}

		//等腰三角形
		//外层循环
		for (int i = 1;i <= 9;i++){
			//每行前打印空格
			for (int q = 1;q <= 9-i;q++){
				System.out.print(" ");
			}//输出*号
			for (int s = 1;s <= 2*i-1;s++){
				System.out.print("*");
			}//换行
			System.out.println("");
		}
	}
}