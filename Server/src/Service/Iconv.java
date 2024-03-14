package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface Iconv extends Remote {


    public double conversion(double mt) throws RemoteException;
    public Date getServiceDate() throws RemoteException;
}
