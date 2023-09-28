package small.spring.framework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author：HeHongyi
 * @date: 2023/9/28
 * @description: bean 工厂
 */
public class BeanFactory {
    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();


    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
