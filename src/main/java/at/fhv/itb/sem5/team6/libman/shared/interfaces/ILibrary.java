package at.fhv.itb.sem5.team6.libman.shared.interfaces;

import at.fhv.itb.sem5.team6.libman.shared.DTOs.MediaDTO;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.PhysicalMediaDTO;
import at.fhv.itb.sem5.team6.libman.shared.enums.Availability;
import at.fhv.itb.sem5.team6.libman.shared.enums.Genre;
import at.fhv.itb.sem5.team6.libman.shared.enums.MediaType;

import javax.validation.constraints.NotNull;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ILibrary extends Remote {

// Search

    // by id
    //ImmutableMedia findOneMedia(@NotNull Serializable id) throws RemoteException;

    // all
    List<MediaDTO> findAllMedia() throws RemoteException;

    // by text (like and ignorecase) over all properties
    List<MediaDTO> findAllMedia(@NotNull String text) throws RemoteException;

    // by type
    List<MediaDTO> findAllMedia(@NotNull MediaType type) throws RemoteException;

    // by availability
    List<MediaDTO> findAllMedia(@NotNull Availability availability) throws RemoteException;

    // by text (like and ignorecase) and media and availability
    List<MediaDTO> findAllMedia(String text, Genre genre, MediaType type, Availability availability) throws RemoteException;

    List<PhysicalMediaDTO> findAllPhysicalMedia() throws RemoteException;

// Reservation

    //Reservation reserveMedia(@NotNull Media media, @NotNull Customer customer) throws RemoteException;

    //void cancelReservation(@NotNull Reservation reservation) throws RemoteException;

// Lending

    //Lending lendPhysicalMedia(@NotNull PhysicalMedia physicalMedia, @NotNull Customer customer) throws RemoteException;

    //void returnPhysicalMedia(@NotNull Lending lending) throws RemoteException;

    //void extendLending(@NotNull Lending lending) throws RemoteException;


// Physical Media

    List<PhysicalMediaDTO> getPhysicalMedia(MediaDTO media) throws RemoteException;
}
