// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Gresptc.proto

package com.fireflyi.gerant.rpclient.protobuf;

public interface GresOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protocol.Gres)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *状态
   * </pre>
   *
   * <code>int32 status = 1;</code>
   */
  int getStatus();

  /**
   * <pre>
   *返回码
   * </pre>
   *
   * <code>int32 code = 2;</code>
   */
  int getCode();

  /**
   * <code>string resMsg = 3;</code>
   */
  java.lang.String getResMsg();
  /**
   * <code>string resMsg = 3;</code>
   */
  com.google.protobuf.ByteString
      getResMsgBytes();
}
