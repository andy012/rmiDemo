package rmi.remotingservice;

import rmi.service.PersonService;
import rmi.serviceImpl.PersonServiceImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class Program{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			PersonService personService=new PersonServiceImpl();
			//ע��ͨѶ�˿�
			LocateRegistry.createRegistry(6600);
			//ע��ͨѶ·��
			Naming.rebind("rmi://127.0.0.1:6600/PersonService", personService);
			System.out.println("Service Start!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}