package framework;

import framework.bean.UserDao;
import framework.bean.UserService;
import org.junit.Test;
import small.spring.framework.beans.PropertyValue;
import small.spring.framework.beans.PropertyValues;
import small.spring.framework.beans.factory.config.BeanDefinition;
import small.spring.framework.beans.factory.config.BeanReference;
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

        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // 4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
