package small.spring.framework.beans.factory.support.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author：HeHongyi
 * @date: 2023/9/28
 * @description: 单例注册Bean
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private final Map<String, Object> stringObjectMap = new HashMap<>();


    @Override
    public Object getSingleton(String beanName) {
        return stringObjectMap.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        stringObjectMap.put(beanName, singletonObject);
    }
}
