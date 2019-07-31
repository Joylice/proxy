package com.company.rmi.service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @Author: Joylice
 * @Date: 2019/7/31 15:24
 * 非本地远程服务，
 * 注意
 * 1、服务器端、客户端共用类所在包名必须一致
 * 2、多网卡 服务端IP指定的问题
 */
public class Main {
    private static final int PORT = 9930;

    public static void main(String[] args) {
        System.setProperty("java.rmi.server.hostname ", "10.23.53.216");
        try {

            RemoteInterfaceImpl impl = new RemoteInterfaceImpl();
            LocateRegistry.createRegistry(PORT);
            Naming.rebind("//10.23.53.216:" + PORT + "/rmitest", impl);
            System.out.println("RMI starting...");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
