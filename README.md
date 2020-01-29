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
           <bean id="dao1" class="com.ziroom.ioc.IndexDaoImpl1"></bean>
           <bean id="dao2" class="com.ziroom.ioc.IndexDaoImpl2"></bean>
           <bean id="indexService" class="com.ziroom.ioc.IndexService">
   ```
   - byName(有多个实现类则需要通过byName 即:void setDao2(IndexDao dao)) 
   - 定制装配(IndexService 要通过byType查找并装配自己的成员 )
   ```
       <bean id="indexService" class="com.ziroom.ioc.IndexService" autowire="byType">
   ```
   - @Autowired 默认优先**byType**的方式注入,其次根据**byName**因此所以当dao接口有个两个子类实现且无法根据属性名称注入时会报错
   ```
       No qualifying bean of type 'com.ziroom.ioc.IndexDao' available: expected single matching bean but found 2: indexDaoImpl1,indexDaoImpl2
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
- spring命名规则类BeanNameFactory   
- spring的作用域
   - singleton 每次都是一个service
   - prototype 每次都new一个service
   ```
   @Component("indexService")
   @Scope("singleton")
   public class IndexService{}
   ``` 
   - 如果service中引入了dao是prototype模式则失去了意义,service及dao全是原型，不会重新创建
     - 解决上述问题是在service中引入dao时加入(不用autoWire dao了)
   ```
   @Lookup
       public IndexDao getIndexDa() {
           return null;
       }  
   ```
     - 或者用官网的方法
   ```
      @Lookup
          public abstract  IndexDao getIndexDa();
   ```
- Resource 与 AutoWired的区别与联系(博客)

# Spring的生命周期的回调
- 初始化之后执行
  - bean实现类实现InitializingBean接口(DisposableBean)
  - 通过xml配置 参考***spring-lifecycle.xml init-method ***
  - bean实现类添加带PostConstruct注解的方法
   ```
     @PostConstruct
       public void init2(){
           System.out.println("default  init ...2 .. ");
       }
   ```
  - 总结:第一种是侵入式限制太死 第三种最好
  - 当bean设置为lazy时 不会执行构造方法
  - 排序扫描
  ```
  AppCongif.java中
  @ComponentScan(value = "com.ziroom.lifecycle",excludeFilters = {@ComponentScan.Filter(type = FilterType.REGEX,pattern = "com.ziroom.lifecycle.*")})

  ```
   getBean(id)和getBean(Class)区别于联系???
 
# Aop
- 配置aop的两种方法
 - java-config
 ```
 @Configuration
 @EnableAspectJAutoProxy
 public class AppConfig {
 
 }
 ``` 
 - xml方式
 ```
 <aop:aspectj-autoproxy/>
 ```   


   