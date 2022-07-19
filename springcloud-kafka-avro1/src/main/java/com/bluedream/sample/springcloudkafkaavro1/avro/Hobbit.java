/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.bluedream.sample.springcloudkafkaavro1.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Hobbit extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2428216962026869958L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Hobbit\",\"namespace\":\"com.bluedream.sample.springcloudkafkaavro1.avro\",\"fields\":[{\"name\":\"quote\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Hobbit> ENCODER =
      new BinaryMessageEncoder<Hobbit>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Hobbit> DECODER =
      new BinaryMessageDecoder<Hobbit>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Hobbit> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Hobbit> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Hobbit> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Hobbit>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Hobbit to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Hobbit from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Hobbit instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Hobbit fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence quote;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Hobbit() {}

  /**
   * All-args constructor.
   * @param quote The new value for quote
   */
  public Hobbit(java.lang.CharSequence quote) {
    this.quote = quote;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return quote;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: quote = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'quote' field.
   * @return The value of the 'quote' field.
   */
  public java.lang.CharSequence getQuote() {
    return quote;
  }


  /**
   * Sets the value of the 'quote' field.
   * @param value the value to set.
   */
  public void setQuote(java.lang.CharSequence value) {
    this.quote = value;
  }

  /**
   * Creates a new Hobbit RecordBuilder.
   * @return A new Hobbit RecordBuilder
   */
  public static com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit.Builder newBuilder() {
    return new com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit.Builder();
  }

  /**
   * Creates a new Hobbit RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Hobbit RecordBuilder
   */
  public static com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit.Builder newBuilder(com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit.Builder other) {
    if (other == null) {
      return new com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit.Builder();
    } else {
      return new com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit.Builder(other);
    }
  }

  /**
   * Creates a new Hobbit RecordBuilder by copying an existing Hobbit instance.
   * @param other The existing instance to copy.
   * @return A new Hobbit RecordBuilder
   */
  public static com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit.Builder newBuilder(com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit other) {
    if (other == null) {
      return new com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit.Builder();
    } else {
      return new com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit.Builder(other);
    }
  }

  /**
   * RecordBuilder for Hobbit instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Hobbit>
    implements org.apache.avro.data.RecordBuilder<Hobbit> {

    private java.lang.CharSequence quote;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.quote)) {
        this.quote = data().deepCopy(fields()[0].schema(), other.quote);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing Hobbit instance
     * @param other The existing instance to copy.
     */
    private Builder(com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.quote)) {
        this.quote = data().deepCopy(fields()[0].schema(), other.quote);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'quote' field.
      * @return The value.
      */
    public java.lang.CharSequence getQuote() {
      return quote;
    }


    /**
      * Sets the value of the 'quote' field.
      * @param value The value of 'quote'.
      * @return This builder.
      */
    public com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit.Builder setQuote(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.quote = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'quote' field has been set.
      * @return True if the 'quote' field has been set, false otherwise.
      */
    public boolean hasQuote() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'quote' field.
      * @return This builder.
      */
    public com.bluedream.sample.springcloudkafkaavro1.avro.Hobbit.Builder clearQuote() {
      quote = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Hobbit build() {
      try {
        Hobbit record = new Hobbit();
        record.quote = fieldSetFlags()[0] ? this.quote : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Hobbit>
    WRITER$ = (org.apache.avro.io.DatumWriter<Hobbit>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Hobbit>
    READER$ = (org.apache.avro.io.DatumReader<Hobbit>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.quote);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.quote = in.readString(this.quote instanceof Utf8 ? (Utf8)this.quote : null);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.quote = in.readString(this.quote instanceof Utf8 ? (Utf8)this.quote : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










