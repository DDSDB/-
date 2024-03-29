// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/v1/common.proto

package com.bonree.integration.core.opentelemetry.common.v1;

public interface InstrumentationScopeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.common.v1.InstrumentationScope)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An empty instrumentation scope name means the name is unknown.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  String getName();
  /**
   * <pre>
   * An empty instrumentation scope name means the name is unknown.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string version = 2;</code>
   * @return The version.
   */
  String getVersion();
  /**
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  java.util.List<KeyValue> 
      getAttributesList();
  /**
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  KeyValue getAttributes(int index);
  /**
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  int getAttributesCount();
  /**
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  java.util.List<? extends KeyValueOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <code>repeated .opentelemetry.proto.common.v1.KeyValue attributes = 3;</code>
   */
  KeyValueOrBuilder getAttributesOrBuilder(
      int index);

  /**
   * <code>uint32 dropped_attributes_count = 4;</code>
   * @return The droppedAttributesCount.
   */
  int getDroppedAttributesCount();
}
