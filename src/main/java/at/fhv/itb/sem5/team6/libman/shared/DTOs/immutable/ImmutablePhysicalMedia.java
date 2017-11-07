package at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable;

import at.fhv.itb.sem5.team6.libman.shared.enums.Availability;

public interface ImmutablePhysicalMedia {
    Availability getAvailability();

    ImmutableMedia getMedia();
}
