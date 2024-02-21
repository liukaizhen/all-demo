package com.sean;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author sean
 */
public class Main {

    public static void main(String[] args) throws Exception{
        ThreadPoolExecutor service = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
        service.submit(new Runnable() {
            @Override
            public void run() {

            }
        });


        System.out.println(2 << 20);
        System.out.println(100 << 20);


       int a = 1;
        switch (a){
            case 0:
                System.out.println(0);
                break;
            case 1:
            default:
                System.out.println(a);
        }

//        Rule rule = new Rule();
//        rule.setRuleName("aaaa");
//        Sean sean = (Sean) Proxy.newProxyInstance(rule.getClass().getClassLoader(), rule.getClass().getInterfaces(), new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return method.invoke(rule,args);
//            }
//        });
//
//        System.out.println(sean.name());



//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
//        SqlSession sqlSession = sessionFactory.openSession();
//        RuleMapper mapper = sqlSession.getMapper(RuleMapper.class);
//        List<Rule> list = mapper.getList();
//        System.out.println(list);
    }
}
