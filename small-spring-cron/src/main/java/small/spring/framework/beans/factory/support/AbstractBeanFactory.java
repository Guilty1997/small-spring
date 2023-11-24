package small.spring.framework.beans.factory.support;

import small.spring.framework.beans.BeansException;
import small.spring.framework.beans.factory.BeanFactory;
import small.spring.framework.beans.factory.config.BeanDefinition;

/**
 * @author：HeHongyi
 * @date: 2023/9/28
 * @description: 抽象工厂
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String beanName) {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) {
        return doGetBean(beanName, args);
    }

    @SuppressWarnings("unchecked")
    private <T> T doGetBean(final String beanName, final Object[] args) {
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return (T) bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);

        return (T) createBean(beanName, beanDefinition, args);
    }


    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;


    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

}
