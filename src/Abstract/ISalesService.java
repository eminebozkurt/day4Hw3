package Abstract;

import Entities.Campaign;
import Entities.Gamer;

public interface ISalesService {
    void sell(Gamer gamer, Campaign campaign);
}
