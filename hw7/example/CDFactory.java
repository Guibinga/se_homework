package example;

/*
* 子类的工厂实现类，我们用这个类来实现子类对象，并返回
* */
public class CDFactory implements PotFactory{
  @Override
  public HotPot CreateFactory() {
      return new CDPot();
  }
}
