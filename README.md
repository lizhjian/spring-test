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
    