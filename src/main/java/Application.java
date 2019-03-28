import gour.indrajeet.service.CustomerService;
import gour.indrajeet.service.CustomerServiceImpl;

public class Application {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerServiceImpl();

        System.out.println(customerService.findAll().get(0).getFirstname());
        System.out.println(customerService.findAll().get(0).getLastname());

    }
}
