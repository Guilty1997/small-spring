package small.spring.framework.beans.factory.config;

/**
 * @author：HeHongyi
 * @date: 2023/9/28
 * @description: 单例bean获取
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
