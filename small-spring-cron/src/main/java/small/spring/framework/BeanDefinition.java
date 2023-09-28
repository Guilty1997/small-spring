package small.spring.framework;

/**
 * @author：HeHongyi
 * @date: 2023/9/28
 * @description: bean定义
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
