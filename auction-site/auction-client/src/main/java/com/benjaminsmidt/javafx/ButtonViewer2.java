package com.benjaminsmidt.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonViewer2 extends Application
{
   public void start(Stage stage1)
   {
      Label label1 = new Label("");
      label1.relocate(0, 50);

      Button button1 = new Button("Click me!");
      button1.setOnAction(event ->
            label1.setText(label1.getText() + "I was clicked!\n"));

      Pane root = new Pane(label1, button1);

      final int PANE_WIDTH = 300;
      final int PANE_HEIGHT = 400;
      root.setMinSize(PANE_WIDTH, PANE_HEIGHT);

      Scene scene1 = new Scene(root);
      stage1.setScene(scene1);
      stage1.setTitle("ButtonViewer2");
      stage1.show();
   }
}
