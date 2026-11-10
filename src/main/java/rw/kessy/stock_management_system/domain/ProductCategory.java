package rw.kessy.stock_management_system.domain;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_category")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @ManyToMany(mappedBy = "productCategories")
    @JsonIgnore
    private List<Storekeeper> storekeepers;

    public ProductCategory(){

    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Storekeeper> getStorekeepers() {
        return storekeepers;
    }

    public void setStorekeepers(List<Storekeeper> storekeepers) {
        this.storekeepers = storekeepers;
    }
}
    
