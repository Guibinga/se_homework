package example;
/*
* 这个类用来提供给客户选择哪种锅底
* */
public class HotPotStore {
	//这里先创建一个超级工厂类属性的变量，用于后面调用方法
	  private  PotFactory potFactory;
	  //再给这个属性赋值，利用多态的思想。父类引用指向了子类的时候，我们在运行时会使用子类的方法和属性
	  public void setPotFactory(PotFactory potFactory) {
	      this.potFactory = potFactory;
	  }
	  //通过这个方法返回对应子类实例对象，
	  public HotPot ChooseHot(){
	      return  potFactory.CreateFactory();
	  }
}
