public class aboutReturn{

	//注意此处方法为void
	public static void a(){
		/*
		//return直接使用，作结束方法的语句
		return;
		*/
		for(int a = 1;a < 10;a++){
			if(a == 5){
				return;		//此处是结束方法而不是结束for循环
				//break;	//此处只结束循环而不结束方法	
			}
			System.out.println(a);			
		}
		System.out.println("HelloWorld!");	//因为方法结束，所以没有输出
	}

	public static void main(String[] args) {
		//调用a方法
		a();
	}
}