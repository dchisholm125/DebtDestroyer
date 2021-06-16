package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.input.DataFormat;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.input.InputEvent;

import java.util.ArrayList;

public class Main extends Application {

    ArrayList<UserDebt> debts = new ArrayList<UserDebt>();

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10); //gap between inline elements of the grid
        grid.setVgap(10); //gap between elements in a column of the grid
        grid.setPadding(new Insets(25, 25, 25, 25)); //padding between each element's content: top, right, bottom, left

        Text scenetitle = new Text("Let's Add your debts!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1); //positioning within grid, starting at: column 0, row 0,
        // spanning to column 2, row 1

        Label debtNameLabel = new Label("Debt Name:");
        grid.add(debtNameLabel, 0, 1); //inline element starting at column 0 ending at column 1

        TextField debtNameField = new TextField();
        grid.add(debtNameField, 1, 1);

        Label balanceLabel = new Label("Debt Balance:");
        grid.add(balanceLabel, 0, 2);

        TextField balanceBox = new TextField();
        grid.add(balanceBox, 1, 2);

        Button btn = new Button("Add debt"); //button instantiation with String that displays to UI
        HBox hbBtn = new HBox(10); //parent object is a pane, and can have children such as 'btn'
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT); //position within scene
        hbBtn.getChildren().add(btn);//add button to parent
        grid.add(hbBtn, 1, 4); //add parent to grid

        Button doneBtn = new Button("All done!"); //button instantiation with String that displays to UI
        HBox doneHbBtn = new HBox(10); //parent object is a pane, and can have children such as 'btn'
        doneHbBtn.setAlignment(Pos.BOTTOM_RIGHT); //position within scene
        doneHbBtn.getChildren().add(doneBtn);//add button to parent
        grid.add(doneHbBtn, 1, 5); //add parent to grid

        final Text btnActiontarget = new Text();
        grid.add(btnActiontarget, 1, 6);
        final Text doneBtnActiontarget = new Text();
        grid.add(doneBtnActiontarget, 1, 7);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                btnActiontarget.setFill(Color.FIREBRICK);
                btnActiontarget.setText("Debt added.");
                String debtName = debtNameField.getCharacters().toString();
                double debtBalance = Double.parseDouble(balanceBox.getCharacters().toString());

                debts.add(new UserDebt(debtName, debtBalance));

                System.out.println(debtName + " + " + debtBalance + " = " + debts.get(0).name);
            }
        });

        doneBtn.setOnAction(new EventHandler<ActionEvent>()  {

            @Override
            public void handle(ActionEvent e) {
                doneBtnActiontarget.setFill(Color.GREEN);
                doneBtnActiontarget.setText("Let's get destroyin'!");
            }
        });

//        Group root = new Group();
        Scene scene = new Scene(grid, 500, 500, Color.LIGHTGRAY); //define the scene to be shown on the Stage object
//        Rectangle r = new Rectangle(50, 50, 450, 450);
//        r.setFill(Color.BLUE);
//        root.getChildren().add(r);

//        TranslateTransition translate =
//                new TranslateTransition(Duration.millis(750));
//        translate.setToX(390);
//        translate.setToY(390);
//
//        FillTransition fill = new FillTransition(Duration.millis(750));
//        fill.setToValue(Color.RED);
//
//        RotateTransition rotate = new RotateTransition(Duration.millis(750));
//        rotate.setToAngle(360);
//
//        ScaleTransition scale = new ScaleTransition(Duration.millis(750));
//        scale.setToX(0.1);
//        scale.setToY(0.1);
//
//        ParallelTransition transition = new ParallelTransition(r,
//                translate, fill, rotate, scale);
//        transition.setCycleCount(Timeline.INDEFINITE);
//        transition.setAutoReverse(true);
//        transition.play();

        Scene currentScene = scene;

        stage.setTitle("JavaFX Scene Graph Demo");
        stage.setScene(currentScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
