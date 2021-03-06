package tictactoe;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;

public  class LossBase extends Pane {

    protected final Label label;
    protected final DropShadow dropShadow;
    protected  MediaView mediaView;
    protected final Button button;
    protected final DropShadow dropShadow0;
    protected final Button button0;
    protected final DropShadow dropShadow1;

    public LossBase(ClientPlayer client) {

        label = new Label();
        dropShadow = new DropShadow();
        button = new Button();
        dropShadow0 = new DropShadow();
        button0 = new Button();
        dropShadow1 = new DropShadow();
        MediaPlayer player = new MediaPlayer( new Media(getClass().getResource("img/loseer.mp4").toExternalForm()));
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(700.0);
        setPrefWidth(900.0);
        setStyle("-fx-background-color: black;");

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setLayoutX(295.0);
        label.setLayoutY(33.0);
        label.setPrefHeight(93.0);
        label.setPrefWidth(310.0);
        label.setStyle("-fx-background-color: black; -fx-region-background: white;");
        label.setText("Loser");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font("Jokerman", 57.0));

        dropShadow.setColor(javafx.scene.paint.Color.valueOf("#eb02b1"));
        dropShadow.setHeight(255.0);
        dropShadow.setRadius(127.0);
        dropShadow.setSpread(0.76);
        dropShadow.setWidth(255.0);
        label.setEffect(dropShadow);
        
        mediaView = new MediaView(player);
        mediaView.setFitHeight(400.0);
        mediaView.setFitWidth(750.0);
        mediaView.setLayoutX(75.0);
        mediaView.setLayoutY(150.0);

        button.setLayoutX(95.0);
        button.setLayoutY(599.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(65.0);
        button.setPrefWidth(301.0);
        button.setStyle("-fx-background-color: Black; -fx-background-radius: 100; -fx-border-color: white; -fx-border-radius: 100; -fx-border-width: 2;");
        button.setText("Play again");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font("Jokerman", 27.0));
        
        dropShadow0.setColor(javafx.scene.paint.Color.valueOf("#c321bd"));
        dropShadow0.setHeight(50.65);
        dropShadow0.setRadius(26.307499999999997);
        dropShadow0.setSpread(0.59);
        dropShadow0.setWidth(56.58);
        button.setEffect(null);
         button.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent ev)
            {
               button.setEffect(dropShadow0);
            }
        });
        button.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent ev)
            {
              button.setEffect(null);
            }
        });
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent ev)
            {
                player.stop();
              client.setGameRoot("startGame");
            }
        });

        button0.setLayoutX(516.0);
        button0.setLayoutY(599.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(65.0);
        button0.setPrefWidth(301.0);
        button0.setStyle("-fx-background-color: Black; -fx-background-radius: 100; -fx-border-color: white; -fx-border-radius: 100; -fx-border-width: 2;");
        button0.setText("close");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);
        button0.setFont(new Font("Jokerman", 27.0));

        button0.setEffect(null);
        player.play();
        button0.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent ev)
            {
               button0.setEffect(dropShadow0);
            }
        });
        button0.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent ev)
            {
              button0.setEffect(null);
            }
        });
        button0.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent ev)
            {
                player.stop();
              client.setGameRoot("into");
               
            }
        });

        getChildren().add(label);
        getChildren().add(mediaView);
        getChildren().add(button);
        getChildren().add(button0);

    }
}
