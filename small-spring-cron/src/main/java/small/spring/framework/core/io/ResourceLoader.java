package small.spring.framework.core.io;

/**
 * @Auther: hehongyi
 * @Date: 2023/11/28 20:22
 * @Description: 资源加载器
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
