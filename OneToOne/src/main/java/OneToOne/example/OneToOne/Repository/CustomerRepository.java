package OneToOne.example.OneToOne.Repository;

import OneToOne.example.OneToOne.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
