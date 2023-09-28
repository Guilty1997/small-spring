package framework;

import framework.bean.UserService;
import org.junit.Test;
import small.spring.framework.BeanDefinition;
import small.spring.framework.BeanFactory;

/**
 * @author：HeHongyi
 * @date: 2023/9/28
 * @description: 测试类
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
