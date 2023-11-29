package small.spring.framework.beans.factory.support;

import small.spring.framework.beans.BeansException;
import small.spring.framework.core.io.Resource;
import small.spring.framework.core.io.ResourceLoader;

/**
 * @Auther: hehongyi
 * @Date: 2023/11/28 20:47
 * @Description: bean读取接口
 */
public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
