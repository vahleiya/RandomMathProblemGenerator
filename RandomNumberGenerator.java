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
    int num1;
    int num2;
    int tmpnum;
    int choice;
    int uNum;
    int resCheck;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;



        GridPane menuGrid = new GridPane();
        menuGrid.setPadding(new Insets(10, 10, 10, 10));
        menuGrid.setVgap(8);
        menuGrid.setHgap(10);

        GridPane userGrid = new GridPane();
        userGrid.setPadding(new Insets(10, 10, 10, 10));
        userGrid.setVgap(8);
        userGrid.setHgap(10);

        Label ugLabel1 = new Label("What is " + num1 + " + " + num2 + " ?");
        GridPane.setConstraints(ugLabel1, 0, 1);

        TextField ugInput = new TextField("");
        ugInput.setPromptText("Enter Answer here");
        GridPane.setConstraints(ugInput, 0, 2);

        //Button 2
        Button ugButton = new Button("Check Answer");
        GridPane.setConstraints(ugButton, 0, 3);
        ugButton.setOnAction(e -> {
            uNum = sceneSwitch(ugInput, ugInput.getText());
            ugInput.clear();
            if(uNum >= 0) {
                switch (choice) {
                    case 1:
                        resCheck = num1 + num2;
                        if (uNum == resCheck) {
                            menuAlert.display("Correct!", ugInput.getText(), resCheck, 2);

                            window.setScene(menuScene);
                        }
                        else{
                            menuAlert.display("Incorrect Answer", ugInput.getText(), resCheck, 1);
                            window.setScene(menuScene);
                        }
                        break;
                    case 2:
                        resCheck = num1 - num2;
                        if (uNum == resCheck) {
                            menuAlert.display("Correct!", ugInput.getText(), resCheck, 2);

                            window.setScene(menuScene);
                        }
                        else{
                            menuAlert.display("Incorrect Answer", ugInput.getText(), resCheck, 1);
                            window.setScene(menuScene);
                        }
                        break;
                    case 3:
                        resCheck = num1 * num2;
                        if (uNum == resCheck) {
                            menuAlert.display("Correct!", ugInput.getText(), resCheck, 2);

                            window.setScene(menuScene);
                        }
                        else{
                            menuAlert.display("Incorrect Answer", ugInput.getText(), resCheck, 1);
                            window.setScene(menuScene);
                        }
                        break;
                    case 4:
                        resCheck = (int) (num1 / num2);
                        if (uNum == resCheck) {
                            menuAlert.display("Correct!", ugInput.getText(), resCheck, 2);

                            window.setScene(menuScene);
                        }
                        else{
                            menuAlert.display("Incorrect Answer", ugInput.getText(), resCheck, 1);
                            window.setScene(menuScene);
                        }
                        break;
                }
            }
        });

        Button ugBackBtn = new Button("Go Back");
        GridPane.setConstraints(ugBackBtn, 1, 3);
        ugBackBtn.setOnAction(e -> window.setScene(menuScene));

        userGrid.getChildren().addAll(ugLabel1, ugInput, ugButton, ugBackBtn);
        userScene = new Scene(userGrid, 320, 250);

        //Button 1
        Label mgLabel1 = new Label("Hello!");
        GridPane.setConstraints(mgLabel1, 0, 0);

        Label mgLabel2 = new Label("Would you like to practice some math today?");
        GridPane.setConstraints(mgLabel2, 0, 1);

        Label mgLabel3 = new Label("Select one of the following modes:");
        GridPane.setConstraints(mgLabel3, 0, 2);

        Button addButton = new Button("Addition");
        GridPane.setConstraints(addButton, 0, 3);
        addButton.setOnAction(e -> {
            num1 = (int) (Math.random() * 101);
            num2 = (int) (Math.random() * 101);
            choice = 1;
            ugLabel1.setText("What is " + num1 + " + " + num2 + " ?");
            window.setScene(userScene);
        });

        Button subButton = new Button("Subtraction");
        GridPane.setConstraints(subButton, 0, 4);
        subButton.setOnAction(e -> {
            num1 = (int) (Math.random() * 51);
            num2 = (int) (Math.random() * 51);
            choice = 2;
            tmpnum = num1;

            if( num2 > num1 ){
                num1 = num2;
                num2 = tmpnum;
            }

            ugLabel1.setText("What is " + num1 + " - " + num2 + " ?");
            window.setScene(userScene);
        });

        Button mulButton = new Button("Multiplication");
        GridPane.setConstraints(mulButton, 0, 5);
        mulButton.setOnAction(e -> {
            num1 = (int) (Math.random() * 13);
            num2 = (int) (Math.random() * 13);
            tmpnum = num1;
            choice = 3;
            if( num2 > num1 ){
                num1 = num2;
                num2 = tmpnum;
            }
            ugLabel1.setText("What is " + num1 + " times " + num2 + " ?");
            window.setScene(userScene);

        });

        Button divButton = new Button("Division");
        GridPane.setConstraints(divButton, 0, 6);
        divButton.setOnAction(e -> {
            num1 = (int) (Math.random() * 89) + 12;
            num2 = (int) (Math.random() * 13);
            tmpnum = num1;
            choice = 4;
            if( num2 > num1 ){
                num1 = num2;
                num2 = tmpnum;
            }
            ugLabel1.setText("What is the quotient of " + num1 + " divided by " + num2 + " ?");
            window.setScene(userScene);

        });

        menuGrid.getChildren().addAll(mgLabel1, mgLabel2, mgLabel3, addButton, subButton, mulButton, divButton);
        menuScene = new Scene(menuGrid, 320, 250);

        //Display scene 1 at first
        window.setScene(menuScene);
        window.setTitle("Random Math Problem Generator");
        window.show();

    }

    public static int sceneSwitch(TextField input, String inNum) {
        try {
            String txt = input.getText();
            int num = Integer.parseInt(txt.trim());
            return num;
        } catch (NumberFormatException e) {
            menuAlert.display("Invalid Input", inNum, 0, 0);
            return -172231;
        }
    }
}
