// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.ono.chain.jabci.types;

/**
 * Protobuf type {@code com.ono.chain.jabci.types.Version}
 */
public  final class Version extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ono.chain.jabci.types.Version)
    VersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Version.newBuilder() to construct.
  private Version(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Version() {
    block_ = 0L;
    app_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Version(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            block_ = input.readUInt64();
            break;
          }
          case 16: {

            app_ = input.readUInt64();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ono.chain.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_Version_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ono.chain.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_Version_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ono.chain.jabci.types.Version.class, com.ono.chain.jabci.types.Version.Builder.class);
  }

  public static final int BLOCK_FIELD_NUMBER = 1;
  private long block_;
  /**
   * <code>uint64 Block = 1;</code>
   */
  public long getBlock() {
    return block_;
  }

  public static final int APP_FIELD_NUMBER = 2;
  private long app_;
  /**
   * <code>uint64 App = 2;</code>
   */
  public long getApp() {
    return app_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (block_ != 0L) {
      output.writeUInt64(1, block_);
    }
    if (app_ != 0L) {
      output.writeUInt64(2, app_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (block_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, block_);
    }
    if (app_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, app_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ono.chain.jabci.types.Version)) {
      return super.equals(obj);
    }
    com.ono.chain.jabci.types.Version other = (com.ono.chain.jabci.types.Version) obj;

    boolean result = true;
    result = result && (getBlock()
        == other.getBlock());
    result = result && (getApp()
        == other.getApp());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BLOCK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlock());
    hash = (37 * hash) + APP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getApp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ono.chain.jabci.types.Version parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ono.chain.jabci.types.Version parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.Version parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ono.chain.jabci.types.Version parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.Version parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ono.chain.jabci.types.Version parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.Version parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ono.chain.jabci.types.Version parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.Version parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ono.chain.jabci.types.Version parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.Version parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ono.chain.jabci.types.Version parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ono.chain.jabci.types.Version prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.ono.chain.jabci.types.Version}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ono.chain.jabci.types.Version)
      com.ono.chain.jabci.types.VersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ono.chain.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_Version_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ono.chain.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_Version_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ono.chain.jabci.types.Version.class, com.ono.chain.jabci.types.Version.Builder.class);
    }

    // Construct using com.ono.chain.jabci.types.Version.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      block_ = 0L;

      app_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ono.chain.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_Version_descriptor;
    }

    @java.lang.Override
    public com.ono.chain.jabci.types.Version getDefaultInstanceForType() {
      return com.ono.chain.jabci.types.Version.getDefaultInstance();
    }

    @java.lang.Override
    public com.ono.chain.jabci.types.Version build() {
      com.ono.chain.jabci.types.Version result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ono.chain.jabci.types.Version buildPartial() {
      com.ono.chain.jabci.types.Version result = new com.ono.chain.jabci.types.Version(this);
      result.block_ = block_;
      result.app_ = app_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ono.chain.jabci.types.Version) {
        return mergeFrom((com.ono.chain.jabci.types.Version)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ono.chain.jabci.types.Version other) {
      if (other == com.ono.chain.jabci.types.Version.getDefaultInstance()) return this;
      if (other.getBlock() != 0L) {
        setBlock(other.getBlock());
      }
      if (other.getApp() != 0L) {
        setApp(other.getApp());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ono.chain.jabci.types.Version parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ono.chain.jabci.types.Version) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long block_ ;
    /**
     * <code>uint64 Block = 1;</code>
     */
    public long getBlock() {
      return block_;
    }
    /**
     * <code>uint64 Block = 1;</code>
     */
    public Builder setBlock(long value) {
      
      block_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 Block = 1;</code>
     */
    public Builder clearBlock() {
      
      block_ = 0L;
      onChanged();
      return this;
    }

    private long app_ ;
    /**
     * <code>uint64 App = 2;</code>
     */
    public long getApp() {
      return app_;
    }
    /**
     * <code>uint64 App = 2;</code>
     */
    public Builder setApp(long value) {
      
      app_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 App = 2;</code>
     */
    public Builder clearApp() {
      
      app_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ono.chain.jabci.types.Version)
  }

  // @@protoc_insertion_point(class_scope:com.ono.chain.jabci.types.Version)
  private static final com.ono.chain.jabci.types.Version DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ono.chain.jabci.types.Version();
  }

  public static com.ono.chain.jabci.types.Version getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Version>
      PARSER = new com.google.protobuf.AbstractParser<Version>() {
    @java.lang.Override
    public Version parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Version(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Version> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Version> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ono.chain.jabci.types.Version getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

