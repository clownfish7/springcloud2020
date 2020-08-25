### SpringCloud2020

---
[>_>]: 这是注释

概述：  
&emsp;这是 SpringCloud 常用组件组合的 Demo，源自周阳老师的课程，Demo包含...,
自行加入了 Spring-REST Docs,相较于 Swagger 而言，restdocs 使用占比比较低，
大多数企业都在用 Swagger ，毕竟不用写单元测试不是~，引入 restdocs 主要是想熟悉使用，
也督促自己多写写单元测试，习惯成自然！  
ps：以前也没有写 README.md 的习惯，好记性不如烂笔头！


环境：
+ system: windows 10
+ arch: amd64
+ IDE: Intelij IDEA 2019.3
+ java：openjdk-8u232-b09
+ maven: Apache Maven 3.6.3
+ SpringBoot: 2.2.2.RELEASE
+ SpringCloud: Hoxton.SR1
+ SpringCloudAlibaba: 2.2.0.RELEASE


工程模块：
+ cloud-api-common 公共模块
+ cloud-consumer-order80 openFeign 服务消费模块
+ cloud-eureka-server7001 eureka注册中心
+ cloud-eureka-server7002 eureka注册中心
+ cloud-provider-payment8001 eureka服务提供模块
+ cloud-provider-payment8002 eureka服务提供模块
+ cloud-provider-payment8004 zookeeper服务提供模块
+ cloud-consumerzk-order80 zookeeper服务消费模块
+ cloud-consumerconsul-order80 consul服务消费模块
+ cloud-consumerconsul-payment8006 consul服务消费模块