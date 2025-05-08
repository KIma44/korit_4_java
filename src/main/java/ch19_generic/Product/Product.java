package ch19_generic.Product;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product<T>{

    private String name;
    private T t;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", t=" + t +
                '}';
    }
}
