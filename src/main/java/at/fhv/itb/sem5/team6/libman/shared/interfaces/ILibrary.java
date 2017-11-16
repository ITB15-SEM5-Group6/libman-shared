package at.fhv.itb.sem5.team6.libman.shared.interfaces;

import at.fhv.itb.sem5.team6.libman.shared.DTOs.*;
import at.fhv.itb.sem5.team6.libman.shared.enums.Availability;
import at.fhv.itb.sem5.team6.libman.shared.enums.Genre;
import at.fhv.itb.sem5.team6.libman.shared.enums.LendingState;
import at.fhv.itb.sem5.team6.libman.shared.enums.MediaType;
import at.fhv.itb.sem5.team6.libman.shared.enums.UserRole;

import javax.validation.constraints.NotNull;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ILibrary extends Remote {

    // User Role
    UserRole getUserRole() throws RemoteException;

    // Search Medias
    List<MediaDTO> findMedias() throws RemoteException;

    List<MediaDTO> findMedias(@NotNull String text, @NotNull Genre genre, @NotNull MediaType type, @NotNull Availability availability) throws RemoteException;

    // Search Customers
    List<CustomerDTO> findCustomers() throws RemoteException;

    List<CustomerDTO> findCustomers(@NotNull String text) throws RemoteException;

    // Search PhysicalMedias
    List<PhysicalMediaDTO> findPhysicalMedias() throws RemoteException;

    List<PhysicalMediaDTO> findPhysicalMediasByMedia(@NotNull String mediaId) throws RemoteException;

    // Search Reservations
    List<ReservationDTO> findReservations() throws RemoteException;

    List<ReservationDTO> findReservationsByMedia(@NotNull String mediaId) throws RemoteException;

    List<ReservationDTO> findReservationsByCustomer(@NotNull String customerId) throws RemoteException;

    List<ReservationDTO> findReservationsByMediaAndCustomer(@NotNull String mediaId, @NotNull String customerId) throws RemoteException;

    // Search Lendings
    List<LendingDTO> findLendings() throws RemoteException;

    List<LendingDTO> findLendings(@NotNull LendingState state) throws RemoteException;

    List<LendingDTO> findLendingsByPhysicalMedia(@NotNull String physicalMediaId) throws RemoteException;

    List<LendingDTO> findLendingsByPhysicalMedia(@NotNull String physicalMediaId, LendingState state) throws RemoteException;

    List<LendingDTO> findLendingsByCustomer(@NotNull String customerId) throws RemoteException;

    List<LendingDTO> findLendingsByCustomer(@NotNull String customerId, LendingState state) throws RemoteException;

    List<LendingDTO> findLendingsByPhysicalMediaAndCustomer(@NotNull String physicalMediaId, @NotNull String customerId) throws RemoteException;

    List<LendingDTO> findLendingsByPhysicalMediaAndCustomer(@NotNull String physicalMediaId, @NotNull String customerId, LendingState state) throws RemoteException;

    // Reservation
    ReservationDTO reserve(@NotNull String mediaId, @NotNull String customerId) throws RemoteException;

    void cancelReservation(@NotNull String reservationId) throws RemoteException;

    // Lending
    LendingDTO lend(@NotNull String physicalMediaId, @NotNull String customerId) throws RemoteException;

    void returnLending(@NotNull String lendingId) throws RemoteException;

    LendingDTO extendLending(@NotNull String lendingId) throws RemoteException;
}
