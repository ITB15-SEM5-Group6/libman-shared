package at.fhv.itb.sem5.team6.libman.shared.DTOs.mutable;

import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableMedia;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableReservation;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableCustomer;

public interface MutableReservation extends ImmutableReservation {
    void setMedia(ImmutableMedia media);

    void setCustomer(ImmutableCustomer customer);
}
