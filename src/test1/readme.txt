1. Shape与Comparable接口
改写实验4中的抽象类Shape，让其实现Comparable接口，实现对面积的排序；在测试类中创建Shape类型的数组或动态数组，里面有若干个Rectangle和Square对象，然后利用Arrays.sort或Collections.sort对该Shape数组或动态数组进行排序；输出排序后Shapes数组。
注意：所有的代码都应该放在合适的包中（包名自定）。

该实验做了两个版本主要区别是对Shape抽象的实现方式
version1将Shape定义为抽象类
    通过在抽象类中实现compareTo使Shape的子类能够用Array.sort排序
version2将Shape定义为接口
    通过在接口中用default修饰compareTo使实现Shape的类能够用Array.sort排序

在Java中实现抽象的方式有抽象类和接口，但是两种实现方式似乎没什么区别。
尤其在jdk1.8以后接口可以使用default和static关键字在接口中编写实例方法。
目前感觉唯一的区别就是接口可以做到多继承，抽象类不行

接口的一些tip
    接口的方法都是隐式抽象
    方法默认用publi c abstract修饰
    变量默认用public static final修饰
