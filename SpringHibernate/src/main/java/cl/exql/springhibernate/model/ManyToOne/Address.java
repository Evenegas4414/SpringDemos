package cl.exql.springhibernate.model.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Address {

    @Id
    private Long id;
    private String street;
    private String zipCode;

    @ManyToOne
    //@JoinColumn(name = "person_id")
    //@JoinTable(name="person_address")
    @JoinTable(name="person_address", joinColumns = {@JoinColumn(name = "person_id")},
            inverseJoinColumns = {@JoinColumn(name = "address_id")})
    private Person person;


}
