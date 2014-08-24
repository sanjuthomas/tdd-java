package com.ourownjava.tdd.mockit.exception;

import java.rmi.RemoteException;

/**
 * 
 * @author Sanju Thomas
 *
 */
public class RemoteSaveFailedException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public RemoteSaveFailedException(final String message, final RemoteException remoteException){
		super(message, remoteException);
	}

}
