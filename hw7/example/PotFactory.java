package example;

//定义一个工厂接口 这个接口的作用是用来生成实例化对象的
//并且是由这个接口的实现类来确定生产那个类的实例化对象
//这样做的好处如果我们有新的类需要实例，我们不用去修改原代码
//而是添加一个新的实现类就行了
public interface PotFactory {
	HotPot CreateFactory();
}
