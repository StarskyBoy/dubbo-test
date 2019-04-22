import com.midou.provider.entity.User;
import com.midou.provider.server.DemoServer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Consumer {
    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
//        context.start();
        DemoServer demoService = (DemoServer) context.getBean("demoService"); // get
        // service
        // invocation
        // proxy
        String hello = "";
        try {
            hello = demoService.sayHello("dubbo");
            System.out.println(hello);
            List<User> list = demoService.getUsers();
            System.out.println("一共有" + list.size() + "个用户!");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // do invoke!
        //不让控制台消失，按任意键结束
        System.in.read();
        //System.out.println(Thread.currentThread().getName() + " " + hello);
    }
}