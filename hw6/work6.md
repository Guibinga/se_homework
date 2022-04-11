># **Dependency inversion principle(依赖倒置原则)**
## 1. 定义
- 高层模块不要依赖低层模块；
- 高层和低层模块都要依赖于抽象；
- 抽象不要依赖于具体实现； 
- 具体实现要依赖于抽象；
- 抽象和接口使模块之间的依赖分离。
## 2. 实例解释
这也许听起来让人头大，但确实很容易理解。该原理允许去耦，这个例子似乎是解释该原理的最佳方法：
```C++
class PasswordReminder {
    private $dbConnection;

    public function __construct(MySQLConnection $dbConnection) {
        $this->dbConnection = $dbConnection;
    }
}
```
首先，MySQLConnection是低等级模块，然而PasswordReminder是高等级模块，但是根据 S.O.L.I.D. 中 D 的解释：依赖于抽象而不依赖与实现， 上面的代码段违背了这一原则，因为PasswordReminder类被强制依赖于MySQLConnection类。

该PasswordReminder类不应该关心什么数据库应用程序使用，以解决这个问题，我们再次“代码的接口”，因为高层次和低层次的模块应该依赖于抽象，我们可以创建一个界面：
```C++
interface DBConnectionInterface {
    public function connect();
}
```
该接口具有一个connect方法，而MySQLConnection类实现了此接口，而且也没有直接在PasswordReminder的构造函数中直接提示MySQLConnection类，而是改为提示该接口，无论应用程序使用哪种数据库类型，PasswordReminder类可以轻松连接到数据库而不会出现任何问题，并且不会违反OCP。
## 3.总结
这个设计原则的亮点在于任何被DI框架注入的类很容易用mock对象进行测试和维护，因为对象创建代码集中在框架中，客户端代码也不混乱。有很多方式可以实现依赖倒置，比如像AspectJ等的AOP（Aspect Oriented programming）框架使用的字节码技术，或Spring框架使用的代理等。