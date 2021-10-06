package OneToOne.example.OneToOne;

import OneToOne.example.OneToOne.Model.Customer;
import OneToOne.example.OneToOne.Model.Item;
import OneToOne.example.OneToOne.Repository.CustomerRepository;
import OneToOne.example.OneToOne.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer=new Customer("dc");
		Item item=new Item("SRH");
		Item item1=new Item("RCB");
		customer.getItems().add(item);
		customer.getItems().add(item1);
		customerRepository.save(customer);

	}
}
