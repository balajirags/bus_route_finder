package in.balaji.works;

import in.balaji.works.models.Bus;
import in.balaji.works.models.Itenary;
import in.balaji.works.models.JourneyType;
import in.balaji.works.service.BusRouteData;
import in.balaji.works.service.HardcodedBusData;

import java.util.ArrayList;
import java.util.List;

public class BusRouteController
{
    public Itenary getBuses(String from, String to, JourneyType journeyType)
    {
        BusRouteData busRouteData = new HardcodedBusData();
        List<Bus> returnJourneyBuses = new ArrayList<Bus>();
        List<Bus> forwardJourneyBuses = new ArrayList<Bus>();
        List<Bus> allBuses = busRouteData.getAllBuses();
        forwardJourneyBuses = getBusRoutes(from, to, allBuses);
        if (journeyType.equals(JourneyType.RETURN))
        {
            returnJourneyBuses = getBusRoutes(to, from, allBuses);
        }
        return new Itenary(forwardJourneyBuses, returnJourneyBuses);
    }


    public List<Bus> getBusRoutes(String from, String to, List<Bus> allBuses)
    {
        ArrayList<Bus> validBus = new ArrayList<Bus>();
        for (Bus bus : allBuses)
        {
            if (bus.isValidRoute(from, to))
            {
                validBus.add(bus);
            }
        }
        return validBus;
    }
}
