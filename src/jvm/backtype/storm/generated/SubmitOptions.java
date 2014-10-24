/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubmitOptions implements org.apache.thrift.TBase<SubmitOptions, SubmitOptions._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SubmitOptions");

  private static final org.apache.thrift.protocol.TField INITIAL_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("initial_status", org.apache.thrift.protocol.TType.I32, (short)1);

  private TopologyInitialStatus initial_status; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TopologyInitialStatus
     */
    INITIAL_STATUS((short)1, "initial_status");

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
        case 1: // INITIAL_STATUS
          return INITIAL_STATUS;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INITIAL_STATUS, new org.apache.thrift.meta_data.FieldMetaData("initial_status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TopologyInitialStatus.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SubmitOptions.class, metaDataMap);
  }

  public SubmitOptions() {
  }

  public SubmitOptions(
    TopologyInitialStatus initial_status)
  {
    this();
    this.initial_status = initial_status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SubmitOptions(SubmitOptions other) {
    if (other.is_set_initial_status()) {
      this.initial_status = other.initial_status;
    }
  }

  public SubmitOptions deepCopy() {
    return new SubmitOptions(this);
  }

  @Override
  public void clear() {
    this.initial_status = null;
  }

  /**
   * 
   * @see TopologyInitialStatus
   */
  public TopologyInitialStatus get_initial_status() {
    return this.initial_status;
  }

  /**
   * 
   * @see TopologyInitialStatus
   */
  public void set_initial_status(TopologyInitialStatus initial_status) {
    this.initial_status = initial_status;
  }

  public void unset_initial_status() {
    this.initial_status = null;
  }

  /** Returns true if field initial_status is set (has been assigned a value) and false otherwise */
  public boolean is_set_initial_status() {
    return this.initial_status != null;
  }

  public void set_initial_status_isSet(boolean value) {
    if (!value) {
      this.initial_status = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INITIAL_STATUS:
      if (value == null) {
        unset_initial_status();
      } else {
        set_initial_status((TopologyInitialStatus)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INITIAL_STATUS:
      return get_initial_status();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INITIAL_STATUS:
      return is_set_initial_status();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SubmitOptions)
      return this.equals((SubmitOptions)that);
    return false;
  }

  public boolean equals(SubmitOptions that) {
    if (that == null)
      return false;

    boolean this_present_initial_status = true && this.is_set_initial_status();
    boolean that_present_initial_status = true && that.is_set_initial_status();
    if (this_present_initial_status || that_present_initial_status) {
      if (!(this_present_initial_status && that_present_initial_status))
        return false;
      if (!this.initial_status.equals(that.initial_status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_initial_status = true && (is_set_initial_status());
    builder.append(present_initial_status);
    if (present_initial_status)
      builder.append(initial_status.getValue());

    return builder.toHashCode();
  }

  public int compareTo(SubmitOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SubmitOptions typedOther = (SubmitOptions)other;

    lastComparison = Boolean.valueOf(is_set_initial_status()).compareTo(typedOther.is_set_initial_status());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_initial_status()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.initial_status, typedOther.initial_status);
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
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // INITIAL_STATUS
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.initial_status = TopologyInitialStatus.findByValue(iprot.readI32());
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.initial_status != null) {
      oprot.writeFieldBegin(INITIAL_STATUS_FIELD_DESC);
      oprot.writeI32(this.initial_status.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SubmitOptions(");
    boolean first = true;

    sb.append("initial_status:");
    if (this.initial_status == null) {
      sb.append("null");
    } else {
      sb.append(this.initial_status);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_initial_status()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'initial_status' is unset! Struct:" + toString());
    }

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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

