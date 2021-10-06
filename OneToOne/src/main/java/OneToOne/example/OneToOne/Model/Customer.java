package OneToOne.example.OneToOne.Model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Customer(String name) {
        this.name = name;
    }
//    @OneToOne(cascade = CascadeType.ALL)
//    private Item item;
//
//    public Item getItem() {
//        return item;
//    }
//
//    public void setItem(Item item) {
//        this.item = item;
//    }
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "cust_id")
//    private List<Item> items=new ArrayList<>();
//
//    public List<Item> getItems() {
//        return items;
//    }
//
//    public void setItems(List<Item> items) {
//        this.items = items;
//    }
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Item> items=new HashSet<>();

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}

