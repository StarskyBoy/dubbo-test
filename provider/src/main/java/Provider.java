import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

    public static void main(String[] args) throws Exception {
        //读取配置文件
        new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
        System.out.println("provider服务已注册");
        //使线程阻塞
        System.in.read();
    }

}
