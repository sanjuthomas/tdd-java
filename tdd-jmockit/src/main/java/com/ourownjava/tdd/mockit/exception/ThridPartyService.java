package com.ourownjava.tdd.mockit.exception;

import java.io.OutputStream;
import java.rmi.RemoteException;

/**
 * 
 * @author Sanju Thomas
 *
 */
public interface ThridPartyService {
	
	public void save(final OutputStream outputStream) throws RemoteException;

}
