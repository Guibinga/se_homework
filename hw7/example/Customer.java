package example;
//测试
/*
* 测试类
* 我是顾客，我选择重庆火锅
* */
public class Customer {
	public static void main(String[] args) {
		//1.先去火锅店。 创建一个火锅店对象
		HotPotStore hotPotStore =new HotPotStore();
		//2.告诉了店员我要成都火锅。再由成都锅底工厂创建实例
		CDFactory cdFactory =new CDFactory();
		//3.将工厂生产的成都锅底从库房拿到店里。利用多态将子类实例化对象传进去
		hotPotStore.setPotFactory(cdFactory);
		//4.将成都锅底放进锅里。调用方法将生成的实例化对象返回出来。
		HotPot hotPot = hotPotStore.ChooseHot();
		//5.把火锅端上桌。可以用这个实例继续做对应的操作
		System.out.println(hotPot.getName());
  }
}
