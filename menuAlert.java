import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class menuAlert {

    public static void display(String title, String message, int ans, int mode) {
        Stage window = new Stage();

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(300);

        Label label = new Label();

        if(mode == 0) {
            label.setText(" " + message + " is an Invalid Input! Please enter a number ");
        } else if (mode == 1){
            label.setText(" Incorrect! The correct answer is " + ans + " ");
        } else if (mode == 2){
            label.setText(" " + ans + " is the correct answer! ");
        }

        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
    
}
