/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.remoteexecution.executionengine;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class Action implements TBase, java.io.Serializable, Cloneable, Comparable<Action> {
  private static final TStruct STRUCT_DESC = new TStruct("Action");
  private static final TField COMMAND_DIGEST_FIELD_DESC = new TField("command_digest", TType.STRUCT, (short)1);
  private static final TField INPUT_ROOT_DIGEST_FIELD_DESC = new TField("input_root_digest", TType.STRUCT, (short)2);
  private static final TField OUTPUT_FILES_FIELD_DESC = new TField("output_files", TType.LIST, (short)3);
  private static final TField OUTPUT_DIRECTORIES_FIELD_DESC = new TField("output_directories", TType.LIST, (short)4);
  private static final TField REQUIREMENTS_FIELD_DESC = new TField("requirements", TType.STRUCT, (short)5);
  private static final TField TIMEOUT_SECS_FIELD_DESC = new TField("timeout_secs", TType.I64, (short)6);
  private static final TField DO_NOT_CACHE_FIELD_DESC = new TField("do_not_cache", TType.BOOL, (short)7);

  public com.facebook.remoteexecution.cas.Digest command_digest;
  public com.facebook.remoteexecution.cas.Digest input_root_digest;
  public List<String> output_files;
  public List<String> output_directories;
  public Requirements requirements;
  public long timeout_secs;
  public boolean do_not_cache;
  public static final int COMMAND_DIGEST = 1;
  public static final int INPUT_ROOT_DIGEST = 2;
  public static final int OUTPUT_FILES = 3;
  public static final int OUTPUT_DIRECTORIES = 4;
  public static final int REQUIREMENTS = 5;
  public static final int TIMEOUT_SECS = 6;
  public static final int DO_NOT_CACHE = 7;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __TIMEOUT_SECS_ISSET_ID = 0;
  private static final int __DO_NOT_CACHE_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(COMMAND_DIGEST, new FieldMetaData("command_digest", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.facebook.remoteexecution.cas.Digest.class)));
    tmpMetaDataMap.put(INPUT_ROOT_DIGEST, new FieldMetaData("input_root_digest", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, com.facebook.remoteexecution.cas.Digest.class)));
    tmpMetaDataMap.put(OUTPUT_FILES, new FieldMetaData("output_files", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMetaDataMap.put(OUTPUT_DIRECTORIES, new FieldMetaData("output_directories", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMetaDataMap.put(REQUIREMENTS, new FieldMetaData("requirements", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, Requirements.class)));
    tmpMetaDataMap.put(TIMEOUT_SECS, new FieldMetaData("timeout_secs", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(DO_NOT_CACHE, new FieldMetaData("do_not_cache", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(Action.class, metaDataMap);
  }

  public Action() {
  }

  public Action(
    com.facebook.remoteexecution.cas.Digest command_digest,
    List<String> output_files,
    List<String> output_directories,
    Requirements requirements,
    long timeout_secs,
    boolean do_not_cache)
  {
    this();
    this.command_digest = command_digest;
    this.output_files = output_files;
    this.output_directories = output_directories;
    this.requirements = requirements;
    this.timeout_secs = timeout_secs;
    setTimeout_secsIsSet(true);
    this.do_not_cache = do_not_cache;
    setDo_not_cacheIsSet(true);
  }

  public Action(
    com.facebook.remoteexecution.cas.Digest command_digest,
    com.facebook.remoteexecution.cas.Digest input_root_digest,
    List<String> output_files,
    List<String> output_directories,
    Requirements requirements,
    long timeout_secs,
    boolean do_not_cache)
  {
    this();
    this.command_digest = command_digest;
    this.input_root_digest = input_root_digest;
    this.output_files = output_files;
    this.output_directories = output_directories;
    this.requirements = requirements;
    this.timeout_secs = timeout_secs;
    setTimeout_secsIsSet(true);
    this.do_not_cache = do_not_cache;
    setDo_not_cacheIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Action(Action other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetCommand_digest()) {
      this.command_digest = TBaseHelper.deepCopy(other.command_digest);
    }
    if (other.isSetInput_root_digest()) {
      this.input_root_digest = TBaseHelper.deepCopy(other.input_root_digest);
    }
    if (other.isSetOutput_files()) {
      this.output_files = TBaseHelper.deepCopy(other.output_files);
    }
    if (other.isSetOutput_directories()) {
      this.output_directories = TBaseHelper.deepCopy(other.output_directories);
    }
    if (other.isSetRequirements()) {
      this.requirements = TBaseHelper.deepCopy(other.requirements);
    }
    this.timeout_secs = TBaseHelper.deepCopy(other.timeout_secs);
    this.do_not_cache = TBaseHelper.deepCopy(other.do_not_cache);
  }

  public Action deepCopy() {
    return new Action(this);
  }

  @Deprecated
  public Action clone() {
    return new Action(this);
  }

  public com.facebook.remoteexecution.cas.Digest  getCommand_digest() {
    return this.command_digest;
  }

  public Action setCommand_digest(com.facebook.remoteexecution.cas.Digest command_digest) {
    this.command_digest = command_digest;
    return this;
  }

  public void unsetCommand_digest() {
    this.command_digest = null;
  }

  // Returns true if field command_digest is set (has been assigned a value) and false otherwise
  public boolean isSetCommand_digest() {
    return this.command_digest != null;
  }

  public void setCommand_digestIsSet(boolean value) {
    if (!value) {
      this.command_digest = null;
    }
  }

  public com.facebook.remoteexecution.cas.Digest  getInput_root_digest() {
    return this.input_root_digest;
  }

  public Action setInput_root_digest(com.facebook.remoteexecution.cas.Digest input_root_digest) {
    this.input_root_digest = input_root_digest;
    return this;
  }

  public void unsetInput_root_digest() {
    this.input_root_digest = null;
  }

  // Returns true if field input_root_digest is set (has been assigned a value) and false otherwise
  public boolean isSetInput_root_digest() {
    return this.input_root_digest != null;
  }

  public void setInput_root_digestIsSet(boolean value) {
    if (!value) {
      this.input_root_digest = null;
    }
  }

  public List<String>  getOutput_files() {
    return this.output_files;
  }

  public Action setOutput_files(List<String> output_files) {
    this.output_files = output_files;
    return this;
  }

  public void unsetOutput_files() {
    this.output_files = null;
  }

  // Returns true if field output_files is set (has been assigned a value) and false otherwise
  public boolean isSetOutput_files() {
    return this.output_files != null;
  }

  public void setOutput_filesIsSet(boolean value) {
    if (!value) {
      this.output_files = null;
    }
  }

  public List<String>  getOutput_directories() {
    return this.output_directories;
  }

  public Action setOutput_directories(List<String> output_directories) {
    this.output_directories = output_directories;
    return this;
  }

  public void unsetOutput_directories() {
    this.output_directories = null;
  }

  // Returns true if field output_directories is set (has been assigned a value) and false otherwise
  public boolean isSetOutput_directories() {
    return this.output_directories != null;
  }

  public void setOutput_directoriesIsSet(boolean value) {
    if (!value) {
      this.output_directories = null;
    }
  }

  public Requirements  getRequirements() {
    return this.requirements;
  }

  public Action setRequirements(Requirements requirements) {
    this.requirements = requirements;
    return this;
  }

  public void unsetRequirements() {
    this.requirements = null;
  }

  // Returns true if field requirements is set (has been assigned a value) and false otherwise
  public boolean isSetRequirements() {
    return this.requirements != null;
  }

  public void setRequirementsIsSet(boolean value) {
    if (!value) {
      this.requirements = null;
    }
  }

  public long  getTimeout_secs() {
    return this.timeout_secs;
  }

  public Action setTimeout_secs(long timeout_secs) {
    this.timeout_secs = timeout_secs;
    setTimeout_secsIsSet(true);
    return this;
  }

  public void unsetTimeout_secs() {
    __isset_bit_vector.clear(__TIMEOUT_SECS_ISSET_ID);
  }

  // Returns true if field timeout_secs is set (has been assigned a value) and false otherwise
  public boolean isSetTimeout_secs() {
    return __isset_bit_vector.get(__TIMEOUT_SECS_ISSET_ID);
  }

  public void setTimeout_secsIsSet(boolean value) {
    __isset_bit_vector.set(__TIMEOUT_SECS_ISSET_ID, value);
  }

  public boolean  isDo_not_cache() {
    return this.do_not_cache;
  }

  public Action setDo_not_cache(boolean do_not_cache) {
    this.do_not_cache = do_not_cache;
    setDo_not_cacheIsSet(true);
    return this;
  }

  public void unsetDo_not_cache() {
    __isset_bit_vector.clear(__DO_NOT_CACHE_ISSET_ID);
  }

  // Returns true if field do_not_cache is set (has been assigned a value) and false otherwise
  public boolean isSetDo_not_cache() {
    return __isset_bit_vector.get(__DO_NOT_CACHE_ISSET_ID);
  }

  public void setDo_not_cacheIsSet(boolean value) {
    __isset_bit_vector.set(__DO_NOT_CACHE_ISSET_ID, value);
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case COMMAND_DIGEST:
      if (value == null) {
        unsetCommand_digest();
      } else {
        setCommand_digest((com.facebook.remoteexecution.cas.Digest)value);
      }
      break;

    case INPUT_ROOT_DIGEST:
      if (value == null) {
        unsetInput_root_digest();
      } else {
        setInput_root_digest((com.facebook.remoteexecution.cas.Digest)value);
      }
      break;

    case OUTPUT_FILES:
      if (value == null) {
        unsetOutput_files();
      } else {
        setOutput_files((List<String>)value);
      }
      break;

    case OUTPUT_DIRECTORIES:
      if (value == null) {
        unsetOutput_directories();
      } else {
        setOutput_directories((List<String>)value);
      }
      break;

    case REQUIREMENTS:
      if (value == null) {
        unsetRequirements();
      } else {
        setRequirements((Requirements)value);
      }
      break;

    case TIMEOUT_SECS:
      if (value == null) {
        unsetTimeout_secs();
      } else {
        setTimeout_secs((Long)value);
      }
      break;

    case DO_NOT_CACHE:
      if (value == null) {
        unsetDo_not_cache();
      } else {
        setDo_not_cache((Boolean)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case COMMAND_DIGEST:
      return getCommand_digest();

    case INPUT_ROOT_DIGEST:
      return getInput_root_digest();

    case OUTPUT_FILES:
      return getOutput_files();

    case OUTPUT_DIRECTORIES:
      return getOutput_directories();

    case REQUIREMENTS:
      return getRequirements();

    case TIMEOUT_SECS:
      return new Long(getTimeout_secs());

    case DO_NOT_CACHE:
      return new Boolean(isDo_not_cache());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case COMMAND_DIGEST:
      return isSetCommand_digest();
    case INPUT_ROOT_DIGEST:
      return isSetInput_root_digest();
    case OUTPUT_FILES:
      return isSetOutput_files();
    case OUTPUT_DIRECTORIES:
      return isSetOutput_directories();
    case REQUIREMENTS:
      return isSetRequirements();
    case TIMEOUT_SECS:
      return isSetTimeout_secs();
    case DO_NOT_CACHE:
      return isSetDo_not_cache();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Action)
      return this.equals((Action)that);
    return false;
  }

  public boolean equals(Action that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_command_digest = true && this.isSetCommand_digest();
    boolean that_present_command_digest = true && that.isSetCommand_digest();
    if (this_present_command_digest || that_present_command_digest) {
      if (!(this_present_command_digest && that_present_command_digest))
        return false;
      if (!TBaseHelper.equalsNobinary(this.command_digest, that.command_digest))
        return false;
    }

    boolean this_present_input_root_digest = true && this.isSetInput_root_digest();
    boolean that_present_input_root_digest = true && that.isSetInput_root_digest();
    if (this_present_input_root_digest || that_present_input_root_digest) {
      if (!(this_present_input_root_digest && that_present_input_root_digest))
        return false;
      if (!TBaseHelper.equalsNobinary(this.input_root_digest, that.input_root_digest))
        return false;
    }

    boolean this_present_output_files = true && this.isSetOutput_files();
    boolean that_present_output_files = true && that.isSetOutput_files();
    if (this_present_output_files || that_present_output_files) {
      if (!(this_present_output_files && that_present_output_files))
        return false;
      if (!TBaseHelper.equalsNobinary(this.output_files, that.output_files))
        return false;
    }

    boolean this_present_output_directories = true && this.isSetOutput_directories();
    boolean that_present_output_directories = true && that.isSetOutput_directories();
    if (this_present_output_directories || that_present_output_directories) {
      if (!(this_present_output_directories && that_present_output_directories))
        return false;
      if (!TBaseHelper.equalsNobinary(this.output_directories, that.output_directories))
        return false;
    }

    boolean this_present_requirements = true && this.isSetRequirements();
    boolean that_present_requirements = true && that.isSetRequirements();
    if (this_present_requirements || that_present_requirements) {
      if (!(this_present_requirements && that_present_requirements))
        return false;
      if (!TBaseHelper.equalsNobinary(this.requirements, that.requirements))
        return false;
    }

    boolean this_present_timeout_secs = true;
    boolean that_present_timeout_secs = true;
    if (this_present_timeout_secs || that_present_timeout_secs) {
      if (!(this_present_timeout_secs && that_present_timeout_secs))
        return false;
      if (!TBaseHelper.equalsNobinary(this.timeout_secs, that.timeout_secs))
        return false;
    }

    boolean this_present_do_not_cache = true;
    boolean that_present_do_not_cache = true;
    if (this_present_do_not_cache || that_present_do_not_cache) {
      if (!(this_present_do_not_cache && that_present_do_not_cache))
        return false;
      if (!TBaseHelper.equalsNobinary(this.do_not_cache, that.do_not_cache))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Action other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCommand_digest()).compareTo(other.isSetCommand_digest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(command_digest, other.command_digest);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetInput_root_digest()).compareTo(other.isSetInput_root_digest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(input_root_digest, other.input_root_digest);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetOutput_files()).compareTo(other.isSetOutput_files());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(output_files, other.output_files);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetOutput_directories()).compareTo(other.isSetOutput_directories());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(output_directories, other.output_directories);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetRequirements()).compareTo(other.isSetRequirements());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(requirements, other.requirements);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetTimeout_secs()).compareTo(other.isSetTimeout_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(timeout_secs, other.timeout_secs);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDo_not_cache()).compareTo(other.isSetDo_not_cache());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(do_not_cache, other.do_not_cache);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case COMMAND_DIGEST:
          if (field.type == TType.STRUCT) {
            this.command_digest = new com.facebook.remoteexecution.cas.Digest();
            this.command_digest.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case INPUT_ROOT_DIGEST:
          if (field.type == TType.STRUCT) {
            this.input_root_digest = new com.facebook.remoteexecution.cas.Digest();
            this.input_root_digest.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case OUTPUT_FILES:
          if (field.type == TType.LIST) {
            {
              TList _list40 = iprot.readListBegin();
              this.output_files = new ArrayList<String>(Math.max(0, _list40.size));
              for (int _i41 = 0; 
                   (_list40.size < 0) ? iprot.peekList() : (_i41 < _list40.size); 
                   ++_i41)
              {
                String _elem42;
                _elem42 = iprot.readString();
                this.output_files.add(_elem42);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case OUTPUT_DIRECTORIES:
          if (field.type == TType.LIST) {
            {
              TList _list43 = iprot.readListBegin();
              this.output_directories = new ArrayList<String>(Math.max(0, _list43.size));
              for (int _i44 = 0; 
                   (_list43.size < 0) ? iprot.peekList() : (_i44 < _list43.size); 
                   ++_i44)
              {
                String _elem45;
                _elem45 = iprot.readString();
                this.output_directories.add(_elem45);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REQUIREMENTS:
          if (field.type == TType.STRUCT) {
            this.requirements = new Requirements();
            this.requirements.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TIMEOUT_SECS:
          if (field.type == TType.I64) {
            this.timeout_secs = iprot.readI64();
            setTimeout_secsIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DO_NOT_CACHE:
          if (field.type == TType.BOOL) {
            this.do_not_cache = iprot.readBool();
            setDo_not_cacheIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.command_digest != null) {
      oprot.writeFieldBegin(COMMAND_DIGEST_FIELD_DESC);
      this.command_digest.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.input_root_digest != null) {
      if (isSetInput_root_digest()) {
        oprot.writeFieldBegin(INPUT_ROOT_DIGEST_FIELD_DESC);
        this.input_root_digest.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.output_files != null) {
      oprot.writeFieldBegin(OUTPUT_FILES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.output_files.size()));
        for (String _iter46 : this.output_files)        {
          oprot.writeString(_iter46);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.output_directories != null) {
      oprot.writeFieldBegin(OUTPUT_DIRECTORIES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.output_directories.size()));
        for (String _iter47 : this.output_directories)        {
          oprot.writeString(_iter47);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.requirements != null) {
      oprot.writeFieldBegin(REQUIREMENTS_FIELD_DESC);
      this.requirements.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(TIMEOUT_SECS_FIELD_DESC);
    oprot.writeI64(this.timeout_secs);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(DO_NOT_CACHE_FIELD_DESC);
    oprot.writeBool(this.do_not_cache);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("Action");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("command_digest");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getCommand_digest() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getCommand_digest(), indent + 1, prettyPrint));
    }
    first = false;
    if (isSetInput_root_digest())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("input_root_digest");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getInput_root_digest() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getInput_root_digest(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("output_files");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getOutput_files() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getOutput_files(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("output_directories");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getOutput_directories() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getOutput_directories(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("requirements");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getRequirements() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getRequirements(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("timeout_secs");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getTimeout_secs(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("do_not_cache");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. isDo_not_cache(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

