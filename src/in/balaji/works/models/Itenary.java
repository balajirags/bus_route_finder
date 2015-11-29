package in.balaji.works.models;


import java.util.List;

public class Itenary
{

    private List<Bus> forwardJourneyBuses;
    private List<Bus> returnJourneyBuses;

    public List<Bus> getForwardJourneyBuses()
    {
        return forwardJourneyBuses;
    }

    public List<Bus> getReturnJourneyBuses()
    {
        return returnJourneyBuses;
    }

    public Itenary(List<Bus> forwardJourneyBuses, List<Bus> returnJourneyBuses)
    {
        this.forwardJourneyBuses = forwardJourneyBuses;
        this.returnJourneyBuses = returnJourneyBuses;
    }
}
