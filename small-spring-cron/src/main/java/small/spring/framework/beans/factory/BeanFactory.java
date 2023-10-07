package small.spring.framework.beans.factory;

/**
 * @author：HeHongyi
 * @date: 2023/9/28
 * @description: bean 工厂
 */
public interface BeanFactory {
    Object getBean(String beanName);
}
