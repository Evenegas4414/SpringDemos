package cl.exql.springbootdatabinding.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String street;
    private String state;
    private String zipCode;

}
