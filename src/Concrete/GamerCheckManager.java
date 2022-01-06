package Concrete;

import Abstract.BaseGamerManager;
import Abstract.IGamerCheckService;
import Entities.Gamer;

public class GamerCheckManager extends BaseGamerManager {

    private IGamerCheckService _gamerCheckService;

    public GamerCheckManager(IGamerCheckService _gamerCheckService) {
        this._gamerCheckService = _gamerCheckService;
    }

    @Override
    public void register(Gamer gamer) {
        if(_gamerCheckService.checkIfRealPerson(gamer)){
            super.register(gamer);
        }
        else{
            System.out.println("Not a valid person.");
        }
    }

    @Override
    public void update(Gamer gamer){
        super.update(gamer);
    }

    @Override
    public void delete(Gamer gamer){
        super.delete(gamer);
    }

}
