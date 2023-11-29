package small.spring.framework.beans.factory.config;

import small.spring.framework.beans.factory.HierarchicalBeanFactory;

/**
 * @Auther: hehongyi
 * @Date: 2023/11/28 22:54
 * @Description: 可获取 BeanPostProcessor、BeanClassLoader等的一个配置化接口
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {
    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";
}
