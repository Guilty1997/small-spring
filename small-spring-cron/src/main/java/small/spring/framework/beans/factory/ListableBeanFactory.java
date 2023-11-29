package small.spring.framework.beans.factory;

import small.spring.framework.beans.BeansException;
import small.spring.framework.beans.factory.BeanFactory;

import java.util.Map;

/**
 * @Auther: hehongyi
 * @Date: 2023/11/28 22:49
 * @Description: 扩展工厂类
 */
public interface ListableBeanFactory extends BeanFactory {
    /**
     * 按照类型返回 Bean 实例
     *
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * Return the names of all beans defined in this registry.
     * <p>
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
