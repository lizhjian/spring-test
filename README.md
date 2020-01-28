# ioc-test
- [ioc的三种注入方式](https://shimo.im/docs/uKMbBVwL3dUusKHV/read)
  - 根据set方法/根据构造方法
    - 加入xmlns:c的命名空间可以用c:dao-ref 注入
  - 根据注解方法
  - 根据java-config方式
- 总结: 想要用到一个bean的注入
  - 如果通过xml的方式,只能通过声明bean标签的方式,想实现bean-B 中注入bean-A
 先将A声明为bean 然后在B中通过setA 或者constructorA的方式注入 此时B中setA/constructorA与xml中B的
 property name="dao" 或者constructor-arg 一一对应 
  - 如果通过注解方式 
    - bean-B c:dao-ref="dao2"这种 dao2或者是被声明为bean id = dao2 或者component("dao2")
    B本身还是要有构造函数
    - 如果B不用xml配置 则B需要component("B")
  - 如果通过java-config方式  
    则需要配置Spring.class 参考Spring类,如果dao类本身不使用@Compnent则需要在xml中配置bean
    并通过@ImportResource("classpath:spring.xml")进行导入
- 自动装配
   - byType(用byType时如果有两个实现IndexDaoImpl1/IndexDaoImpl2 则报错)
   ```     default-autowire="byType"
           <bean id="dao1" class="com.ziroom.crm.IndexDaoImpl1"></bean>
           <bean id="dao2" class="com.ziroom.crm.IndexDaoImpl2"></bean>
           <bean id="indexService" class="com.ziroom.crm.IndexService">
   ```
   - byName(有多个实现类则需要通过byName 即:void setDao2(IndexDao dao)) 
   - 定制装配(IndexService 要通过byType查找并装配自己的成员 )
   ```
       <bean id="indexService" class="com.ziroom.crm.IndexService" autowire="byType">
   ```
   - @Autowired 默认是用byType的方式注入所以当dao接口有个两个子类实现时会报错
   ```
       No qualifying bean of type 'com.ziroom.crm.IndexDao' available: expected single matching bean but found 2: indexDaoImpl1,indexDaoImpl2
   ``` 
   - @Resource 默认采用byName(属性名)去处理同时可以不用下面的setXxx方法
     - 如果只有
     ```
     @Resource
         private IndexDao indexDaoImpl1;
         @Repository
         public class IndexDaoImpl2{
         }
     ```    
     则会降级 注入IndexDaoImpl2