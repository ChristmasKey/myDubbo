# Dubbo笔记

![首图](https://img2.baidu.com/it/u=867579726,2670217964&fm=253&fmt=auto&app=120&f=JPEG?w=1280&h=800)

## 一、基础知识

### 1、分布式基础理论

**什么是分布式系统？**

《分布式系统原理与范型》定义：“分布式系统是若干独立计算机的集合，这些计算机对于用户来说就像单个相关系统”

分布式系统（distributed system）是建立在网络之上的软件系统。



随着互联网的发展，网站应用的规模不断扩大，常规的垂直应用架构已经无法应对，

分布式服务架构以及流动计算架构势在必行，亟需一个**治理系统**确保架构有条不紊的演进。



**应用架构的发展演变**

![Dubbo框架发展路线](./images/Dubbo框架发展路线.jpg)

单体应用 ==> 垂直应用 ==> 分布式服务 ==> 流动计算



**RPC**

什么叫RPC？

​		Remote Procedure Call，指远程过程调用，是一种进程间通信方式，它是一种技术的思想，而不是规范。

它允许程序调用另一个地址空间（通常是共享网络的另一台机器上）的过程或函数，而不用程序员显式编码这个远程调用的细节。

即程序员无论是调用本地的还是远程的函数，本质上编写的调用代码基本相同。



RPC基本原理

![RPC基本原理](./images/RPC基本原理.png)



RPC两个核心模块：通讯、序列化

RPC框架有很多：dubbo、gRPC、Thrift、HSF（High Speed Service Framework）



### 2、dubbo核心概念

**简介**

Apache Dubbo 是一款高性能、轻量级的开源Java RPC框架，它提供了三大核心能力：

- 面向接口的远程方法调用
- 智能容错和负载均衡
- 服务自动注册和发现

官网：http://dubbo.apache.org/



**设计架构**

![DubboArchitecture](./images/DubboArchitecture.jpg)



### 3、dubbo环境搭建

#### Zookeeper注册中心

![背景](./images/背景.png)

##### 1.下载[Zookeeper](https://zookeeper.apache.org/)

①

![下载Zookeeper1](./images/下载Zookeeper1.png)

②

![下载Zookeeper2](./images/下载Zookeeper2.png)

③我们下载最新的稳定版（<span style="color:red;">**这里我们应该改下载二进制包，如果下载了源码包会出现“Zookeeper启动错误2”！！（见下文）**</span>）

![下载Zookeeper3](./images/下载Zookeeper3.png)



##### 2.Windows平台部署

将下载好的`apache-zookeeper-3.7.1.tar.gz`解压，并在解压后的目录下创建一个存放数据的目录`jianan-data`

![Zookeeper解压目录结构](./images/Zookeeper解压目录结构.png)

接着我们需要将`conf`目录下的 **zoo-sample.cfg** 复制为 **zoo.cfg** 作为Zookeeper的配置文件，

并对配置文件做如下修改：

![Zookeeper配置文件](./images/Zookeeper配置文件.png)



然后我们就可以去`bin`目录下通过 **cmd终端** 执行 **zkServer.cmd** 来启动Zookeeper了

<span style="color:red;">Zookeeper启动错误1：“Error:  JAVA_HOME is not set."</span>

![Zookeeper启动错误1](./images/Zookeeper启动错误1.png)

==这是因为我们没有在本机的环境变量中配置"JAVA_HOME"，需要去配置一下==

==注意配置时不要把路径指向jdk下的bin目录，因为Zookeeper会自动加上bin目录==

<span style="color:red;">Zookeeper启动错误2：“找不到或无法加载主类”</span>

![Zookeeper启动错误2](./images/Zookeeper启动错误2.png)

==这是因为我们下载了源码包，应该改下apache-zookeeper-3.7.1-bin.tar.gz==

==注：zookeeper 好像从 3.5 版本以后，命名就发生了改变，如果是 apache-zookeeper-3.5.5.tar.gz 这般命名的，都是未编译的，而 apache-zookeeper-3.5.5-bin.tar.gz 这般命名的，才是已编译的包。==

<span style="color:red;">Zookeeper启动错误3：找不到配置文件zoo.cfg</span>

![Zookeeper启动错误3](./images/Zookeeper启动错误3.png)

<span style="color:green;">**Zookeeper启动成功!**</span>

![Zookeeper启动成功](./images/Zookeeper启动成功.png)

Zookeeper启动成功后，我们可以通过 **zkCli.cmd** 去连接Zookeeper服务器

*Zookeeper其实是一个树型的目录服务*

![Zookeeper客户端](./images/Zookeeper客户端.png)



#### 管理控制台





### 4、dubbo-helloworld



### 5、监控中心



### 6、整合SpringBoot





## 二、Dubbo配置



## 三、高可用



## 四、Dubbo原理