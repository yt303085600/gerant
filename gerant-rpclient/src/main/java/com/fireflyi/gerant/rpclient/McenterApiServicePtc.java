// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: McenterApiService.proto

package com.fireflyi.gerant.rpclient;

public final class McenterApiServicePtc {
  private McenterApiServicePtc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027McenterApiService.proto\022\010protobuf\032\rGre" +
      "qptc.proto\032\rGresptc.proto2B\n\021McenterApiS" +
      "ervice\022-\n\tmcPipline\022\016.protocol.Greq\032\016.pr" +
      "otocol.Gres\"\000B6\n\034com.fireflyi.gerant.rpc" +
      "lientB\024McenterApiServicePtcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.fireflyi.gerant.rpclient.protobuf.GreqPtc.getDescriptor(),
          com.fireflyi.gerant.rpclient.protobuf.GresPtc.getDescriptor(),
        });
    com.fireflyi.gerant.rpclient.protobuf.GreqPtc.getDescriptor();
    com.fireflyi.gerant.rpclient.protobuf.GresPtc.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
