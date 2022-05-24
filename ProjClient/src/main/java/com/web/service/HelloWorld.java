/**
 * HelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.web.service;

public interface HelloWorld extends java.rmi.Remote {
    public java.lang.String func(int a, int b) throws java.rmi.RemoteException;
    public float addValue(float value) throws java.rmi.RemoteException;
    public float subtractValue(float value) throws java.rmi.RemoteException;
}
