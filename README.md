# 设计原则
## 开闭原则
> 抽象来构建框架，实现来扩展细节

对扩展开放，对修改关闭

优点：提高软件系统的可复用性及可维护性

核心思想：面向抽象编程

实例：Spring控制反转IoC

## 依赖倒转
> 抽象不应该依赖细节，细节应该依赖抽象

高层模块不应该依赖低层模块，二者都应该依赖抽象

优点：减少类与类之间的耦合，提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的风险。

核心思想：面向接口编程

案例：Spring IoC和AOP

## 单一职责原则
> 一个类/接口/方法只负责一项职责

不要存在多于一个导致类变更的原因

优点：降低类的复杂对、提高类的可读性，降低变更引起的风险

## 接口隔离原则
> 接口功能设计单一，细化接口

用多个专门的接口，而不使用单一的总接口，客户端不应该依赖它不需要的接口

优点：符合我们常说的高内聚低耦合的设计思想，增加可读性、可扩展性、可维护性。

注意：适度原则，一定要适度

## 迪米特原则
> 一个对象应该对其他对象保持最少了解

优点：降低类之间的耦合

## 里氏替换原则


子类可以扩展父类功能，但不能改变父类原有功能

解读：

- 子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法

- 子类可以有自己的方法

- 子类重载父类方法时，方法的入参要求要比父类低

- 子类方法实现父类方法时，返回值要比父类更严格

优点：1.约束继承的泛滥 2.增加程序健壮性

## 组合复用原则

尽量使用对象组合/聚合，而不是继承关系达到软件复用的目的

优点：使系统更加灵活，降低类与类之间的耦合。

# 设计模式
## 创建型

## 结构型



