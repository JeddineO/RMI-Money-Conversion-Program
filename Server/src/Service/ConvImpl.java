package Service;

import Service.Iconv;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class ConvImpl extends UnicastRemoteObject implements Iconv {
    public ConvImpl() throws RemoteException {
    }

    @Override
    public double conversion(double mt) throws RemoteException {
        double res=mt*10;
        return res;
    }

    @Override
    public Date getServiceDate() throws RemoteException {
        Date date=new Date();
        return date;
    }
}
