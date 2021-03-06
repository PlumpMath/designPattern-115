# 组合模式
## 简介
组合模式对单个对象(叶子对象)和组合对象(组合对象)具有一致性，它将对象组织到
树结构中，可以用来描述整体与部分的关系。同时它也模糊了简单元素(叶子对象)和
复杂元素(容器对象)的概念，使得客户能够像处理简单元素一样来处理复杂元素，从
而使客户程序能够与复杂元素的内部结构解耦。
组合模式使用面向对象的思想来实现树形结构的构建与处理，描述了如何将容器对象和
叶子对象进行递归组合，实现简单，灵活性好。由于在软件开发中存在大量的树形结构
，因此组合模式是一种使用频率较高的结构型设计模式，Java SE 中的 AWT 和 Swing
包的设计就基于组合模式，在这些界面包中为用户提供了大量的容器构件（如 
Container）和成员构件（如 Checkbox、Button 和 TextComponent等）。

## 结构

![组合模式](https://github.com/lzh984294471/designPattern/raw/master/pics/composite.jpg)

## 组合模式的优点

(1) 组合模式可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，它让
客户端忽略了层次的差异，方便对整个层次结构进行控制。
(2) 客户端可以一致地使用一个组合结构或其中单个对象，不必关心处理的是单个对象
还是整个组合结构，简化了客户端代码。
(3) 在组合模式中增加新的容器构件和叶子构件都很方便，无须对现有类库进行任何修
改，符合“开闭原则”。
(4) 组合模式为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子对象和
容器对象的递归组合，可以形成复杂的树形结构，但对树形结构的控制却非常简单。

## 组合模式的缺点

在增加新构件时很难对容器中的构件类型进行限制。有时候我们希望一个容器中只能有
某些特定类型的对象，例如在某个文件夹中只能包含文本文件，使用组合模式时，不能
依赖类型系统来施加这些约束，因为它们都来自于相同的抽象层，在这种情况下，必须
通过在运行时进行类型检查来实现，这个实现过程较为复杂。

## 适用场景

(1) 在具有整体和部分的层次结构中，希望通过一种方式忽略整体与部分的差异，客户
端可以一致地对待它们。
(2) 在一个使用面向对象语言开发的系统中需要处理一个树形结构。
(3) 在一个系统中能够分离出叶子对象和容器对象，而且它们的类型不固定，需要增加
一些新的类型。

