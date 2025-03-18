## 详细笔记
https://1663784811.github.io/

详细笔记在上地址: 基本示例中可以找到


## 分库中的垂直拆分 ( 拆分为微服务 )
test01-jpa
```text
多数据源: 按业务模块拆分至不同的数据库, 比如 用户模块、 订单模块、 商品模块 
```

## 分库中的水平拆分 ( 读写分离 )
test02-sharding-jpa

```text
1.数据库原理
    主库: 开启binlog ( sql操作的二进制日志 )
    从库: 监听主库的二进制日志变化，当变化时在从库执行对应的sql
2.应用程序原理
    主库数据源
        写
        开启事务时，读写都在主库操作
    从库数据源
        只读
```



## 分表中的垂拆分
表逻辑问题不做代码示例
```text
原理: 一张大表有100个字段，拆分成两张或多张小表

```


## 分表中的水平拆分 与 分库也分表
test03-sharding-jpa

```text
原理: 将一张表的数据, 按一定策略( 比如ID 1到500万 , 或者 按表数量取余 ) 划分到不同的表


```













