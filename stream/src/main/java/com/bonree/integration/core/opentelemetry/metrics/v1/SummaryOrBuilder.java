// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metrics/v1/metrics.proto

package com.bonree.integration.core.opentelemetry.metrics.v1;

public interface SummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.Summary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.SummaryDataPoint data_points = 1;</code>
   */
  java.util.List<SummaryDataPoint> 
      getDataPointsList();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.SummaryDataPoint data_points = 1;</code>
   */
  SummaryDataPoint getDataPoints(int index);
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.SummaryDataPoint data_points = 1;</code>
   */
  int getDataPointsCount();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.SummaryDataPoint data_points = 1;</code>
   */
  java.util.List<? extends SummaryDataPointOrBuilder> 
      getDataPointsOrBuilderList();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.SummaryDataPoint data_points = 1;</code>
   */
  SummaryDataPointOrBuilder getDataPointsOrBuilder(
      int index);
}
