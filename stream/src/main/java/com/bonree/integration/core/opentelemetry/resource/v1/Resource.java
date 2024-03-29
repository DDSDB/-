// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resource/v1/resource.proto

package com.bonree.integration.core.opentelemetry.resource.v1;

/**
 * <pre>
 * Resource information.
 * </pre>
 *
 * Protobuf type {@code opentelemetry.proto.resource.v1.Resource}
 */
public final class Resource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.resource.v1.Resource)
    ResourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Resource.newBuilder() to construct.
  private Resource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Resource() {
    attributes_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Resource();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Resource(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              attributes_ = new java.util.ArrayList<com.bonree.integration.core.opentelemetry.common.v1.KeyValue>();
              mutable_bitField0_ |= 0x00000001;
            }
            attributes_.add(
                input.readMessage(com.bonree.integration.core.opentelemetry.common.v1.KeyValue.parser(), extensionRegistry));
            break;
          }
          case 16: {

            droppedAttributesCount_ = input.readUInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        attributes_ = java.util.Collections.unmodifiableList(attributes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ResourceProto.internal_static_opentelemetry_proto_resource_v1_Resource_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ResourceProto.internal_static_opentelemetry_proto_resource_v1_Resource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Resource.class, Builder.class);
  }

  public static final int ATTRIBUTES_FIELD_NUMBER = 1;
  private java.util.List<com.bonree.integration.core.opentelemetry.common.v1.KeyValue> attributes_;
  /**
   * <pre>
   * Set of attributes that describe the resource.
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
   */
  @Override
  public java.util.List<com.bonree.integration.core.opentelemetry.common.v1.KeyValue> getAttributesList() {
    return attributes_;
  }
  /**
   * <pre>
   * Set of attributes that describe the resource.
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
   */
  @Override
  public java.util.List<? extends com.bonree.integration.core.opentelemetry.common.v1.KeyValueOrBuilder> 
      getAttributesOrBuilderList() {
    return attributes_;
  }
  /**
   * <pre>
   * Set of attributes that describe the resource.
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
   */
  @Override
  public int getAttributesCount() {
    return attributes_.size();
  }
  /**
   * <pre>
   * Set of attributes that describe the resource.
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
   */
  @Override
  public com.bonree.integration.core.opentelemetry.common.v1.KeyValue getAttributes(int index) {
    return attributes_.get(index);
  }
  /**
   * <pre>
   * Set of attributes that describe the resource.
   * Attribute keys MUST be unique (it is not allowed to have more than one
   * attribute with the same key).
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
   */
  @Override
  public com.bonree.integration.core.opentelemetry.common.v1.KeyValueOrBuilder getAttributesOrBuilder(
      int index) {
    return attributes_.get(index);
  }

  public static final int DROPPED_ATTRIBUTES_COUNT_FIELD_NUMBER = 2;
  private int droppedAttributesCount_;
  /**
   * <pre>
   * dropped_attributes_count is the number of dropped attributes. If the value is 0, then
   * no attributes were dropped.
   * </pre>
   *
   * <code>uint32 dropped_attributes_count = 2;</code>
   * @return The droppedAttributesCount.
   */
  @Override
  public int getDroppedAttributesCount() {
    return droppedAttributesCount_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < attributes_.size(); i++) {
      output.writeMessage(1, attributes_.get(i));
    }
    if (droppedAttributesCount_ != 0) {
      output.writeUInt32(2, droppedAttributesCount_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < attributes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, attributes_.get(i));
    }
    if (droppedAttributesCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, droppedAttributesCount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Resource)) {
      return super.equals(obj);
    }
    Resource other = (Resource) obj;

    if (!getAttributesList()
        .equals(other.getAttributesList())) return false;
    if (getDroppedAttributesCount()
        != other.getDroppedAttributesCount()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAttributesCount() > 0) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getAttributesList().hashCode();
    }
    hash = (37 * hash) + DROPPED_ATTRIBUTES_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getDroppedAttributesCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Resource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Resource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Resource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Resource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Resource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Resource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Resource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Resource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Resource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Resource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Resource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Resource parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Resource prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Resource information.
   * </pre>
   *
   * Protobuf type {@code opentelemetry.proto.resource.v1.Resource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.resource.v1.Resource)
      ResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ResourceProto.internal_static_opentelemetry_proto_resource_v1_Resource_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ResourceProto.internal_static_opentelemetry_proto_resource_v1_Resource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Resource.class, Builder.class);
    }

    // Construct using com.bonree.integration.core.opentelemetry.resource.v1.Resource.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAttributesFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (attributesBuilder_ == null) {
        attributes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        attributesBuilder_.clear();
      }
      droppedAttributesCount_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ResourceProto.internal_static_opentelemetry_proto_resource_v1_Resource_descriptor;
    }

    @Override
    public Resource getDefaultInstanceForType() {
      return Resource.getDefaultInstance();
    }

    @Override
    public Resource build() {
      Resource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Resource buildPartial() {
      Resource result = new Resource(this);
      int from_bitField0_ = bitField0_;
      if (attributesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          attributes_ = java.util.Collections.unmodifiableList(attributes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.attributes_ = attributes_;
      } else {
        result.attributes_ = attributesBuilder_.build();
      }
      result.droppedAttributesCount_ = droppedAttributesCount_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Resource) {
        return mergeFrom((Resource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Resource other) {
      if (other == Resource.getDefaultInstance()) return this;
      if (attributesBuilder_ == null) {
        if (!other.attributes_.isEmpty()) {
          if (attributes_.isEmpty()) {
            attributes_ = other.attributes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAttributesIsMutable();
            attributes_.addAll(other.attributes_);
          }
          onChanged();
        }
      } else {
        if (!other.attributes_.isEmpty()) {
          if (attributesBuilder_.isEmpty()) {
            attributesBuilder_.dispose();
            attributesBuilder_ = null;
            attributes_ = other.attributes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            attributesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAttributesFieldBuilder() : null;
          } else {
            attributesBuilder_.addAllMessages(other.attributes_);
          }
        }
      }
      if (other.getDroppedAttributesCount() != 0) {
        setDroppedAttributesCount(other.getDroppedAttributesCount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Resource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Resource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.bonree.integration.core.opentelemetry.common.v1.KeyValue> attributes_ =
      java.util.Collections.emptyList();
    private void ensureAttributesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        attributes_ = new java.util.ArrayList<com.bonree.integration.core.opentelemetry.common.v1.KeyValue>(attributes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bonree.integration.core.opentelemetry.common.v1.KeyValue, com.bonree.integration.core.opentelemetry.common.v1.KeyValue.Builder, com.bonree.integration.core.opentelemetry.common.v1.KeyValueOrBuilder> attributesBuilder_;

    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public java.util.List<com.bonree.integration.core.opentelemetry.common.v1.KeyValue> getAttributesList() {
      if (attributesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(attributes_);
      } else {
        return attributesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public int getAttributesCount() {
      if (attributesBuilder_ == null) {
        return attributes_.size();
      } else {
        return attributesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public com.bonree.integration.core.opentelemetry.common.v1.KeyValue getAttributes(int index) {
      if (attributesBuilder_ == null) {
        return attributes_.get(index);
      } else {
        return attributesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public Builder setAttributes(
        int index, com.bonree.integration.core.opentelemetry.common.v1.KeyValue value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.set(index, value);
        onChanged();
      } else {
        attributesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public Builder setAttributes(
        int index, com.bonree.integration.core.opentelemetry.common.v1.KeyValue.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.set(index, builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public Builder addAttributes(com.bonree.integration.core.opentelemetry.common.v1.KeyValue value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.add(value);
        onChanged();
      } else {
        attributesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public Builder addAttributes(
        int index, com.bonree.integration.core.opentelemetry.common.v1.KeyValue value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.add(index, value);
        onChanged();
      } else {
        attributesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public Builder addAttributes(
        com.bonree.integration.core.opentelemetry.common.v1.KeyValue.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.add(builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public Builder addAttributes(
        int index, com.bonree.integration.core.opentelemetry.common.v1.KeyValue.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.add(index, builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public Builder addAllAttributes(
        Iterable<? extends com.bonree.integration.core.opentelemetry.common.v1.KeyValue> values) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, attributes_);
        onChanged();
      } else {
        attributesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public Builder clearAttributes() {
      if (attributesBuilder_ == null) {
        attributes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        attributesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public Builder removeAttributes(int index) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.remove(index);
        onChanged();
      } else {
        attributesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public com.bonree.integration.core.opentelemetry.common.v1.KeyValue.Builder getAttributesBuilder(
        int index) {
      return getAttributesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public com.bonree.integration.core.opentelemetry.common.v1.KeyValueOrBuilder getAttributesOrBuilder(
        int index) {
      if (attributesBuilder_ == null) {
        return attributes_.get(index);  } else {
        return attributesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public java.util.List<? extends com.bonree.integration.core.opentelemetry.common.v1.KeyValueOrBuilder> 
         getAttributesOrBuilderList() {
      if (attributesBuilder_ != null) {
        return attributesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(attributes_);
      }
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public com.bonree.integration.core.opentelemetry.common.v1.KeyValue.Builder addAttributesBuilder() {
      return getAttributesFieldBuilder().addBuilder(
          com.bonree.integration.core.opentelemetry.common.v1.KeyValue.getDefaultInstance());
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public com.bonree.integration.core.opentelemetry.common.v1.KeyValue.Builder addAttributesBuilder(
        int index) {
      return getAttributesFieldBuilder().addBuilder(
          index, com.bonree.integration.core.opentelemetry.common.v1.KeyValue.getDefaultInstance());
    }
    /**
     * <pre>
     * Set of attributes that describe the resource.
     * Attribute keys MUST be unique (it is not allowed to have more than one
     * attribute with the same key).
     * </pre>
     *
     * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 1;</code>
     */
    public java.util.List<com.bonree.integration.core.opentelemetry.common.v1.KeyValue.Builder> 
         getAttributesBuilderList() {
      return getAttributesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bonree.integration.core.opentelemetry.common.v1.KeyValue, com.bonree.integration.core.opentelemetry.common.v1.KeyValue.Builder, com.bonree.integration.core.opentelemetry.common.v1.KeyValueOrBuilder> 
        getAttributesFieldBuilder() {
      if (attributesBuilder_ == null) {
        attributesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bonree.integration.core.opentelemetry.common.v1.KeyValue, com.bonree.integration.core.opentelemetry.common.v1.KeyValue.Builder, com.bonree.integration.core.opentelemetry.common.v1.KeyValueOrBuilder>(
                attributes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        attributes_ = null;
      }
      return attributesBuilder_;
    }

    private int droppedAttributesCount_ ;
    /**
     * <pre>
     * dropped_attributes_count is the number of dropped attributes. If the value is 0, then
     * no attributes were dropped.
     * </pre>
     *
     * <code>uint32 dropped_attributes_count = 2;</code>
     * @return The droppedAttributesCount.
     */
    @Override
    public int getDroppedAttributesCount() {
      return droppedAttributesCount_;
    }
    /**
     * <pre>
     * dropped_attributes_count is the number of dropped attributes. If the value is 0, then
     * no attributes were dropped.
     * </pre>
     *
     * <code>uint32 dropped_attributes_count = 2;</code>
     * @param value The droppedAttributesCount to set.
     * @return This builder for chaining.
     */
    public Builder setDroppedAttributesCount(int value) {
      
      droppedAttributesCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dropped_attributes_count is the number of dropped attributes. If the value is 0, then
     * no attributes were dropped.
     * </pre>
     *
     * <code>uint32 dropped_attributes_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDroppedAttributesCount() {
      
      droppedAttributesCount_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.resource.v1.Resource)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.resource.v1.Resource)
  private static final Resource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Resource();
  }

  public static Resource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Resource>
      PARSER = new com.google.protobuf.AbstractParser<Resource>() {
    @Override
    public Resource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Resource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Resource> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Resource> getParserForType() {
    return PARSER;
  }

  @Override
  public Resource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

