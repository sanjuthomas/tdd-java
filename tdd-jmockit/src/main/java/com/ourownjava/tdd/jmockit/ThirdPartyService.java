package com.ourownjava.tdd.jmockit;

import java.io.OutputStream;
import java.rmi.RemoteException;

/**
 * 
 * @author Sanju Thomas
 *
 */
public interface ThirdPartyService {

	public void save(final OutputStream outputStream) throws RemoteException;
}
