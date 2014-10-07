package rental;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

/**
 * Created by Bavo on 7/10/2014.
 */
public interface ICarRentalCompany extends Remote {

    String getName() throws RemoteException;

    Collection<CarType> getAllCarTypes() throws RemoteException;

    CarType getCarType(String carTypeName);

    boolean isAvailable(String carTypeName, Date start, Date end);

    Set<CarType> getAvailableCarTypes(Date start, Date end) throws RemoteException;

    Quote createQuote(ReservationConstraints constraints, String client)
			throws ReservationException, RemoteException;

    Reservation confirmQuote(Quote quote) throws ReservationException, RemoteException;

    void cancelReservation(Reservation res) throws RemoteException;

    Collection<Reservation> getAllReservations(String client) throws RemoteException;


}
