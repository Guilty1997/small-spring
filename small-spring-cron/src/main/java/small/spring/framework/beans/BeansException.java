package small.spring.framework.beans;

/**
 * @author：HeHongyi
 * @date: 2023/9/28
 * @description: 定义 Bean 异常
 */
public class BeansException extends RuntimeException {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }

}
