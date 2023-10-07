package small.spring.framework.beans.factory.config;

/**
 * @author：HeHongyi
 * @date: 2023/9/28
 * @description: bean定义
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
