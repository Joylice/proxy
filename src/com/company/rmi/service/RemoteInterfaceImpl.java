package com.company.rmi.service;

import com.company.rmi.common.Employees;
import com.company.rmi.common.RemoteInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author: Joylice
 * @Date: 2019/7/31 15:22
 */
public class RemoteInterfaceImpl extends UnicastRemoteObject implements RemoteInterface {

    private static final long serialVersionUID = -3491749919079349917L;

    public RemoteInterfaceImpl() throws RemoteException {
        super();
    }


    @Override
    public Employees getEmployeesById(String id) throws RemoteException {
        Employees employees = new Employees();
        employees.setId(id);
        employees.setName("demo_" + id);
        return employees;
    }

    @Override
    public String getServerInfo(int index) throws RemoteException {
        if (index == 5)
            throw new RemoteException("Remote Exception");
        return "RMI" + index;
    }

}
