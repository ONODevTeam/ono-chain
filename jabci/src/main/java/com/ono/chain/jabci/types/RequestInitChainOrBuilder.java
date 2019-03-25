// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.ono.chain.jabci.types;

public interface RequestInitChainOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ono.chain.jabci.types.RequestInitChain)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp time = 1;</code>
   */
  boolean hasTime();
  /**
   * <code>.google.protobuf.Timestamp time = 1;</code>
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <code>.google.protobuf.Timestamp time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <code>string chain_id = 2;</code>
   */
  java.lang.String getChainId();
  /**
   * <code>string chain_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <code>.com.ono.chain.jabci.types.ConsensusParams consensus_params = 3;</code>
   */
  boolean hasConsensusParams();
  /**
   * <code>.com.ono.chain.jabci.types.ConsensusParams consensus_params = 3;</code>
   */
  com.ono.chain.jabci.types.ConsensusParams getConsensusParams();
  /**
   * <code>.com.ono.chain.jabci.types.ConsensusParams consensus_params = 3;</code>
   */
  com.ono.chain.jabci.types.ConsensusParamsOrBuilder getConsensusParamsOrBuilder();

  /**
   * <code>repeated .com.ono.chain.jabci.types.ValidatorUpdate validators = 4;</code>
   */
  java.util.List<com.ono.chain.jabci.types.ValidatorUpdate>
      getValidatorsList();
  /**
   * <code>repeated .com.ono.chain.jabci.types.ValidatorUpdate validators = 4;</code>
   */
  com.ono.chain.jabci.types.ValidatorUpdate getValidators(int index);
  /**
   * <code>repeated .com.ono.chain.jabci.types.ValidatorUpdate validators = 4;</code>
   */
  int getValidatorsCount();
  /**
   * <code>repeated .com.ono.chain.jabci.types.ValidatorUpdate validators = 4;</code>
   */
  java.util.List<? extends com.ono.chain.jabci.types.ValidatorUpdateOrBuilder>
      getValidatorsOrBuilderList();
  /**
   * <code>repeated .com.ono.chain.jabci.types.ValidatorUpdate validators = 4;</code>
   */
  com.ono.chain.jabci.types.ValidatorUpdateOrBuilder getValidatorsOrBuilder(
      int index);

  /**
   * <code>bytes app_state_bytes = 5;</code>
   */
  com.google.protobuf.ByteString getAppStateBytes();
}
