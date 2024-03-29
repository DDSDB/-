// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metrics/v1/metrics.proto

package com.bonree.integration.core.opentelemetry.metrics.v1;

/**
 * <pre>
 * Sum represents the type of a scalar metric that is calculated as a sum of all
 * reported measurements over a time interval.
 * </pre>
 *
 * Protobuf type {@code opentelemetry.proto.metrics.v1.Sum}
 */
public final class Sum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.metrics.v1.Sum)
    SumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Sum.newBuilder() to construct.
  private Sum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Sum() {
    dataPoints_ = java.util.Collections.emptyList();
    aggregationTemporality_ = 0;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Sum();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Sum(
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
              dataPoints_ = new java.util.ArrayList<NumberDataPoint>();
              mutable_bitField0_ |= 0x00000001;
            }
            dataPoints_.add(
                input.readMessage(NumberDataPoint.parser(), extensionRegistry));
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            aggregationTemporality_ = rawValue;
            break;
          }
          case 24: {

            isMonotonic_ = input.readBool();
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
        dataPoints_ = java.util.Collections.unmodifiableList(dataPoints_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MetricsProto.internal_static_opentelemetry_proto_metrics_v1_Sum_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MetricsProto.internal_static_opentelemetry_proto_metrics_v1_Sum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Sum.class, Builder.class);
  }

  public static final int DATA_POINTS_FIELD_NUMBER = 1;
  private java.util.List<NumberDataPoint> dataPoints_;
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  @Override
  public java.util.List<NumberDataPoint> getDataPointsList() {
    return dataPoints_;
  }
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  @Override
  public java.util.List<? extends NumberDataPointOrBuilder> 
      getDataPointsOrBuilderList() {
    return dataPoints_;
  }
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  @Override
  public int getDataPointsCount() {
    return dataPoints_.size();
  }
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  @Override
  public NumberDataPoint getDataPoints(int index) {
    return dataPoints_.get(index);
  }
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  @Override
  public NumberDataPointOrBuilder getDataPointsOrBuilder(
      int index) {
    return dataPoints_.get(index);
  }

  public static final int AGGREGATION_TEMPORALITY_FIELD_NUMBER = 2;
  private int aggregationTemporality_;
  /**
   * <pre>
   * aggregation_temporality describes if the aggregator reports delta changes
   * since last report time, or cumulative changes since a fixed start time.
   * </pre>
   *
   * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
   * @return The enum numeric value on the wire for aggregationTemporality.
   */
  @Override public int getAggregationTemporalityValue() {
    return aggregationTemporality_;
  }
  /**
   * <pre>
   * aggregation_temporality describes if the aggregator reports delta changes
   * since last report time, or cumulative changes since a fixed start time.
   * </pre>
   *
   * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
   * @return The aggregationTemporality.
   */
  @Override public AggregationTemporality getAggregationTemporality() {
    @SuppressWarnings("deprecation")
    AggregationTemporality result = AggregationTemporality.valueOf(aggregationTemporality_);
    return result == null ? AggregationTemporality.UNRECOGNIZED : result;
  }

  public static final int IS_MONOTONIC_FIELD_NUMBER = 3;
  private boolean isMonotonic_;
  /**
   * <pre>
   * If "true" means that the sum is monotonic.
   * </pre>
   *
   * <code>bool is_monotonic = 3;</code>
   * @return The isMonotonic.
   */
  @Override
  public boolean getIsMonotonic() {
    return isMonotonic_;
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
    for (int i = 0; i < dataPoints_.size(); i++) {
      output.writeMessage(1, dataPoints_.get(i));
    }
    if (aggregationTemporality_ != AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, aggregationTemporality_);
    }
    if (isMonotonic_ != false) {
      output.writeBool(3, isMonotonic_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dataPoints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dataPoints_.get(i));
    }
    if (aggregationTemporality_ != AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, aggregationTemporality_);
    }
    if (isMonotonic_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isMonotonic_);
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
    if (!(obj instanceof Sum)) {
      return super.equals(obj);
    }
    Sum other = (Sum) obj;

    if (!getDataPointsList()
        .equals(other.getDataPointsList())) return false;
    if (aggregationTemporality_ != other.aggregationTemporality_) return false;
    if (getIsMonotonic()
        != other.getIsMonotonic()) return false;
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
    if (getDataPointsCount() > 0) {
      hash = (37 * hash) + DATA_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getDataPointsList().hashCode();
    }
    hash = (37 * hash) + AGGREGATION_TEMPORALITY_FIELD_NUMBER;
    hash = (53 * hash) + aggregationTemporality_;
    hash = (37 * hash) + IS_MONOTONIC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsMonotonic());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Sum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Sum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Sum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Sum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Sum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Sum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Sum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Sum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Sum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Sum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Sum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Sum parseFrom(
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
  public static Builder newBuilder(Sum prototype) {
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
   * Sum represents the type of a scalar metric that is calculated as a sum of all
   * reported measurements over a time interval.
   * </pre>
   *
   * Protobuf type {@code opentelemetry.proto.metrics.v1.Sum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.metrics.v1.Sum)
      SumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MetricsProto.internal_static_opentelemetry_proto_metrics_v1_Sum_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MetricsProto.internal_static_opentelemetry_proto_metrics_v1_Sum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Sum.class, Builder.class);
    }

    // Construct using com.bonree.integration.core.opentelemetry.metrics.v1.Sum.newBuilder()
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
        getDataPointsFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (dataPointsBuilder_ == null) {
        dataPoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataPointsBuilder_.clear();
      }
      aggregationTemporality_ = 0;

      isMonotonic_ = false;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MetricsProto.internal_static_opentelemetry_proto_metrics_v1_Sum_descriptor;
    }

    @Override
    public Sum getDefaultInstanceForType() {
      return Sum.getDefaultInstance();
    }

    @Override
    public Sum build() {
      Sum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Sum buildPartial() {
      Sum result = new Sum(this);
      int from_bitField0_ = bitField0_;
      if (dataPointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dataPoints_ = java.util.Collections.unmodifiableList(dataPoints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dataPoints_ = dataPoints_;
      } else {
        result.dataPoints_ = dataPointsBuilder_.build();
      }
      result.aggregationTemporality_ = aggregationTemporality_;
      result.isMonotonic_ = isMonotonic_;
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
      if (other instanceof Sum) {
        return mergeFrom((Sum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Sum other) {
      if (other == Sum.getDefaultInstance()) return this;
      if (dataPointsBuilder_ == null) {
        if (!other.dataPoints_.isEmpty()) {
          if (dataPoints_.isEmpty()) {
            dataPoints_ = other.dataPoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataPointsIsMutable();
            dataPoints_.addAll(other.dataPoints_);
          }
          onChanged();
        }
      } else {
        if (!other.dataPoints_.isEmpty()) {
          if (dataPointsBuilder_.isEmpty()) {
            dataPointsBuilder_.dispose();
            dataPointsBuilder_ = null;
            dataPoints_ = other.dataPoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataPointsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataPointsFieldBuilder() : null;
          } else {
            dataPointsBuilder_.addAllMessages(other.dataPoints_);
          }
        }
      }
      if (other.aggregationTemporality_ != 0) {
        setAggregationTemporalityValue(other.getAggregationTemporalityValue());
      }
      if (other.getIsMonotonic() != false) {
        setIsMonotonic(other.getIsMonotonic());
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
      Sum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Sum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<NumberDataPoint> dataPoints_ =
      java.util.Collections.emptyList();
    private void ensureDataPointsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dataPoints_ = new java.util.ArrayList<NumberDataPoint>(dataPoints_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        NumberDataPoint, NumberDataPoint.Builder, NumberDataPointOrBuilder> dataPointsBuilder_;

    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public java.util.List<NumberDataPoint> getDataPointsList() {
      if (dataPointsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataPoints_);
      } else {
        return dataPointsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public int getDataPointsCount() {
      if (dataPointsBuilder_ == null) {
        return dataPoints_.size();
      } else {
        return dataPointsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public NumberDataPoint getDataPoints(int index) {
      if (dataPointsBuilder_ == null) {
        return dataPoints_.get(index);
      } else {
        return dataPointsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public Builder setDataPoints(
        int index, NumberDataPoint value) {
      if (dataPointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataPointsIsMutable();
        dataPoints_.set(index, value);
        onChanged();
      } else {
        dataPointsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public Builder setDataPoints(
        int index, NumberDataPoint.Builder builderForValue) {
      if (dataPointsBuilder_ == null) {
        ensureDataPointsIsMutable();
        dataPoints_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataPointsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public Builder addDataPoints(NumberDataPoint value) {
      if (dataPointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataPointsIsMutable();
        dataPoints_.add(value);
        onChanged();
      } else {
        dataPointsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public Builder addDataPoints(
        int index, NumberDataPoint value) {
      if (dataPointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataPointsIsMutable();
        dataPoints_.add(index, value);
        onChanged();
      } else {
        dataPointsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public Builder addDataPoints(
        NumberDataPoint.Builder builderForValue) {
      if (dataPointsBuilder_ == null) {
        ensureDataPointsIsMutable();
        dataPoints_.add(builderForValue.build());
        onChanged();
      } else {
        dataPointsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public Builder addDataPoints(
        int index, NumberDataPoint.Builder builderForValue) {
      if (dataPointsBuilder_ == null) {
        ensureDataPointsIsMutable();
        dataPoints_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataPointsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public Builder addAllDataPoints(
        Iterable<? extends NumberDataPoint> values) {
      if (dataPointsBuilder_ == null) {
        ensureDataPointsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dataPoints_);
        onChanged();
      } else {
        dataPointsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public Builder clearDataPoints() {
      if (dataPointsBuilder_ == null) {
        dataPoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataPointsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public Builder removeDataPoints(int index) {
      if (dataPointsBuilder_ == null) {
        ensureDataPointsIsMutable();
        dataPoints_.remove(index);
        onChanged();
      } else {
        dataPointsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public NumberDataPoint.Builder getDataPointsBuilder(
        int index) {
      return getDataPointsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public NumberDataPointOrBuilder getDataPointsOrBuilder(
        int index) {
      if (dataPointsBuilder_ == null) {
        return dataPoints_.get(index);  } else {
        return dataPointsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public java.util.List<? extends NumberDataPointOrBuilder> 
         getDataPointsOrBuilderList() {
      if (dataPointsBuilder_ != null) {
        return dataPointsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataPoints_);
      }
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public NumberDataPoint.Builder addDataPointsBuilder() {
      return getDataPointsFieldBuilder().addBuilder(
          NumberDataPoint.getDefaultInstance());
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public NumberDataPoint.Builder addDataPointsBuilder(
        int index) {
      return getDataPointsFieldBuilder().addBuilder(
          index, NumberDataPoint.getDefaultInstance());
    }
    /**
     * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
     */
    public java.util.List<NumberDataPoint.Builder> 
         getDataPointsBuilderList() {
      return getDataPointsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        NumberDataPoint, NumberDataPoint.Builder, NumberDataPointOrBuilder> 
        getDataPointsFieldBuilder() {
      if (dataPointsBuilder_ == null) {
        dataPointsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            NumberDataPoint, NumberDataPoint.Builder, NumberDataPointOrBuilder>(
                dataPoints_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dataPoints_ = null;
      }
      return dataPointsBuilder_;
    }

    private int aggregationTemporality_ = 0;
    /**
     * <pre>
     * aggregation_temporality describes if the aggregator reports delta changes
     * since last report time, or cumulative changes since a fixed start time.
     * </pre>
     *
     * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
     * @return The enum numeric value on the wire for aggregationTemporality.
     */
    @Override public int getAggregationTemporalityValue() {
      return aggregationTemporality_;
    }
    /**
     * <pre>
     * aggregation_temporality describes if the aggregator reports delta changes
     * since last report time, or cumulative changes since a fixed start time.
     * </pre>
     *
     * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
     * @param value The enum numeric value on the wire for aggregationTemporality to set.
     * @return This builder for chaining.
     */
    public Builder setAggregationTemporalityValue(int value) {
      
      aggregationTemporality_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * aggregation_temporality describes if the aggregator reports delta changes
     * since last report time, or cumulative changes since a fixed start time.
     * </pre>
     *
     * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
     * @return The aggregationTemporality.
     */
    @Override
    public AggregationTemporality getAggregationTemporality() {
      @SuppressWarnings("deprecation")
      AggregationTemporality result = AggregationTemporality.valueOf(aggregationTemporality_);
      return result == null ? AggregationTemporality.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * aggregation_temporality describes if the aggregator reports delta changes
     * since last report time, or cumulative changes since a fixed start time.
     * </pre>
     *
     * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
     * @param value The aggregationTemporality to set.
     * @return This builder for chaining.
     */
    public Builder setAggregationTemporality(AggregationTemporality value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      aggregationTemporality_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * aggregation_temporality describes if the aggregator reports delta changes
     * since last report time, or cumulative changes since a fixed start time.
     * </pre>
     *
     * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAggregationTemporality() {
      
      aggregationTemporality_ = 0;
      onChanged();
      return this;
    }

    private boolean isMonotonic_ ;
    /**
     * <pre>
     * If "true" means that the sum is monotonic.
     * </pre>
     *
     * <code>bool is_monotonic = 3;</code>
     * @return The isMonotonic.
     */
    @Override
    public boolean getIsMonotonic() {
      return isMonotonic_;
    }
    /**
     * <pre>
     * If "true" means that the sum is monotonic.
     * </pre>
     *
     * <code>bool is_monotonic = 3;</code>
     * @param value The isMonotonic to set.
     * @return This builder for chaining.
     */
    public Builder setIsMonotonic(boolean value) {
      
      isMonotonic_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If "true" means that the sum is monotonic.
     * </pre>
     *
     * <code>bool is_monotonic = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsMonotonic() {
      
      isMonotonic_ = false;
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


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.metrics.v1.Sum)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.metrics.v1.Sum)
  private static final Sum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Sum();
  }

  public static Sum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Sum>
      PARSER = new com.google.protobuf.AbstractParser<Sum>() {
    @Override
    public Sum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Sum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Sum> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Sum> getParserForType() {
    return PARSER;
  }

  @Override
  public Sum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

