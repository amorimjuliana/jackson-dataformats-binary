/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.fasterxml.jackson.dataformat.avro.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Event35Log extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EventLog\",\"namespace\":\"com.demonstration\",\"fields\":[{\"name\":\"version\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"MAX_EVENTS\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"eventCount\",\"type\":[\"null\",{\"type\":\"int\",\"java-class\":\"java.lang.Byte\"}],\"default\":null},{\"name\":\"events\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Event\",\"fields\":[{\"name\":\"playerCount\",\"type\":[\"null\",\"int\"]},{\"name\":\"eventID\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"EventID\",\"fields\":[{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"first\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"second\",\"type\":[\"null\",\"int\"],\"default\":null}]}]}]},\"java-class\":\"java.util.List\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.Integer version;
   private java.lang.Integer MAX_EVENTS;
   private java.lang.Integer eventCount;
   private java.util.List<Event35> events;

  /**
   * Default constructor.
   */
  public Event35Log() {}

  /**
   * All-args constructor.
   */
  public Event35Log(java.lang.Integer version, java.lang.Integer MAX_EVENTS, java.lang.Integer eventCount, java.util.List<Event35> events) {
    this.version = version;
    this.MAX_EVENTS = MAX_EVENTS;
    this.eventCount = eventCount;
    this.events = events;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return version;
    case 1: return MAX_EVENTS;
    case 2: return eventCount;
    case 3: return events;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: version = (java.lang.Integer)value$; break;
    case 1: MAX_EVENTS = (java.lang.Integer)value$; break;
    case 2: eventCount = (java.lang.Integer)value$; break;
    case 3: events = (java.util.List<Event35>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'version' field.
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.Integer value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'MAX_EVENTS' field.
   */
  public java.lang.Integer getMAXEVENTS() {
    return MAX_EVENTS;
  }

  /**
   * Sets the value of the 'MAX_EVENTS' field.
   * @param value the value to set.
   */
  public void setMAXEVENTS(java.lang.Integer value) {
    this.MAX_EVENTS = value;
  }

  /**
   * Gets the value of the 'eventCount' field.
   */
  public java.lang.Integer getEventCount() {
    return eventCount;
  }

  /**
   * Sets the value of the 'eventCount' field.
   * @param value the value to set.
   */
  public void setEventCount(java.lang.Integer value) {
    this.eventCount = value;
  }

  /**
   * Gets the value of the 'events' field.
   */
  public java.util.List<Event35> getEvents() {
    return events;
  }

  /**
   * Sets the value of the 'events' field.
   * @param value the value to set.
   */
  public void setEvents(java.util.List<Event35> value) {
    this.events = value;
  }

  /** Creates a new EventLog RecordBuilder */
  public static Event35Log.Builder newBuilder() {
    return new Event35Log.Builder();
  }
  
  /** Creates a new EventLog RecordBuilder by copying an existing Builder */
  public static Event35Log.Builder newBuilder(Event35Log.Builder other) {
    return new Event35Log.Builder(other);
  }
  
  /** Creates a new EventLog RecordBuilder by copying an existing EventLog instance */
  public static Event35Log.Builder newBuilder(Event35Log other) {
    return new Event35Log.Builder(other);
  }
  
  /**
   * RecordBuilder for EventLog instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Event35Log>
    implements org.apache.avro.data.RecordBuilder<Event35Log> {

    private java.lang.Integer version;
    private java.lang.Integer MAX_EVENTS;
    private java.lang.Integer eventCount;
    private java.util.List<Event35> events;

    /** Creates a new Builder */
    private Builder() {
      super(Event35Log.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Event35Log.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing EventLog instance */
    private Builder(Event35Log other) {
            super(Event35Log.SCHEMA$);
      if (isValidValue(fields()[0], other.version)) {
        this.version = data().deepCopy(fields()[0].schema(), other.version);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.MAX_EVENTS)) {
        this.MAX_EVENTS = data().deepCopy(fields()[1].schema(), other.MAX_EVENTS);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.eventCount)) {
        this.eventCount = data().deepCopy(fields()[2].schema(), other.eventCount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.events)) {
        this.events = data().deepCopy(fields()[3].schema(), other.events);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'version' field */
    public java.lang.Integer getVersion() {
      return version;
    }
    
    /** Sets the value of the 'version' field */
    public Event35Log.Builder setVersion(java.lang.Integer value) {
      validate(fields()[0], value);
      this.version = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'version' field has been set */
    public boolean hasVersion() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'version' field */
    public Event35Log.Builder clearVersion() {
      version = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'MAX_EVENTS' field */
    public java.lang.Integer getMAXEVENTS() {
      return MAX_EVENTS;
    }
    
    /** Sets the value of the 'MAX_EVENTS' field */
    public Event35Log.Builder setMAXEVENTS(java.lang.Integer value) {
      validate(fields()[1], value);
      this.MAX_EVENTS = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'MAX_EVENTS' field has been set */
    public boolean hasMAXEVENTS() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'MAX_EVENTS' field */
    public Event35Log.Builder clearMAXEVENTS() {
      MAX_EVENTS = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'eventCount' field */
    public java.lang.Integer getEventCount() {
      return eventCount;
    }
    
    /** Sets the value of the 'eventCount' field */
    public Event35Log.Builder setEventCount(java.lang.Integer value) {
      validate(fields()[2], value);
      this.eventCount = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'eventCount' field has been set */
    public boolean hasEventCount() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'eventCount' field */
    public Event35Log.Builder clearEventCount() {
      eventCount = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'events' field */
    public java.util.List<Event35> getEvents() {
      return events;
    }
    
    /** Sets the value of the 'events' field */
    public Event35Log.Builder setEvents(java.util.List<Event35> value) {
      validate(fields()[3], value);
      this.events = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'events' field has been set */
    public boolean hasEvents() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'events' field */
    public Event35Log.Builder clearEvents() {
      events = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Event35Log build() {
      try {
        Event35Log record = new Event35Log();
        record.version = fieldSetFlags()[0] ? this.version : (java.lang.Integer) defaultValue(fields()[0]);
        record.MAX_EVENTS = fieldSetFlags()[1] ? this.MAX_EVENTS : (java.lang.Integer) defaultValue(fields()[1]);
        record.eventCount = fieldSetFlags()[2] ? this.eventCount : (java.lang.Integer) defaultValue(fields()[2]);
        record.events = fieldSetFlags()[3] ? this.events : (java.util.List<Event35>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
