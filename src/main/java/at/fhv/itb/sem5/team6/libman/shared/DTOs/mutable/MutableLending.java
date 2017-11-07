package at.fhv.itb.sem5.team6.libman.shared.DTOs.mutable;

import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutablePhysicalMedia;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableLending;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableCustomer;


public interface MutableLending extends ImmutableLending {
    void setPhysicalMedia(ImmutablePhysicalMedia physicalMedia);

    void setCustomer(ImmutableCustomer customer);
}
