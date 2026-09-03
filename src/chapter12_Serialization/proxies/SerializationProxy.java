package chapter12_Serialization.proxies;

import chapter8_Methods.defensiveCopies.Period;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

// Serialization proxy for Period class
public class SerializationProxy implements Serializable {
  private final Date start;
  private final Date end;

  public SerializationProxy(Date start, Date end) {
    this.start = start;
    this.end = end;
  }

  // writeReplace method for the serialization proxy pattern
//  private Object writeReplace(){
//    return new SerializationProxy(this);
//  }

  // readObject method for the serialization proxy pattern
  private void readObject(ObjectInputStream stream) throws InvalidObjectException {
    throw new InvalidObjectException("Proxy required");
  }

  // readResolve method for Period.SerializationProxy
  private Object readResolve(){
    return new Period(start,end); // Uses public constructor
  }

  private static final long serialVersionUID = 59874123; // Any number will do (Item 87)
}

