package rental;

import java.rmi.Remote;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

/**
 * Created by Bavo on 7/10/2014.
 */
public interface ICarRentalCompany extends Remote {

    String getName();

    Collection<CarType> getAllCarTypes();

    CarType getCarType(String carTypeName);

    boolean isAvailable(String carTypeName, Date start, Date end);

    Set<CarType> getAvailableCarTypes(Date start, Date end);

    Quote createQuote(ReservationConstraints constraints, String client)
			throws ReservationException;

    Reservation confirmQuote(Quote quote) throws ReservationException;

    void cancelReservation(Reservation res);
}
