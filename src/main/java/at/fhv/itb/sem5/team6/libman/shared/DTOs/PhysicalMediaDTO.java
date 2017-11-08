package at.fhv.itb.sem5.team6.libman.shared.DTOs;

import at.fhv.itb.sem5.team6.libman.shared.enums.Availability;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//Lombok annotations to reduce boilerplate (lombok plugin has to be installed in IDE)
@Data // applies lombok-annotations
@Getter // enables getters
@Setter // enables setters

public class PhysicalMediaDTO implements Serializable {

    private String id;
    private String index;
    private Availability availability;
    private MediaDTO mediaDTO;
}
