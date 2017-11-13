package at.fhv.itb.sem5.team6.libman.shared.interfaces;

import at.fhv.itb.sem5.team6.libman.shared.DTOs.*;
import at.fhv.itb.sem5.team6.libman.shared.enums.Availability;
import at.fhv.itb.sem5.team6.libman.shared.enums.Genre;
import at.fhv.itb.sem5.team6.libman.shared.enums.MediaType;

import javax.validation.constraints.NotNull;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ILibrary extends Remote {

// Search
    List<MediaDTO> findAllMedia(String text, Genre genre, MediaType type, Availability availability) throws RemoteException;

    List<PhysicalMediaDTO> findAllPhysicalMedia() throws RemoteException;

// Reservation

    ReservationDTO reserveMedia(@NotNull MediaDTO media, @NotNull CustomerDTO customer) throws RemoteException;

    void cancelReservation(@NotNull ReservationDTO reservation) throws RemoteException;

// Lending

    LendingDTO lendPhysicalMedia(@NotNull PhysicalMediaDTO physicalMedia, @NotNull CustomerDTO customer) throws RemoteException;

    void returnPhysicalMedia(@NotNull PhysicalMediaDTO physicalMedia) throws RemoteException;

    void extendLending(@NotNull LendingDTO lending) throws RemoteException;


// Physical Media

    List<PhysicalMediaDTO> getPhysicalMedia(MediaDTO media) throws RemoteException;

// Customers

    List<CustomerDTO> getAllCustomers() throws RemoteException;
}
