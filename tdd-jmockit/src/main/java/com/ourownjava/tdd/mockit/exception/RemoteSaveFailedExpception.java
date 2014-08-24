package com.ourownjava.tdd.mockit.exception;

import java.rmi.RemoteException;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class RemoteSaveFailedExpception extends Exception{
	
	private static final long serialVersionUID = 1L;

	public RemoteSaveFailedExpception(final String message, final RemoteException remoteException){
		super(message, remoteException);
	}

}
