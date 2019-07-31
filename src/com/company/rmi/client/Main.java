package com.company.rmi.client;

import com.company.rmi.common.Employees;
import com.company.rmi.common.RemoteInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Author: Joylice
 * @Date: 2019/7/31 15:25
 */
public class Main {
    public static void main(String[] args) throws MalformedURLException, NotBoundException {
        try {
            final RemoteInterface client = (RemoteInterface) Naming.lookup("//10.23.53.216:9930/rmitest");
            new Thread(new Runnable(){

                @Override
                public void run() {
                    Employees emp;
                    int index = 0;
                    try {
                        while(true){
                            Thread.sleep(1000);
                            emp = client.getEmployeesById(""+(index++));
                            System.out.println("ID="+emp.getId());
                            System.out.println("Name="+emp.getName());
                        }
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }).start();

            new Thread(new Runnable(){

                @Override
                public void run() {
                    int index = 0;
                    try {
                        while(true){
                            Thread.sleep(5000);
                            System.out.println(client.getServerInfo(index++));
                        }
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }).start();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
