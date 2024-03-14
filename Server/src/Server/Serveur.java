package Server;

import Service.ConvImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {

    public static void main(String args[])
    {
        try {
            LocateRegistry.createRegistry(1099);
            ConvImpl ob=new ConvImpl();
            Naming.rebind("rmi://localhost:1099/Ref",ob);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
