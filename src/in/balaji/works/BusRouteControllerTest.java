package in.balaji.works;


import in.balaji.works.models.Bus;
import in.balaji.works.models.Itenary;
import in.balaji.works.models.JourneyType;
import org.junit.Test;

import java.util.List;

import static in.balaji.works.models.Stops.PALLAVARAM;
import static in.balaji.works.models.Stops.TAMBARAM;
import static junit.framework.Assert.assertEquals;


public class BusRouteControllerTest
{

    @Test
    public void shouldReturnOneValidRoutes()
    {
        BusRouteController busRouteController = new BusRouteController();
        Itenary itenary = busRouteController.getBuses("chrompet", "adyar", JourneyType.ONEWAY);
        List<Bus> buses = itenary.getForwardJourneyBuses();
        assertEquals(1, buses.size());
        Bus bus = buses.get(0);
        assertEquals("m57", bus.getBusNo());
    }

    @Test
    public void shouldReturnTwoValidRoutes()
    {
        BusRouteController busRouteController = new BusRouteController();
        Itenary itenary = busRouteController.getBuses("chrompet", "airport", JourneyType.ONEWAY);
        List<Bus> buses = itenary.getForwardJourneyBuses();
        assertEquals(2, buses.size());
        Bus busOne = buses.get(0);
        Bus busTwo = buses.get(1);
        assertEquals("m57", busOne.getBusNo());
        assertEquals("m58", busTwo.getBusNo());
    }


    @Test
    public void shouldNotReturnAnyValidRoutes()
    {
        BusRouteController busRouteController = new BusRouteController();
        Itenary itenary = busRouteController.getBuses("chrompet", "Tambaram", JourneyType.ONEWAY);
        List<Bus> buses = itenary.getForwardJourneyBuses();
        assertEquals(0, buses.size());
    }

    @Test
    public void shouldReturnTwoValidRoutesForReturnJourney()
    {
        BusRouteController busRouteController = new BusRouteController();
        Itenary itenary = busRouteController.getBuses(PALLAVARAM.getValue(), TAMBARAM.getValue(), JourneyType.RETURN);
        List<Bus> forwardJourneyBuses = itenary.getForwardJourneyBuses();
        List<Bus> returnJourneyBuses = itenary.getReturnJourneyBuses();
        assertEquals(2, forwardJourneyBuses.size());
        assertEquals(2, returnJourneyBuses.size());
        Bus forwardBusOne = forwardJourneyBuses.get(0);
        Bus forwardBusTwo = forwardJourneyBuses.get(1);
        Bus returnBusOne = returnJourneyBuses.get(0);
        Bus returnBusTwo = returnJourneyBuses.get(1);
        assertEquals("m60", forwardBusOne.getBusNo());
        assertEquals("m62", forwardBusTwo.getBusNo());
        assertEquals("m57", returnBusOne.getBusNo());
        assertEquals("m58", returnBusTwo.getBusNo());
    }

    @Test
    public void shouldReturnTwoValidRoutesForOneWayJourney()
    {
        BusRouteController busRouteController = new BusRouteController();
        Itenary itenary = busRouteController.getBuses(PALLAVARAM.getValue(), TAMBARAM.getValue(), JourneyType.ONEWAY);
        List<Bus> forwardJourneyBuses = itenary.getForwardJourneyBuses();
        List<Bus> returnJourneyBuses = itenary.getReturnJourneyBuses();
        assertEquals(2, forwardJourneyBuses.size());
        assertEquals(0, returnJourneyBuses.size());
        Bus forwardBusOne = forwardJourneyBuses.get(0);
        Bus forwardBusTwo = forwardJourneyBuses.get(1);
        assertEquals("m60", forwardBusOne.getBusNo());
        assertEquals("m62", forwardBusTwo.getBusNo());
    }

}
