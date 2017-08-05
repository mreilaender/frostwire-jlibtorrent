/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_flags_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected peer_flags_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_flags_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_flags_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static peer_flags_t all() {
    return new peer_flags_t(libtorrent_jni.peer_flags_t_all(), true);
  }

  public boolean op_bool() {
    return libtorrent_jni.peer_flags_t_op_bool(swigCPtr, this);
  }

  public boolean op_eq(peer_flags_t f) {
    return libtorrent_jni.peer_flags_t_op_eq(swigCPtr, this, peer_flags_t.getCPtr(f), f);
  }

  public boolean op_ne(peer_flags_t f) {
    return libtorrent_jni.peer_flags_t_op_ne(swigCPtr, this, peer_flags_t.getCPtr(f), f);
  }

  public static peer_flags_t op_or(peer_flags_t lhs, peer_flags_t rhs) {
    return new peer_flags_t(libtorrent_jni.peer_flags_t_op_or(peer_flags_t.getCPtr(lhs), lhs, peer_flags_t.getCPtr(rhs), rhs), true);
  }

  public static peer_flags_t op_and(peer_flags_t lhs, peer_flags_t rhs) {
    return new peer_flags_t(libtorrent_jni.peer_flags_t_op_and(peer_flags_t.getCPtr(lhs), lhs, peer_flags_t.getCPtr(rhs), rhs), true);
  }

  public static peer_flags_t op_xor(peer_flags_t lhs, peer_flags_t rhs) {
    return new peer_flags_t(libtorrent_jni.peer_flags_t_op_xor(peer_flags_t.getCPtr(lhs), lhs, peer_flags_t.getCPtr(rhs), rhs), true);
  }

  public peer_flags_t op_inv() {
    return new peer_flags_t(libtorrent_jni.peer_flags_t_op_inv(swigCPtr, this), true);
  }

  public int to_int() {
    return libtorrent_jni.peer_flags_t_to_int(swigCPtr, this);
  }

  public peer_flags_t() {
    this(libtorrent_jni.new_peer_flags_t(), true);
  }

}
