// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: loginResponse.proto

package org.tont.proto;

public final class LoginResponse {
  private LoginResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LoginResponseEntityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.LoginResponseEntity)
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

    /**
     * <code>optional string token = 4;</code>
     */
    java.lang.String getToken();
    /**
     * <code>optional string token = 4;</code>
     */
    com.google.protobuf.ByteString
        getTokenBytes();

    /**
     * <code>optional string nickname = 5;</code>
     */
    java.lang.String getNickname();
    /**
     * <code>optional string nickname = 5;</code>
     */
    com.google.protobuf.ByteString
        getNicknameBytes();

    /**
     * <code>optional bool isnamed = 6;</code>
     */
    boolean getIsnamed();

    /**
     * <code>optional int32 gold = 7;</code>
     */
    int getGold();

    /**
     * <code>optional int32 curScene = 8;</code>
     */
    int getCurScene();

    /**
     * <code>optional int32 curPosX = 9;</code>
     */
    int getCurPosX();

    /**
     * <code>optional int32 curPosY = 10;</code>
     */
    int getCurPosY();

    /**
     * <code>optional int32 hp = 11;</code>
     */
    int getHp();
  }
  /**
   * Protobuf type {@code proto.LoginResponseEntity}
   *
   * <pre>
   * [START messages code 100]
   * </pre>
   */
  public  static final class LoginResponseEntity extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:proto.LoginResponseEntity)
      LoginResponseEntityOrBuilder {
    // Use LoginResponseEntity.newBuilder() to construct.
    private LoginResponseEntity(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private LoginResponseEntity() {
      success_ = false;
      message_ = "";
      pid_ = 0;
      token_ = "";
      nickname_ = "";
      isnamed_ = false;
      gold_ = 0;
      curScene_ = 0;
      curPosX_ = 0;
      curPosY_ = 0;
      hp_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private LoginResponseEntity(
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
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              token_ = s;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              nickname_ = s;
              break;
            }
            case 48: {

              isnamed_ = input.readBool();
              break;
            }
            case 56: {

              gold_ = input.readInt32();
              break;
            }
            case 64: {

              curScene_ = input.readInt32();
              break;
            }
            case 72: {

              curPosX_ = input.readInt32();
              break;
            }
            case 80: {

              curPosY_ = input.readInt32();
              break;
            }
            case 88: {

              hp_ = input.readInt32();
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
      return org.tont.proto.LoginResponse.internal_static_proto_LoginResponseEntity_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tont.proto.LoginResponse.internal_static_proto_LoginResponseEntity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tont.proto.LoginResponse.LoginResponseEntity.class, org.tont.proto.LoginResponse.LoginResponseEntity.Builder.class);
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

    public static final int TOKEN_FIELD_NUMBER = 4;
    private volatile java.lang.Object token_;
    /**
     * <code>optional string token = 4;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      }
    }
    /**
     * <code>optional string token = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NICKNAME_FIELD_NUMBER = 5;
    private volatile java.lang.Object nickname_;
    /**
     * <code>optional string nickname = 5;</code>
     */
    public java.lang.String getNickname() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickname_ = s;
        return s;
      }
    }
    /**
     * <code>optional string nickname = 5;</code>
     */
    public com.google.protobuf.ByteString
        getNicknameBytes() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ISNAMED_FIELD_NUMBER = 6;
    private boolean isnamed_;
    /**
     * <code>optional bool isnamed = 6;</code>
     */
    public boolean getIsnamed() {
      return isnamed_;
    }

    public static final int GOLD_FIELD_NUMBER = 7;
    private int gold_;
    /**
     * <code>optional int32 gold = 7;</code>
     */
    public int getGold() {
      return gold_;
    }

    public static final int CURSCENE_FIELD_NUMBER = 8;
    private int curScene_;
    /**
     * <code>optional int32 curScene = 8;</code>
     */
    public int getCurScene() {
      return curScene_;
    }

    public static final int CURPOSX_FIELD_NUMBER = 9;
    private int curPosX_;
    /**
     * <code>optional int32 curPosX = 9;</code>
     */
    public int getCurPosX() {
      return curPosX_;
    }

    public static final int CURPOSY_FIELD_NUMBER = 10;
    private int curPosY_;
    /**
     * <code>optional int32 curPosY = 10;</code>
     */
    public int getCurPosY() {
      return curPosY_;
    }

    public static final int HP_FIELD_NUMBER = 11;
    private int hp_;
    /**
     * <code>optional int32 hp = 11;</code>
     */
    public int getHp() {
      return hp_;
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
      if (!getTokenBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 4, token_);
      }
      if (!getNicknameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 5, nickname_);
      }
      if (isnamed_ != false) {
        output.writeBool(6, isnamed_);
      }
      if (gold_ != 0) {
        output.writeInt32(7, gold_);
      }
      if (curScene_ != 0) {
        output.writeInt32(8, curScene_);
      }
      if (curPosX_ != 0) {
        output.writeInt32(9, curPosX_);
      }
      if (curPosY_ != 0) {
        output.writeInt32(10, curPosY_);
      }
      if (hp_ != 0) {
        output.writeInt32(11, hp_);
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
      if (!getTokenBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(4, token_);
      }
      if (!getNicknameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(5, nickname_);
      }
      if (isnamed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isnamed_);
      }
      if (gold_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, gold_);
      }
      if (curScene_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, curScene_);
      }
      if (curPosX_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, curPosX_);
      }
      if (curPosY_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, curPosY_);
      }
      if (hp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, hp_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static org.tont.proto.LoginResponse.LoginResponseEntity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tont.proto.LoginResponse.LoginResponseEntity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tont.proto.LoginResponse.LoginResponseEntity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tont.proto.LoginResponse.LoginResponseEntity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tont.proto.LoginResponse.LoginResponseEntity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.tont.proto.LoginResponse.LoginResponseEntity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.tont.proto.LoginResponse.LoginResponseEntity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.tont.proto.LoginResponse.LoginResponseEntity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.tont.proto.LoginResponse.LoginResponseEntity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.tont.proto.LoginResponse.LoginResponseEntity parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tont.proto.LoginResponse.LoginResponseEntity prototype) {
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
     * Protobuf type {@code proto.LoginResponseEntity}
     *
     * <pre>
     * [START messages code 100]
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.LoginResponseEntity)
        org.tont.proto.LoginResponse.LoginResponseEntityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tont.proto.LoginResponse.internal_static_proto_LoginResponseEntity_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tont.proto.LoginResponse.internal_static_proto_LoginResponseEntity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tont.proto.LoginResponse.LoginResponseEntity.class, org.tont.proto.LoginResponse.LoginResponseEntity.Builder.class);
      }

      // Construct using org.tont.proto.LoginResponse.LoginResponseEntity.newBuilder()
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

        token_ = "";

        nickname_ = "";

        isnamed_ = false;

        gold_ = 0;

        curScene_ = 0;

        curPosX_ = 0;

        curPosY_ = 0;

        hp_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tont.proto.LoginResponse.internal_static_proto_LoginResponseEntity_descriptor;
      }

      public org.tont.proto.LoginResponse.LoginResponseEntity getDefaultInstanceForType() {
        return org.tont.proto.LoginResponse.LoginResponseEntity.getDefaultInstance();
      }

      public org.tont.proto.LoginResponse.LoginResponseEntity build() {
        org.tont.proto.LoginResponse.LoginResponseEntity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.tont.proto.LoginResponse.LoginResponseEntity buildPartial() {
        org.tont.proto.LoginResponse.LoginResponseEntity result = new org.tont.proto.LoginResponse.LoginResponseEntity(this);
        result.success_ = success_;
        result.message_ = message_;
        result.pid_ = pid_;
        result.token_ = token_;
        result.nickname_ = nickname_;
        result.isnamed_ = isnamed_;
        result.gold_ = gold_;
        result.curScene_ = curScene_;
        result.curPosX_ = curPosX_;
        result.curPosY_ = curPosY_;
        result.hp_ = hp_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tont.proto.LoginResponse.LoginResponseEntity) {
          return mergeFrom((org.tont.proto.LoginResponse.LoginResponseEntity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tont.proto.LoginResponse.LoginResponseEntity other) {
        if (other == org.tont.proto.LoginResponse.LoginResponseEntity.getDefaultInstance()) return this;
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
        if (!other.getToken().isEmpty()) {
          token_ = other.token_;
          onChanged();
        }
        if (!other.getNickname().isEmpty()) {
          nickname_ = other.nickname_;
          onChanged();
        }
        if (other.getIsnamed() != false) {
          setIsnamed(other.getIsnamed());
        }
        if (other.getGold() != 0) {
          setGold(other.getGold());
        }
        if (other.getCurScene() != 0) {
          setCurScene(other.getCurScene());
        }
        if (other.getCurPosX() != 0) {
          setCurPosX(other.getCurPosX());
        }
        if (other.getCurPosY() != 0) {
          setCurPosY(other.getCurPosY());
        }
        if (other.getHp() != 0) {
          setHp(other.getHp());
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
        org.tont.proto.LoginResponse.LoginResponseEntity parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tont.proto.LoginResponse.LoginResponseEntity) e.getUnfinishedMessage();
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

      private java.lang.Object token_ = "";
      /**
       * <code>optional string token = 4;</code>
       */
      public java.lang.String getToken() {
        java.lang.Object ref = token_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          token_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string token = 4;</code>
       */
      public com.google.protobuf.ByteString
          getTokenBytes() {
        java.lang.Object ref = token_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          token_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string token = 4;</code>
       */
      public Builder setToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        token_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string token = 4;</code>
       */
      public Builder clearToken() {
        
        token_ = getDefaultInstance().getToken();
        onChanged();
        return this;
      }
      /**
       * <code>optional string token = 4;</code>
       */
      public Builder setTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        token_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object nickname_ = "";
      /**
       * <code>optional string nickname = 5;</code>
       */
      public java.lang.String getNickname() {
        java.lang.Object ref = nickname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nickname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string nickname = 5;</code>
       */
      public com.google.protobuf.ByteString
          getNicknameBytes() {
        java.lang.Object ref = nickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string nickname = 5;</code>
       */
      public Builder setNickname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string nickname = 5;</code>
       */
      public Builder clearNickname() {
        
        nickname_ = getDefaultInstance().getNickname();
        onChanged();
        return this;
      }
      /**
       * <code>optional string nickname = 5;</code>
       */
      public Builder setNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickname_ = value;
        onChanged();
        return this;
      }

      private boolean isnamed_ ;
      /**
       * <code>optional bool isnamed = 6;</code>
       */
      public boolean getIsnamed() {
        return isnamed_;
      }
      /**
       * <code>optional bool isnamed = 6;</code>
       */
      public Builder setIsnamed(boolean value) {
        
        isnamed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool isnamed = 6;</code>
       */
      public Builder clearIsnamed() {
        
        isnamed_ = false;
        onChanged();
        return this;
      }

      private int gold_ ;
      /**
       * <code>optional int32 gold = 7;</code>
       */
      public int getGold() {
        return gold_;
      }
      /**
       * <code>optional int32 gold = 7;</code>
       */
      public Builder setGold(int value) {
        
        gold_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 gold = 7;</code>
       */
      public Builder clearGold() {
        
        gold_ = 0;
        onChanged();
        return this;
      }

      private int curScene_ ;
      /**
       * <code>optional int32 curScene = 8;</code>
       */
      public int getCurScene() {
        return curScene_;
      }
      /**
       * <code>optional int32 curScene = 8;</code>
       */
      public Builder setCurScene(int value) {
        
        curScene_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 curScene = 8;</code>
       */
      public Builder clearCurScene() {
        
        curScene_ = 0;
        onChanged();
        return this;
      }

      private int curPosX_ ;
      /**
       * <code>optional int32 curPosX = 9;</code>
       */
      public int getCurPosX() {
        return curPosX_;
      }
      /**
       * <code>optional int32 curPosX = 9;</code>
       */
      public Builder setCurPosX(int value) {
        
        curPosX_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 curPosX = 9;</code>
       */
      public Builder clearCurPosX() {
        
        curPosX_ = 0;
        onChanged();
        return this;
      }

      private int curPosY_ ;
      /**
       * <code>optional int32 curPosY = 10;</code>
       */
      public int getCurPosY() {
        return curPosY_;
      }
      /**
       * <code>optional int32 curPosY = 10;</code>
       */
      public Builder setCurPosY(int value) {
        
        curPosY_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 curPosY = 10;</code>
       */
      public Builder clearCurPosY() {
        
        curPosY_ = 0;
        onChanged();
        return this;
      }

      private int hp_ ;
      /**
       * <code>optional int32 hp = 11;</code>
       */
      public int getHp() {
        return hp_;
      }
      /**
       * <code>optional int32 hp = 11;</code>
       */
      public Builder setHp(int value) {
        
        hp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 hp = 11;</code>
       */
      public Builder clearHp() {
        
        hp_ = 0;
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


      // @@protoc_insertion_point(builder_scope:proto.LoginResponseEntity)
    }

    // @@protoc_insertion_point(class_scope:proto.LoginResponseEntity)
    private static final org.tont.proto.LoginResponse.LoginResponseEntity DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tont.proto.LoginResponse.LoginResponseEntity();
    }

    public static org.tont.proto.LoginResponse.LoginResponseEntity getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LoginResponseEntity>
        PARSER = new com.google.protobuf.AbstractParser<LoginResponseEntity>() {
      public LoginResponseEntity parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new LoginResponseEntity(input, extensionRegistry);
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

    public static com.google.protobuf.Parser<LoginResponseEntity> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LoginResponseEntity> getParserForType() {
      return PARSER;
    }

    public org.tont.proto.LoginResponse.LoginResponseEntity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_LoginResponseEntity_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_LoginResponseEntity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023loginResponse.proto\022\005proto\"\304\001\n\023LoginRe" +
      "sponseEntity\022\017\n\007success\030\001 \001(\010\022\017\n\007message" +
      "\030\002 \001(\t\022\013\n\003pid\030\003 \001(\005\022\r\n\005token\030\004 \001(\t\022\020\n\010ni" +
      "ckname\030\005 \001(\t\022\017\n\007isnamed\030\006 \001(\010\022\014\n\004gold\030\007 " +
      "\001(\005\022\020\n\010curScene\030\010 \001(\005\022\017\n\007curPosX\030\t \001(\005\022\017" +
      "\n\007curPosY\030\n \001(\005\022\n\n\002hp\030\013 \001(\005BD\n\016org.tont." +
      "protoB\rLoginResponse\252\002\"Google.Protobuf.T" +
      "oNT.LoginResponseb\006proto3"
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
    internal_static_proto_LoginResponseEntity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_LoginResponseEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_proto_LoginResponseEntity_descriptor,
        new java.lang.String[] { "Success", "Message", "Pid", "Token", "Nickname", "Isnamed", "Gold", "CurScene", "CurPosX", "CurPosY", "Hp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
