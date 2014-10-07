package rental;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

/**
 * Created by Bavo on 7/10/2014.
 */
public interface ICarRentalCompany extends Remote {

    String getName() throws RemoteException;

    Collection<CarType> getAllCarTypes() throws RemoteException;

    Set<CarType> getAvailableCarTypes(Date start, Date end) throws RemoteException;

    Quote createQuote(ReservationConstraints constraints, String client)
			throws ReservationException, RemoteException;

    Reservation confirmQuote(Quote quote) throws ReservationException, RemoteException;

    void cancelReservation(Reservation res) throws RemoteException;

    List<Reservation> getAllReservations(String client) throws RemoteException;

    int getNumberOfReservationsForCarType(String carType) throws RemoteException;

}
