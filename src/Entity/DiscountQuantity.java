/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Steffen
 */
@Entity
public class DiscountQuantity extends DiscountType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    int quantityForDiscount = 3;
    double discount = 0.2; //20% on all if quantity is 3 or more


    public double calcDiscount(double priceItem, int quantity) {
        return quantity >= quantityForDiscount ? priceItem * quantity * discount: 0;
    }

}
