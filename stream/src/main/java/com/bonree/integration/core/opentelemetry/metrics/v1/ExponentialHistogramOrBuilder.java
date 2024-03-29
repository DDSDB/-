// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metrics/v1/metrics.proto

package com.bonree.integration.core.opentelemetry.metrics.v1;

public interface ExponentialHistogramOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.ExponentialHistogram)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint data_points = 1;</code>
   */
  java.util.List<ExponentialHistogramDataPoint> 
      getDataPointsList();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint data_points = 1;</code>
   */
  ExponentialHistogramDataPoint getDataPoints(int index);
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint data_points = 1;</code>
   */
  int getDataPointsCount();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint data_points = 1;</code>
   */
  java.util.List<? extends ExponentialHistogramDataPointOrBuilder> 
      getDataPointsOrBuilderList();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint data_points = 1;</code>
   */
  ExponentialHistogramDataPointOrBuilder getDataPointsOrBuilder(
      int index);

  /**
   * <pre>
   * aggregation_temporality describes if the aggregator reports delta changes
   * since last report time, or cumulative changes since a fixed start time.
   * </pre>
   *
   * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
   * @return The enum numeric value on the wire for aggregationTemporality.
   */
  int getAggregationTemporalityValue();
  /**
   * <pre>
   * aggregation_temporality describes if the aggregator reports delta changes
   * since last report time, or cumulative changes since a fixed start time.
   * </pre>
   *
   * <code>.opentelemetry.proto.metrics.v1.AggregationTemporality aggregation_temporality = 2;</code>
   * @return The aggregationTemporality.
   */
  AggregationTemporality getAggregationTemporality();
}
