package in.balaji.works.models;

import java.util.List;

public class Bus
{

    private List<String> stops;

    private String busNo;

    public Bus(List<String> stops, String busNo)
    {
        this.stops = stops;
        this.busNo = busNo;
    }

    public List<String> getStops()
    {
        return stops;
    }

    public String getBusNo()
    {
        return busNo;
    }

    public boolean isValidRoute(String from, String to)
    {
        int toIndex = stops.indexOf(to);
        if (toIndex == -1)
        {
            return false;
        }
        int fromIndex = stops.indexOf(from);
        if (fromIndex == -1)
        {
            return false;
        }

        if ((fromIndex < toIndex))
        {
            return true;
        }
        return false;
    }
}
