package small.spring.framework.beans.factory.support;

import small.spring.framework.beans.factory.config.BeanDefinition;

/**
 * @author：HeHongyi
 * @date: 2023/9/28
 * @description: BeanDefinition 注册
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
