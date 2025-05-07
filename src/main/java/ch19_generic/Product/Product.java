package ch19_generic.Product;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product <T>{
    private String productName;
    private T productInfo;



}
