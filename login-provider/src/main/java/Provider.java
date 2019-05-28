import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * <p>
 *  微服务生产者
 * </p>
 *
 * @author: akid
 * @create: 2019-05-26 01:21
 **/
public class Provider {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println("provider 服务开启");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
