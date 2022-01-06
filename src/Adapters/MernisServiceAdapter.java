package Adapters;

import Abstract.IGamerCheckService;
import Entities.Gamer;
import MernisReference.BDJKPSPublicSoap;

import java.rmi.RemoteException;

public class MernisServiceAdapter implements IGamerCheckService {


    @Override
    public boolean checkIfRealPerson(Gamer gamer) {
        BDJKPSPublicSoap client = new BDJKPSPublicSoap();
        boolean isValid = false;

        try {
            isValid = client.TCKimlikNoDogrula(Long.parseLong(String.valueOf(gamer.nationalityId)), gamer.firstName, gamer.lastName, gamer.dateOfBirth);
        } catch (NumberFormatException e) {
            e.printStackTrace();

        } catch (RemoteException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValid;


    }
    }
