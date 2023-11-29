package small.spring.framework.beans.factory;

import small.spring.framework.beans.BeansException;
import small.spring.framework.beans.factory.config.AutowireCapableBeanFactory;
import small.spring.framework.beans.factory.config.BeanDefinition;
import small.spring.framework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Auther: hehongyi
 * @Date: 2023/11/28 22:56
 * @Description: 提供分析和修改Bean以及预先实例化的操作接口
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
