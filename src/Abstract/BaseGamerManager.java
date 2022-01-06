package Abstract;

import Entities.Gamer;

public abstract class BaseGamerManager implements IGamerService{
    @Override
    public void register(Gamer gamer) {
        System.out.println("Oyuncu kayit oldu: " + gamer.firstName);
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Oyuncu guncellendi: " + gamer.firstName);
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Oyuncu silindi: " + gamer.firstName);
    }
}
