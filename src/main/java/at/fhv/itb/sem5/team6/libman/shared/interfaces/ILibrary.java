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

    // Search Medias
    List<MediaDTO> findMedias() throws RemoteException;

    List<MediaDTO> findMedias(@NotNull String text, @NotNull Genre genre, @NotNull MediaType type, @NotNull Availability availability) throws RemoteException;

    // Search Customers
    List<CustomerDTO> findCustomers() throws RemoteException;

    List<CustomerDTO> findCustomers(@NotNull String text) throws RemoteException;

    // Search PhysicalMedias
    List<PhysicalMediaDTO> findPhysicalMedias() throws RemoteException;

    List<PhysicalMediaDTO> findPhysicalMedias(@NotNull MediaDTO media) throws RemoteException;

    // Search Reservations
    List<ReservationDTO> findReservations() throws RemoteException;

    List<ReservationDTO> findReservations(@NotNull MediaDTO media) throws RemoteException;

    List<ReservationDTO> findReservations(@NotNull CustomerDTO customer) throws RemoteException;

    List<ReservationDTO> findReservations(@NotNull MediaDTO media, @NotNull CustomerDTO customer) throws RemoteException;

    // Search Lendings
    List<LendingDTO> findLendings() throws RemoteException;

    List<LendingDTO> findLendings(@NotNull PhysicalMediaDTO physicalMedia) throws RemoteException;

    List<LendingDTO> findLendings(@NotNull CustomerDTO customer) throws RemoteException;

    List<LendingDTO> findLendings(@NotNull PhysicalMediaDTO physicalMedia, @NotNull CustomerDTO customer) throws RemoteException;

    // Reservation
    ReservationDTO reserve(@NotNull MediaDTO media, @NotNull CustomerDTO customer) throws RemoteException;

    void cancelReservation(@NotNull ReservationDTO reservation) throws RemoteException;

    // Lending
    LendingDTO lend(@NotNull PhysicalMediaDTO physicalMedia, @NotNull CustomerDTO customer) throws RemoteException;

    void returnLending(@NotNull LendingDTO lending) throws RemoteException;

    LendingDTO extendLending(@NotNull LendingDTO lending) throws RemoteException;
}
