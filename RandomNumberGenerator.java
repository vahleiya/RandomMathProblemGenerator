import javafx.application.*;
import javafx.stage.*;
import java.lang.Math;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class RandomNumberGenerator extends Application {

    Stage window;
    Scene menuScene, userScene;



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        int num1;
        int num2;
        int tmpnum;

        GridPane menuGrid = new GridPane();
        menuGrid.setPadding(new Insets(10, 10, 10, 10));
        menuGrid.setVgap(8);
        menuGrid.setHgap(10);

        //Button 1
        Label mgLabel1 = new Label("Hello!");
        GridPane.setConstraints(mgLabel1, 0, 0);

        Label mgLabel2 = new Label("Would you like to practice some math today?");
        GridPane.setConstraints(mgLabel2, 0, 1);

        Label mgLabel3 = new Label("Enter a number for one of the following modes:");
        GridPane.setConstraints(mgLabel3, 0, 2);

        Label mgLabel4 = new Label("1. Addition");
        GridPane.setConstraints(mgLabel4, 0, 3);

        Label mgLabel5 = new Label("2. Subtraction");
        GridPane.setConstraints(mgLabel5, 0, 4);

        Label mgLabel6 = new Label("3. Multiplication");
        GridPane.setConstraints(mgLabel6, 0, 5);

        Label mgLabel7 = new Label("4. Division");
        GridPane.setConstraints(mgLabel7, 0, 6);

        TextField mgInput = new TextField("");
        mgInput.setPromptText("1");
        GridPane.setConstraints(mgInput, 0, 7);

        Button mgButton = new Button("Go!");
        GridPane.setConstraints(mgButton, 0, 8);
        mgButton.setOnAction(e -> {
            switch (sceneSwitch(mgInput, mgInput.getText())) {
                case 1:
                    window.setScene(userScene);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        });

        menuGrid.getChildren().addAll(mgLabel1, mgLabel2, mgLabel3, mgLabel4, mgLabel5, mgLabel6, mgLabel7, mgInput, mgButton);
        menuScene = new Scene(menuGrid, 300, 300);

        GridPane userGrid = new GridPane();
        userGrid.setPadding(new Insets(10, 10, 10, 10));
        userGrid.setVgap(8);
        userGrid.setHgap(10);



        num1 = (int) (Math.random() * 51);
        num2 = (int) (Math.random() * 51);
        tmpnum = num1;

        if( num2 > num1 ){
            num1 = num2;
            num1 = tmpnum;
        }

        Label ugLabel1 = new Label("What is " + num1 + " + " + num2 + " ?");
        GridPane.setConstraints(ugLabel1, 0, 1);

        TextField ugInput = new TextField("");
        ugInput.setPromptText("Enter Answer here");
        GridPane.setConstraints(ugInput, 0, 2);

        //Button 2
        Button ugButton = new Button("Check Answer");
        GridPane.setConstraints(ugButton, 0, 3);
        ugButton.setOnAction(e -> window.setScene(menuScene));

        userGrid.getChildren().addAll(ugLabel1, ugInput, ugButton);
        userScene = new Scene(userGrid, 300, 300);

        //Display scene 1 at first
        window.setScene(menuScene);
        window.setTitle("Random Math Problem Generator");
        window.show();
    }

    public static int sceneSwitch(TextField input, String choice) {
        try {
            String txt = input.getText();
            int num = Integer.parseInt(txt.trim());
            return num;
        } catch (NumberFormatException e) {
            menuAlert.display("Invalid Input", choice);
            return 0;
        }
    }
}