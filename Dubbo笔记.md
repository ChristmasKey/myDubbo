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

**Zookeeper注册中心**

![背景](./images/背景.png)

1.下载Zookeeper

①

![下载Zookeeper1](./images/下载Zookeeper1.png)

②

![下载Zookeeper2](./images/下载Zookeeper2.png)

③我们下载最新的稳定版

![下载Zookeeper3](./images/下载Zookeeper3.png)



2.Windows平台部署



### 4、dubbo-helloworld



### 5、监控中心



### 6、整合SpringBoot





## 二、Dubbo配置



## 三、高可用



## 四、Dubbo原理