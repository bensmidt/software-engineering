/*
 * EE422C Final Project submission by
 * Benjamin Smidt
 * brs2933
 * Summer 2023
 */
package com.benjaminsmidt.server; 

class Message {
  String type;
  String input;
  int number;

  protected Message() {
    this.type = "";
    this.input = "";
    this.number = 0;
    System.out.println("server-side message created");
  }

  protected Message(String type, String input, int number) {
    this.type = type;
    this.input = input;
    this.number = number;
    System.out.println("server-side message created");
  }
}