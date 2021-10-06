package OneToOne.example.OneToOne.Repository;

import OneToOne.example.OneToOne.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}
