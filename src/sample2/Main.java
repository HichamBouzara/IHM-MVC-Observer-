package sample2;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        SpinnerView view = new SpinnerView(primaryStage) ;
        Stage secStage = new Stage();
        InputView view2 = new InputView(secStage) ;
        Model model = new Model(0);
//un controleur pour une vue et un model
        SpinnerController controller=new SpinnerController(model,view, view2);
        InputController controller2 = new InputController(model, view2, view);
        controller.control();
        controller2.control();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

