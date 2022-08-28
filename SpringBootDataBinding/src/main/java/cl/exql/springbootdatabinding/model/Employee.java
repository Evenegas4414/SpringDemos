package cl.exql.springbootdatabinding.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode
public class Employee {

    private Integer id;
    @NotNull
    @Size(min = 2, max= 18)
    private String firstName;
    @Size(min = 2, max= 18)
    private String lastName;

    private Address address;

    public Employee() {

    }
}
