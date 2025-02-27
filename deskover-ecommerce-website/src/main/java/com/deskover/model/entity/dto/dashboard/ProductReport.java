package com.deskover.model.entity.dto.dashboard;

import com.deskover.model.entity.database.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductReport implements Serializable {
    private static final long serialVersionUID = 8967713792573979609L;

    @Id
    private Product product;
    private Long quantity;

}
