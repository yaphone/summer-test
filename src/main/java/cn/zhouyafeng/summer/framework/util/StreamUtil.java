package cn.zhouyafeng.summer.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 流操作工具类
 *
 * @author https://github.com/yaphone
 * @date 2017年7月3日 下午3:54:40
 * @version 1.0
 *
 */
public final class StreamUtil {
    private static Logger LOG = LoggerFactory.getLogger(StreamUtil.class);
    
    /**
     * 从输入流中获取字符串
     *
     * @date 2017年7月3日 下午3:57:28
     * @param is
     * @return String
     */
    public static String getString(InputStream is){
        StringBuilder sb = new StringBuilder();
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;
            while((line = reader.readLine()) != null){
                sb.append(line);
            }
        }catch(Exception e){
            LOG.error("get string failure", e);
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
    
}
