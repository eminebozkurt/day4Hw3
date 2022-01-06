package Abstract;

import Entities.Gamer;

public interface IGamerService {

    void register(Gamer gamer);
    void update(Gamer gamer);
    void delete(Gamer gamer);

}
