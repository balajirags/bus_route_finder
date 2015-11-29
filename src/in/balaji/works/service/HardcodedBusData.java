package in.balaji.works.service;

import in.balaji.works.models.Bus;
import in.balaji.works.models.Stops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static in.balaji.works.models.Stops.*;

public class HardcodedBusData implements BusRouteData
{
    @Override
    public List<Bus> getAllBuses()
    {

        Bus m57 = new Bus(getBus(Arrays.asList(TAMBARAM, CHROMPET, PALLAVARAM, AIRPORT, GUINDY, ANNA, ADYAR, THIRUVANMIYUR)), "m57");
        Bus m58 = new Bus(getBus(Arrays.asList(TAMBARAM, CHROMPET, PALLAVARAM, AIRPORT, GUINDY)), "m58");
        Bus m59 = new Bus(getBus(Arrays.asList(TAMBARAM, CHROMPET, THORIAPAKKAM, MADIPAKKAM, VELACHERY, TARAMANI)), "m59");
        Bus m60 = new Bus(getBus(Arrays.asList(PALLAVARAM, CHROMPET, THORIAPAKKAM, MADIPAKKAM, VELACHERY, TARAMANI, TAMBARAM)), "m60");
        Bus m61 = new Bus(getBus(Arrays.asList(TARAMANI, CHROMPET, THORIAPAKKAM, MADIPAKKAM, VELACHERY, TAMBARAM)), "m61");
        Bus m62 = new Bus(getBus(Arrays.asList(TARAMANI, CHROMPET, PALLAVARAM, MADIPAKKAM, VELACHERY, TAMBARAM)), "m62");
        return Arrays.asList(m57, m58, m59, m60, m61, m62);
    }

    private List<String> getBus(List<Stops> stops)
    {
        ArrayList<String> busStops = new ArrayList<String>();
        for (Stops stop : stops)
        {
            busStops.add(stop.getValue());
        }
        return busStops;
    }
}
