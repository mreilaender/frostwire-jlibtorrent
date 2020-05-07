package com.frostwire.jlibtorrent.exception;

public class NoSessionException extends RuntimeException {

  public NoSessionException() {
    super(formatMessage());
  }

  private static String formatMessage() {
    return "No session has been created/started";
  }
}
