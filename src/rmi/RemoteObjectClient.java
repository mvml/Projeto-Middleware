package rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import application.IRemoteObject;

public class RemoteObjectClient {

	public static void main(String[] args) throws RemoteException, NotBoundException{

		Registry registry = LocateRegistry.getRegistry("localhost",2001);
		
		IRemoteObject remoteObject = (IRemoteObject) registry.lookup("RemoteObject");
		
		String reply = remoteObject.doSomeThing();
		
		System.out.println(reply);
		
	}

}
