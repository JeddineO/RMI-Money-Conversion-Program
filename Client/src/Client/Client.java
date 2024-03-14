package Client;

import Service.Iconv;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    public static void main(String args[])
    {
        try {
            Iconv stub=(Iconv) Naming.lookup("rmi://localhost:1099/Ref");
            System.out.println(stub.conversion(20));
            System.out.println(stub.getServiceDate());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
