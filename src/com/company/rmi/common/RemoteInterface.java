package com.company.rmi.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author: Joylice
 * @Date: 2019/7/31 15:22
 */
public interface RemoteInterface extends Remote {

    public String getServerInfo(int index)throws RemoteException;

    public Employees getEmployeesById(String id)throws RemoteException;
}
