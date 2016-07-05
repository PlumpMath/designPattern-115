# 迭代子模式
## 简述
迭代子模式可以顺序访问一个聚集中的元素而不必暴露聚集的内部表象。<br>
迭代子可分为外禀迭代子和内禀迭代子。<br>
迭代子模式有两种实现方式，分别是白箱聚集与外禀迭代子和黑箱聚集于内禀迭代子。<br>

## 类图

![迭代子模式](https://github.com/lzh984294471/designPattern/raw/master/pics/iterator.jpg)

## 结构

* 抽象容器：一般是一个接口，提供一个iterator()方法，例如java中的Collection接口，List接口，Set接口等。
* 具体容器：就是抽象容器的具体实现类，比如List接口的有序列表实现ArrayList，List接口的链表实现LinkList，
Set接口的哈希列表的实现HashSet等。
* 抽象迭代器：定义遍历元素所需要的方法，一般来说会有这么三个方法：取得第一个元素的方法first()，取得下
一个元素的方法next()，判断是否遍历结束的方法isDone()（或者叫hasNext()），移出当前对象的方法remove().
* 迭代器实现：实现迭代器接口中定义的方法，完成集合的迭代。

