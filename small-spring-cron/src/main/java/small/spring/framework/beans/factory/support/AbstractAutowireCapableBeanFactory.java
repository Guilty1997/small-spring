package small.spring.framework.beans.factory.support;

import small.spring.framework.beans.BeansException;
import small.spring.framework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author：HeHongyi
 * @date: 2023/9/28
 * @description:
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean;
        bean = createBeanInstance(beanName, beanDefinition, args);

        addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Constructor constructor = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor<?> ctor : declaredConstructors) {
            if (null != args && ctor.getTypeParameters().length == args.length) {
                constructor = ctor;
                break;
            }
        }

        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructor, args);

    }

    private InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }


}
