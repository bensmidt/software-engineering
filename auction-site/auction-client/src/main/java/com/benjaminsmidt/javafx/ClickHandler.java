package com.benjaminsmidt.javafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ClickHandler implements EventHandler<ActionEvent>
{
   public void handle(ActionEvent event)
   {
      System.out.println("I was clicked.");
   }
}
