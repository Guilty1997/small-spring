package small.spring.framework.beans.factory.support;

import small.spring.framework.beans.BeansException;
import small.spring.framework.beans.factory.BeanFactory;
import small.spring.framework.beans.factory.config.BeanDefinition;
import small.spring.framework.beans.factory.support.singleton.DefaultSingletonBeanRegistry;

/**
 * @author：HeHongyi
 * @date: 2023/9/28
 * @description: 抽象工厂
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String beanName) {
        Object bean = getSingleton(beanName);

        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);

        return createBean(beanName, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;


    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
