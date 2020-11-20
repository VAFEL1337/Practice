import javax.imageio.stream.ImageOutputStream;
import java.util.EnumMap;

public class nomer2 {
    public void s87() {
        num3("Moscow","5","16:40",100, 70,20,30);
        System.out.println(toString());
    }
    protected String destination;
    protected String number;
    protected String timeOfDeparture;

    protected EnumMap<CarType, Integer> seatCountHolder;

    public enum CarType {
        COMMON, COMPARTMENT, RESERVED_SEAT, LUXURY;
    }

    public void num3  (String destination, String number, String timeOfDeparture,
                 final int commonSeatsCount, final int compartmentSeatsCount,
                 final int reservedSeatCount, final int luxurySeatCount ) {
        this.destination = destination;
        this.number = number;
        this.timeOfDeparture = timeOfDeparture;

        this.seatCountHolder = new EnumMap<CarType, Integer>(CarType.class);

        seatCountHolder.put(CarType.COMMON, commonSeatsCount);
        seatCountHolder.put(CarType.COMPARTMENT, compartmentSeatsCount);
        seatCountHolder.put(CarType.RESERVED_SEAT, reservedSeatCount);
        seatCountHolder.put(CarType.LUXURY, luxurySeatCount);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public int getSeatCountByCarType(final CarType type) {
        return seatCountHolder.get(type);
    }

    public void setSeatCountByCarType(final CarType type, final int newCount) {
        seatCountHolder.put(type, newCount);
    }

    public int getTotalSeatCount() {
        int count = 0;

        for (CarType type : CarType.values())
            count = count + seatCountHolder.get(type);

        return count;
    }

    @Override
    public String toString() {
        return "Train :\n" +
                " destination         : '" + destination + "\'\n" +
                " number              : '" + number + "\'\n" +
                " time of departure   : '" + timeOfDeparture + "\'\n" +
                " seats               : " + getTotalSeatCount() + "\n" +
                "   common seats      : " + seatCountHolder.get(CarType.COMMON) + "\n" +
                "   compartment seats : " + seatCountHolder.get(CarType.COMPARTMENT) + "\n" +
                "   reserved seats    : " + seatCountHolder.get(CarType.RESERVED_SEAT) + "\n" +
                "   luxury seats      : " + seatCountHolder.get(CarType.LUXURY);
    }
}