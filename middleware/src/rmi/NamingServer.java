package rmi;

import java.io.IOException;

import commonService.NamingInvoker;

//import java.rmi.RemoteException;
//import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;

public class NamingServer {
	
	public static void main(String[] args) throws IOException, Throwable {
        //Registry registry = LocateRegistry.createRegistry(2001);
		
		//Chamando os modulos que formam o servidor de nomes
		NamingInvoker invoker = new NamingInvoker();
		
		System.out.println("Servidor de Nomes Pronto para Uso!");
		
         
		//Registrando o numero da porta ao qual o servidor pertence
		//Aqui a porta utilizada é a 2001
		invoker.invoke(2001);
		
		
        while(true){Thread.sleep(1000);}

	}
}
