package small.spring.framework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: hehongyi
 * @Date: 2023/11/27 22:56
 * @Description: 资源解析接口
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
