import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import user.UserService;

public class JuniteTest {

    @Test
    public  void  test() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService  service   = (UserService)context.getBean("UserService");

        service.save();

    }

    public static void main(String[] args) {

        User user = new User();

        user.setId("1");

        AAA(user);
    }

    static void AAA(User user) {

        System.out.println(user.getId());

    }


}

class User{

    private String name;
    private String age ;

    private String id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}