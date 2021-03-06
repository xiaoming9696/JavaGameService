// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registerResponse.proto

package org.tont.proto;

public final class RegisterResponse {
  private RegisterResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RegisterResponseEntityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.RegisterResponseEntity)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool success = 1;</code>
     */
    boolean getSuccess();

    /**
     * <code>optional string message = 2;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>optional string message = 2;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>optional int32 pid = 3;</code>
     */
    int getPid();
  }
  /**
   * Protobuf type {@code proto.RegisterResponseEntity}
   *
   * <pre>
   * [START messages]
   * </pre>
   */
  public  static final class RegisterResponseEntity extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:proto.RegisterResponseEntity)
      RegisterResponseEntityOrBuilder {
    // Use RegisterResponseEntity.newBuilder() to construct.
    private RegisterResponseEntity(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private RegisterResponseEntity() {
      success_ = false;
      message_ = "";
      pid_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private RegisterResponseEntity(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              success_ = input.readBool();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              message_ = s;
              break;
            }
            case 24: {

              pid_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tont.proto.RegisterResponse.internal_static_proto_RegisterResponseEntity_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tont.proto.RegisterResponse.internal_static_proto_RegisterResponseEntity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tont.proto.RegisterResponse.RegisterResponseEntity.class, org.tont.proto.RegisterResponse.RegisterResponseEntity.Builder.class);
    }

    public static final int SUCCESS_FIELD_NUMBER = 1;
    private boolean success_;
    /**
     * <code>optional bool success = 1;</code>
     */
    public boolean getSuccess() {
      return success_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;
    private volatile java.lang.Object message_;
    /**
     * <code>optional string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>optional string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PID_FIELD_NUMBER = 3;
    private int pid_;
    /**
     * <code>optional int32 pid = 3;</code>
     */
    public int getPid() {
      return pid_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (success_ != false) {
        output.writeBool(1, success_);
      }
      if (!getMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, message_);
      }
      if (pid_ != 0) {
        output.writeInt32(3, pid_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (success_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, success_);
      }
      if (!getMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, message_);
      }
      if (pid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, pid_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static org.tont.proto.RegisterResponse.RegisterResponseEntity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tont.proto.RegisterResponse.RegisterResponseEntity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tont.proto.RegisterResponse.RegisterResponseEntity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tont.proto.RegisterResponse.RegisterResponseEntity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tont.proto.RegisterResponse.RegisterResponseEntity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.tont.proto.RegisterResponse.RegisterResponseEntity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.tont.proto.RegisterResponse.RegisterResponseEntity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.tont.proto.RegisterResponse.RegisterResponseEntity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.tont.proto.RegisterResponse.RegisterResponseEntity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.tont.proto.RegisterResponse.RegisterResponseEntity parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tont.proto.RegisterResponse.RegisterResponseEntity prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code proto.RegisterResponseEntity}
     *
     * <pre>
     * [START messages]
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.RegisterResponseEntity)
        org.tont.proto.RegisterResponse.RegisterResponseEntityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tont.proto.RegisterResponse.internal_static_proto_RegisterResponseEntity_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tont.proto.RegisterResponse.internal_static_proto_RegisterResponseEntity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tont.proto.RegisterResponse.RegisterResponseEntity.class, org.tont.proto.RegisterResponse.RegisterResponseEntity.Builder.class);
      }

      // Construct using org.tont.proto.RegisterResponse.RegisterResponseEntity.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        success_ = false;

        message_ = "";

        pid_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tont.proto.RegisterResponse.internal_static_proto_RegisterResponseEntity_descriptor;
      }

      public org.tont.proto.RegisterResponse.RegisterResponseEntity getDefaultInstanceForType() {
        return org.tont.proto.RegisterResponse.RegisterResponseEntity.getDefaultInstance();
      }

      public org.tont.proto.RegisterResponse.RegisterResponseEntity build() {
        org.tont.proto.RegisterResponse.RegisterResponseEntity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.tont.proto.RegisterResponse.RegisterResponseEntity buildPartial() {
        org.tont.proto.RegisterResponse.RegisterResponseEntity result = new org.tont.proto.RegisterResponse.RegisterResponseEntity(this);
        result.success_ = success_;
        result.message_ = message_;
        result.pid_ = pid_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tont.proto.RegisterResponse.RegisterResponseEntity) {
          return mergeFrom((org.tont.proto.RegisterResponse.RegisterResponseEntity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tont.proto.RegisterResponse.RegisterResponseEntity other) {
        if (other == org.tont.proto.RegisterResponse.RegisterResponseEntity.getDefaultInstance()) return this;
        if (other.getSuccess() != false) {
          setSuccess(other.getSuccess());
        }
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          onChanged();
        }
        if (other.getPid() != 0) {
          setPid(other.getPid());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tont.proto.RegisterResponse.RegisterResponseEntity parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tont.proto.RegisterResponse.RegisterResponseEntity) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean success_ ;
      /**
       * <code>optional bool success = 1;</code>
       */
      public boolean getSuccess() {
        return success_;
      }
      /**
       * <code>optional bool success = 1;</code>
       */
      public Builder setSuccess(boolean value) {
        
        success_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool success = 1;</code>
       */
      public Builder clearSuccess() {
        
        success_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>optional string message = 2;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string message = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string message = 2;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 2;</code>
       */
      public Builder clearMessage() {
        
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 2;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        message_ = value;
        onChanged();
        return this;
      }

      private int pid_ ;
      /**
       * <code>optional int32 pid = 3;</code>
       */
      public int getPid() {
        return pid_;
      }
      /**
       * <code>optional int32 pid = 3;</code>
       */
      public Builder setPid(int value) {
        
        pid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 pid = 3;</code>
       */
      public Builder clearPid() {
        
        pid_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:proto.RegisterResponseEntity)
    }

    // @@protoc_insertion_point(class_scope:proto.RegisterResponseEntity)
    private static final org.tont.proto.RegisterResponse.RegisterResponseEntity DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tont.proto.RegisterResponse.RegisterResponseEntity();
    }

    public static org.tont.proto.RegisterResponse.RegisterResponseEntity getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RegisterResponseEntity>
        PARSER = new com.google.protobuf.AbstractParser<RegisterResponseEntity>() {
      public RegisterResponseEntity parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new RegisterResponseEntity(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<RegisterResponseEntity> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RegisterResponseEntity> getParserForType() {
      return PARSER;
    }

    public org.tont.proto.RegisterResponse.RegisterResponseEntity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_RegisterResponseEntity_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_RegisterResponseEntity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026registerResponse.proto\022\005proto\"G\n\026Regis" +
      "terResponseEntity\022\017\n\007success\030\001 \001(\010\022\017\n\007me" +
      "ssage\030\002 \001(\t\022\013\n\003pid\030\003 \001(\005BJ\n\016org.tont.pro" +
      "toB\020RegisterResponse\252\002%Google.Protobuf.T" +
      "oNT.RegisterResponseb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proto_RegisterResponseEntity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_RegisterResponseEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_proto_RegisterResponseEntity_descriptor,
        new java.lang.String[] { "Success", "Message", "Pid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
