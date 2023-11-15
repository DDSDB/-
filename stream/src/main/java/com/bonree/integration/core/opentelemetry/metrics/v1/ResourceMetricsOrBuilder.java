// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metrics/v1/metrics.proto

package com.bonree.integration.core.opentelemetry.metrics.v1;

public interface ResourceMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.ResourceMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource for the metrics in this message.
   * If this field is not set then no resource info is known.
   * </pre>
   *
   * <code>.opentelemetry.proto.resource.v1.Resource resource = 1;</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * The resource for the metrics in this message.
   * If this field is not set then no resource info is known.
   * </pre>
   *
   * <code>.opentelemetry.proto.resource.v1.Resource resource = 1;</code>
   * @return The resource.
   */
  com.bonree.integration.core.opentelemetry.resource.v1.Resource getResource();
  /**
   * <pre>
   * The resource for the metrics in this message.
   * If this field is not set then no resource info is known.
   * </pre>
   *
   * <code>.opentelemetry.proto.resource.v1.Resource resource = 1;</code>
   */
  com.bonree.integration.core.opentelemetry.resource.v1.ResourceOrBuilder getResourceOrBuilder();

  /**
   * <pre>
   * A list of metrics that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ScopeMetrics scope_metrics = 2;</code>
   */
  java.util.List<ScopeMetrics> 
      getScopeMetricsList();
  /**
   * <pre>
   * A list of metrics that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ScopeMetrics scope_metrics = 2;</code>
   */
  ScopeMetrics getScopeMetrics(int index);
  /**
   * <pre>
   * A list of metrics that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ScopeMetrics scope_metrics = 2;</code>
   */
  int getScopeMetricsCount();
  /**
   * <pre>
   * A list of metrics that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ScopeMetrics scope_metrics = 2;</code>
   */
  java.util.List<? extends ScopeMetricsOrBuilder> 
      getScopeMetricsOrBuilderList();
  /**
   * <pre>
   * A list of metrics that originate from a resource.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ScopeMetrics scope_metrics = 2;</code>
   */
  ScopeMetricsOrBuilder getScopeMetricsOrBuilder(
      int index);

  /**
   * <pre>
   * This schema_url applies to the data in the "resource" field. It does not apply
   * to the data in the "scope_metrics" field which have their own schema_url field.
   * </pre>
   *
   * <code>string schema_url = 3;</code>
   * @return The schemaUrl.
   */
  String getSchemaUrl();
  /**
   * <pre>
   * This schema_url applies to the data in the "resource" field. It does not apply
   * to the data in the "scope_metrics" field which have their own schema_url field.
   * </pre>
   *
   * <code>string schema_url = 3;</code>
   * @return The bytes for schemaUrl.
   */
  com.google.protobuf.ByteString
      getSchemaUrlBytes();
}