public class Text{

	public static void main(String[] args) {
		
		//创建丈夫对象

		Husband huangXiaoMing = new Husband();
		huangXiaoMing.name = "黄晓明";

		//创建妻子对象

		Wife baby = new Wife();
		baby.name = "杨颖";

		//结婚(通过丈夫找到妻子，通过妻子找到丈夫)
		huangXiaoMing.w = baby;
		baby.h = huangXiaoMing;
		//找你对象，属 于 你 的 对象
		//第一句话中，前者名字与后者名字没有关联，是单纯的将对象连接在一起
		//第二句话中，妻子名字是从丈夫对象中引用的，更能说明两者的关联性
		System.out.println(huangXiaoMing.name + "的对象是" + baby.name);
		System.out.println(huangXiaoMing.name + "的对象是" + huangXiaoMing.w.name);
	}
}