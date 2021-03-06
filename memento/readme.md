# 备忘录模式
## 简述
备忘录对象是一个用来存储另外一个对象内部状态的快照的对象。备忘录模式的用意是在不破坏封装的条件下，将一个对象的状态
捕捉(Capture)住，并外部化，存储起来，从而可以在将来合适的时候把这个对象还原到存储起来的状态。

## 类图

![备忘录模式](https://github.com/lzh984294471/designPattern/raw/master/pics/memento.png)

## 优点

1. 有时一些发起人对象的内部信息在发起人对象以外的地方，当必须又发起人自己读取，这时备忘录模式可以把复杂的
发起人的内部信息对其他对象屏蔽起来从而恰当的保持封装的边界。
2. 本模式简化了发起人，发起人不需要管理和保存内部状态的一个个版本。客户端可以自行的管理他们所需要的这些状
态的版本
3. 发起人角色状态改变时，有可能这个状态无效，这时候可以使用暂时存储起来的备忘录讲状态复原。


## 缺点

1. 如果发起人角色的状态需要完整的存到备忘录对象中，那么在资源消耗上备忘录可能很昂贵。
2. 当负责人将一个对象存储起来的时候，负责人可能并不知道这个状态占用太多的存储空间，从而无法提醒用户一个操作是否昂
贵。
3. 当发起人角色改变的时候，有可能这个协议无效。如果状态改变的成功率不高的话，不如采取“假如”协议模式。
