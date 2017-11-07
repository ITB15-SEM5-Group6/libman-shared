package at.fhv.itb.sem5.team6.libman.shared.DTOs.mutable;

import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableMedia;
import at.fhv.itb.sem5.team6.libman.shared.enums.MediaType;

public interface MutableMedia extends ImmutableMedia {
    void setTitle(String title);

    void setType(MediaType type);
}
