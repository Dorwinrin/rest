package com.example.rest;

public class OrderNotFoundException extends RuntimeException {

  public OrderNotFoundException(Long id) {
    super("Could not find Order " + id);
  }
}
