package at.fhv.itb.sem5.team6.libman.shared.DTOs;

import at.fhv.itb.sem5.team6.libman.shared.enums.Genre;
import at.fhv.itb.sem5.team6.libman.shared.enums.MediaType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

//Lombok annotations to reduce boilerplate (lombok plugin has to be installed in IDE)
@Data // applies lombok-annotations
@Getter // enables getters
@Setter // enables setters
public class MediaDTO implements Serializable {

    private String id;
    private String title;
    private MediaType type;
    private String isbn;
    private String author;
    private String publisher;
    private Date releaseDate;
    private String tags;
    private Genre genre;
}
