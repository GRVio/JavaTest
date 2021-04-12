public class Demo{
	public static void main(String[] args){
	//求质数，每8个换一行
	int h = 0;
	for(int a = 2;a <= 100;a++){
		boolean panDuan = true;
		for(int b = 2;b < a;b++){
			if(a % b == 0){
				panDuan = false;
				break;
			}
		}
		if(panDuan){
			System.out.print(a + "	");
			h++;
			if(h % 8 == 0){
				System.out.println();
				}
			}
		}
	/*	【方法】：在java中重复使用代码，提高代码的复用性
		这个【方法】，我们称之为“调用”--		/invoke
		为方便操作，新建一个档
	*/
	}
}
