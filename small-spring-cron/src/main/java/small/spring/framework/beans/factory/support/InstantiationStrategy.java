package small.spring.framework.beans.factory.support;

import small.spring.framework.beans.BeansException;
import small.spring.framework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author：HeHongyi
 * @date: 2023/10/8
 * @description: 实例话策略
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
