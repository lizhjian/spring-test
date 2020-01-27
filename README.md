# ioc-test
- ioc的两种注入方式
  - 根据set方法
  - 根据构造方法
    - 加入xmlns:c的命名空间可以用c:dao-ref 注入
  - 根据注解方法
- 总结: 想要用到一个bean的注入
  - 如果通过xml的方式,只能通过声明bean标签的方式,想实现bean-B 中注入bean-A
 先将A声明为bean 然后在B中通过setA 或者constructorA的方式注入 此时B中setA/constructorA与xml中B的
 property name="dao" 或者constructor-arg 一一对应 
  - 如果通过注解方式 
    - bean-B c:dao-ref="dao2"这种 dao2或者是被声明为bean id = dao2 或者component("dao2")
    B本身还是要有构造函数
    - 如果B不用xml配置 则B需要component("B")
    