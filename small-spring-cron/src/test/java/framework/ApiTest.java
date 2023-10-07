package framework;

import framework.bean.UserService;
import org.junit.Test;
import small.spring.framework.beans.factory.config.BeanDefinition;
import small.spring.framework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author：HeHongyi
 * @date: 2023/9/28
 * @description: 测试类
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
