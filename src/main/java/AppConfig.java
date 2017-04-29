import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rohityarlagadda on 4/25/17.
 */
@Configuration
public class AppConfig {
    @Bean(name ="customerService")
    public CustomerService getCustomerService(){
        return new CustomerServiceImpl();

    }
}
