# springcloud-learning

#### 介绍
learn how to use springcloud

#### Eureka
采用Eureka作为服务注册与发现的组件

#### Ribbon+RestTemplate
Ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为

#### Feign
Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。<br/>
* Feign 采用的是基于接口的注解<br/>
* Feign 整合了ribbon，具有负载均衡的能力<br/>
* 整合了Hystrix，具有熔断的能力<br/>