package small.spring.framework.beans.factory.support;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import small.spring.framework.beans.BeansException;
import small.spring.framework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author：HeHongyi
 * @date: 2023/10/8
 * @description: cglib子类化策略
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (null == ctor) {
            return enhancer.create();
        }
        return enhancer.create(ctor.getParameterTypes(), args);
    }
}
