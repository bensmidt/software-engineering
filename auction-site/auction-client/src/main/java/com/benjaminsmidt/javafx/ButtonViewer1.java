package com.benjaminsmidt.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonViewer1 extends Application
{
   public void start(Stage stage1)
   {
      Button button1 = new Button("Click me!");
      EventHandler<ActionEvent> handler = new ClickHandler();
      button1.setOnAction(handler);

      Pane root = new Pane(button1);
      final int PANE_WIDTH = 300;
      final int PANE_HEIGHT = 400;
      root.setMinSize(PANE_WIDTH, PANE_HEIGHT);

      Scene scene1 = new Scene(root);
      stage1.setScene(scene1);
      stage1.setTitle("A pane with a button");
      stage1.show();
   }
}
