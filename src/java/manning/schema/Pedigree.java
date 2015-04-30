/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package manning.schema;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-4-29")
public class Pedigree implements org.apache.thrift.TBase<Pedigree, Pedigree._Fields>, java.io.Serializable, Cloneable, Comparable<Pedigree> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Pedigree");

  private static final org.apache.thrift.protocol.TField TRUE_AS_OF_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("true_as_of_secs", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("source", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SYSTEM_FIELD_DESC = new org.apache.thrift.protocol.TField("system", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PedigreeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PedigreeTupleSchemeFactory());
  }

  private int true_as_of_secs; // required
  private Source source; // required
  private OrigSystem system; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRUE_AS_OF_SECS((short)1, "true_as_of_secs"),
    /**
     * 
     * @see Source
     */
    SOURCE((short)2, "source"),
    SYSTEM((short)3, "system");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TRUE_AS_OF_SECS
          return TRUE_AS_OF_SECS;
        case 2: // SOURCE
          return SOURCE;
        case 3: // SYSTEM
          return SYSTEM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TRUE_AS_OF_SECS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRUE_AS_OF_SECS, new org.apache.thrift.meta_data.FieldMetaData("true_as_of_secs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SOURCE, new org.apache.thrift.meta_data.FieldMetaData("source", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Source.class)));
    tmpMap.put(_Fields.SYSTEM, new org.apache.thrift.meta_data.FieldMetaData("system", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, OrigSystem.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Pedigree.class, metaDataMap);
  }

  public Pedigree() {
  }

  public Pedigree(
    int true_as_of_secs,
    Source source,
    OrigSystem system)
  {
    this();
    this.true_as_of_secs = true_as_of_secs;
    set_true_as_of_secs_isSet(true);
    this.source = source;
    this.system = system;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Pedigree(Pedigree other) {
    __isset_bitfield = other.__isset_bitfield;
    this.true_as_of_secs = other.true_as_of_secs;
    if (other.is_set_source()) {
      this.source = other.source;
    }
    if (other.is_set_system()) {
      this.system = new OrigSystem(other.system);
    }
  }

  public Pedigree deepCopy() {
    return new Pedigree(this);
  }

  @Override
  public void clear() {
    set_true_as_of_secs_isSet(false);
    this.true_as_of_secs = 0;
    this.source = null;
    this.system = null;
  }

  public int get_true_as_of_secs() {
    return this.true_as_of_secs;
  }

  public void set_true_as_of_secs(int true_as_of_secs) {
    this.true_as_of_secs = true_as_of_secs;
    set_true_as_of_secs_isSet(true);
  }

  public void unset_true_as_of_secs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TRUE_AS_OF_SECS_ISSET_ID);
  }

  /** Returns true if field true_as_of_secs is set (has been assigned a value) and false otherwise */
  public boolean is_set_true_as_of_secs() {
    return EncodingUtils.testBit(__isset_bitfield, __TRUE_AS_OF_SECS_ISSET_ID);
  }

  public void set_true_as_of_secs_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TRUE_AS_OF_SECS_ISSET_ID, value);
  }

  /**
   * 
   * @see Source
   */
  public Source get_source() {
    return this.source;
  }

  /**
   * 
   * @see Source
   */
  public void set_source(Source source) {
    this.source = source;
  }

  public void unset_source() {
    this.source = null;
  }

  /** Returns true if field source is set (has been assigned a value) and false otherwise */
  public boolean is_set_source() {
    return this.source != null;
  }

  public void set_source_isSet(boolean value) {
    if (!value) {
      this.source = null;
    }
  }

  public OrigSystem get_system() {
    return this.system;
  }

  public void set_system(OrigSystem system) {
    this.system = system;
  }

  public void unset_system() {
    this.system = null;
  }

  /** Returns true if field system is set (has been assigned a value) and false otherwise */
  public boolean is_set_system() {
    return this.system != null;
  }

  public void set_system_isSet(boolean value) {
    if (!value) {
      this.system = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRUE_AS_OF_SECS:
      if (value == null) {
        unset_true_as_of_secs();
      } else {
        set_true_as_of_secs((Integer)value);
      }
      break;

    case SOURCE:
      if (value == null) {
        unset_source();
      } else {
        set_source((Source)value);
      }
      break;

    case SYSTEM:
      if (value == null) {
        unset_system();
      } else {
        set_system((OrigSystem)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRUE_AS_OF_SECS:
      return Integer.valueOf(get_true_as_of_secs());

    case SOURCE:
      return get_source();

    case SYSTEM:
      return get_system();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TRUE_AS_OF_SECS:
      return is_set_true_as_of_secs();
    case SOURCE:
      return is_set_source();
    case SYSTEM:
      return is_set_system();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Pedigree)
      return this.equals((Pedigree)that);
    return false;
  }

  public boolean equals(Pedigree that) {
    if (that == null)
      return false;

    boolean this_present_true_as_of_secs = true;
    boolean that_present_true_as_of_secs = true;
    if (this_present_true_as_of_secs || that_present_true_as_of_secs) {
      if (!(this_present_true_as_of_secs && that_present_true_as_of_secs))
        return false;
      if (this.true_as_of_secs != that.true_as_of_secs)
        return false;
    }

    boolean this_present_source = true && this.is_set_source();
    boolean that_present_source = true && that.is_set_source();
    if (this_present_source || that_present_source) {
      if (!(this_present_source && that_present_source))
        return false;
      if (!this.source.equals(that.source))
        return false;
    }

    boolean this_present_system = true && this.is_set_system();
    boolean that_present_system = true && that.is_set_system();
    if (this_present_system || that_present_system) {
      if (!(this_present_system && that_present_system))
        return false;
      if (!this.system.equals(that.system))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_true_as_of_secs = true;
    list.add(present_true_as_of_secs);
    if (present_true_as_of_secs)
      list.add(true_as_of_secs);

    boolean present_source = true && (is_set_source());
    list.add(present_source);
    if (present_source)
      list.add(source.getValue());

    boolean present_system = true && (is_set_system());
    list.add(present_system);
    if (present_system)
      list.add(system);

    return list.hashCode();
  }

  @Override
  public int compareTo(Pedigree other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_true_as_of_secs()).compareTo(other.is_set_true_as_of_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_true_as_of_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.true_as_of_secs, other.true_as_of_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_source()).compareTo(other.is_set_source());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_source()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.source, other.source);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_system()).compareTo(other.is_set_system());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_system()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.system, other.system);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Pedigree(");
    boolean first = true;

    sb.append("true_as_of_secs:");
    sb.append(this.true_as_of_secs);
    first = false;
    if (!first) sb.append(", ");
    sb.append("source:");
    if (this.source == null) {
      sb.append("null");
    } else {
      sb.append(this.source);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("system:");
    if (this.system == null) {
      sb.append("null");
    } else {
      sb.append(this.system);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_true_as_of_secs()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'true_as_of_secs' is unset! Struct:" + toString());
    }

    if (!is_set_source()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'source' is unset! Struct:" + toString());
    }

    if (!is_set_system()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'system' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PedigreeStandardSchemeFactory implements SchemeFactory {
    public PedigreeStandardScheme getScheme() {
      return new PedigreeStandardScheme();
    }
  }

  private static class PedigreeStandardScheme extends StandardScheme<Pedigree> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Pedigree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRUE_AS_OF_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.true_as_of_secs = iprot.readI32();
              struct.set_true_as_of_secs_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.source = manning.schema.Source.findByValue(iprot.readI32());
              struct.set_source_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SYSTEM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.system = new OrigSystem();
              struct.system.read(iprot);
              struct.set_system_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Pedigree struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TRUE_AS_OF_SECS_FIELD_DESC);
      oprot.writeI32(struct.true_as_of_secs);
      oprot.writeFieldEnd();
      if (struct.source != null) {
        oprot.writeFieldBegin(SOURCE_FIELD_DESC);
        oprot.writeI32(struct.source.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.system != null) {
        oprot.writeFieldBegin(SYSTEM_FIELD_DESC);
        struct.system.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PedigreeTupleSchemeFactory implements SchemeFactory {
    public PedigreeTupleScheme getScheme() {
      return new PedigreeTupleScheme();
    }
  }

  private static class PedigreeTupleScheme extends TupleScheme<Pedigree> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Pedigree struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.true_as_of_secs);
      oprot.writeI32(struct.source.getValue());
      struct.system.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Pedigree struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.true_as_of_secs = iprot.readI32();
      struct.set_true_as_of_secs_isSet(true);
      struct.source = manning.schema.Source.findByValue(iprot.readI32());
      struct.set_source_isSet(true);
      struct.system = new OrigSystem();
      struct.system.read(iprot);
      struct.set_system_isSet(true);
    }
  }

}
