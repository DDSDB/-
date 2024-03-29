// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collector/trace/v1/trace_service.proto

package com.bonree.integration.core.opentelemetry.collector.trace.v1;

public interface ExportTraceServiceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An array of ResourceSpans.
   * For data coming from a single resource this array will typically contain one
   * element. Intermediary nodes (such as OpenTelemetry Collector) that receive
   * data from multiple origins typically batch the data before forwarding further and
   * in that case this array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
   */
  java.util.List<com.bonree.integration.core.opentelemetry.trace.v1.ResourceSpans> 
      getResourceSpansList();
  /**
   * <pre>
   * An array of ResourceSpans.
   * For data coming from a single resource this array will typically contain one
   * element. Intermediary nodes (such as OpenTelemetry Collector) that receive
   * data from multiple origins typically batch the data before forwarding further and
   * in that case this array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
   */
  com.bonree.integration.core.opentelemetry.trace.v1.ResourceSpans getResourceSpans(int index);
  /**
   * <pre>
   * An array of ResourceSpans.
   * For data coming from a single resource this array will typically contain one
   * element. Intermediary nodes (such as OpenTelemetry Collector) that receive
   * data from multiple origins typically batch the data before forwarding further and
   * in that case this array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
   */
  int getResourceSpansCount();
  /**
   * <pre>
   * An array of ResourceSpans.
   * For data coming from a single resource this array will typically contain one
   * element. Intermediary nodes (such as OpenTelemetry Collector) that receive
   * data from multiple origins typically batch the data before forwarding further and
   * in that case this array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
   */
  java.util.List<? extends com.bonree.integration.core.opentelemetry.trace.v1.ResourceSpansOrBuilder> 
      getResourceSpansOrBuilderList();
  /**
   * <pre>
   * An array of ResourceSpans.
   * For data coming from a single resource this array will typically contain one
   * element. Intermediary nodes (such as OpenTelemetry Collector) that receive
   * data from multiple origins typically batch the data before forwarding further and
   * in that case this array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.trace.v1.ResourceSpans resource_spans = 1;</code>
   */
  com.bonree.integration.core.opentelemetry.trace.v1.ResourceSpansOrBuilder getResourceSpansOrBuilder(
      int index);
}
