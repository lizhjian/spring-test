# ioc-test
- [ioc������ע�뷽ʽ](https://shimo.im/docs/uKMbBVwL3dUusKHV/read)
  - ����set����/���ݹ��췽��
    - ����xmlns:c�������ռ������c:dao-ref ע��
  - ����ע�ⷽ��
  - ����java-config��ʽ
- �ܽ�: ��Ҫ�õ�һ��bean��ע��
  - ���ͨ��xml�ķ�ʽ,ֻ��ͨ������bean��ǩ�ķ�ʽ,��ʵ��bean-B ��ע��bean-A
 �Ƚ�A����Ϊbean Ȼ����B��ͨ��setA ����constructorA�ķ�ʽע�� ��ʱB��setA/constructorA��xml��B��
 property name="dao" ����constructor-arg һһ��Ӧ 
  - ���ͨ��ע�ⷽʽ 
    - bean-B c:dao-ref="dao2"���� dao2�����Ǳ�����Ϊbean id = dao2 ����component("dao2")
    B������Ҫ�й��캯��
    - ���B����xml���� ��B��Ҫcomponent("B")
  - ���ͨ��java-config��ʽ  
    ����Ҫ����Spring.class �ο�Spring��,���dao�౾��ʹ��@Compnent����Ҫ��xml������bean
    ��ͨ��@ImportResource("classpath:spring.xml")���е���
- �Զ�װ��
   - byType(��byTypeʱ���������ʵ��IndexDaoImpl1/IndexDaoImpl2 �򱨴�)
   ```     default-autowire="byType"
           <bean id="dao1" class="com.ziroom.ioc.IndexDaoImpl1"></bean>
           <bean id="dao2" class="com.ziroom.ioc.IndexDaoImpl2"></bean>
           <bean id="indexService" class="com.ziroom.ioc.IndexService">
   ```
   - byName(�ж��ʵ��������Ҫͨ��byName ��:void setDao2(IndexDao dao)) 
   - ����װ��(IndexService Ҫͨ��byType���Ҳ�װ���Լ��ĳ�Ա )
   ```
       <bean id="indexService" class="com.ziroom.ioc.IndexService" autowire="byType">
   ```
   - @Autowired Ĭ������**byType**�ķ�ʽע��,��θ���**byName**������Ե�dao�ӿ��и���������ʵ�����޷�������������ע��ʱ�ᱨ��
   ```
       No qualifying bean of type 'com.ziroom.ioc.IndexDao' available: expected single matching bean but found 2: indexDaoImpl1,indexDaoImpl2
   ``` 
   - @Resource Ĭ�ϲ���byName(������)ȥ����ͬʱ���Բ��������setXxx����
     - ���ֻ��
     ```
     @Resource
         private IndexDao indexDaoImpl1;
         @Repository
         public class IndexDaoImpl2{
         }
     ```    
     ��ή�� ע��IndexDaoImpl2
- spring����������BeanNameFactory   
- spring��������
   - singleton ÿ�ζ���һ��service
   - prototype ÿ�ζ�newһ��service
   ```
   @Component("indexService")
   @Scope("singleton")
   public class IndexService{}
   ``` 
   - ���service��������dao��prototypeģʽ��ʧȥ������,service��daoȫ��ԭ�ͣ��������´���
     - ���������������service������daoʱ����(����autoWire dao��)
   ```
   @Lookup
       public IndexDao getIndexDa() {
           return null;
       }  
   ```
     - �����ù����ķ���
   ```
      @Lookup
          public abstract  IndexDao getIndexDa();
   ```
- Resource �� AutoWired����������ϵ(����)

# Spring���������ڵĻص�
- ��ʼ��֮��ִ��
  - beanʵ����ʵ��InitializingBean�ӿ�(DisposableBean)
  - ͨ��xml���� �ο�***spring-lifecycle.xml init-method ***
  - beanʵ������Ӵ�PostConstructע��ķ���
   ```
     @PostConstruct
       public void init2(){
           System.out.println("default  init ...2 .. ");
       }
   ```
  - �ܽ�:��һ��������ʽ����̫�� ���������
  - ��bean����Ϊlazyʱ ����ִ�й��췽��
  - ����ɨ��
  ```
  AppCongif.java��
  @ComponentScan(value = "com.ziroom.lifecycle",excludeFilters = {@ComponentScan.Filter(type = FilterType.REGEX,pattern = "com.ziroom.lifecycle.*")})

  ```
   getBean(id)��getBean(Class)��������ϵ???
 
# Aop
- ����aop�����ַ���
 - java-config
 ```
 @Configuration
 @EnableAspectJAutoProxy
 public class AppConfig {
 
 }
 ``` 
 - xml��ʽ
 ```
 <aop:aspectj-autoproxy/>
 ```   


   