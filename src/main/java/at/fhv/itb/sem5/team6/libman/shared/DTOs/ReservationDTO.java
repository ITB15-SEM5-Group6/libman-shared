package at.fhv.itb.sem5.team6.libman.shared.DTOs;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

//Lombok annotations to reduce boilerplate (lombok plugin has to be installed in IDE)
@Data // applies lombok-annotations
@Getter // enables getters
@Setter // enables setters

public class ReservationDTO implements Serializable {

    private String id;
    private MediaDTO media;
    private CustomerDTO customer;
    private Date date;

}
