
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;

/**
 * Write a description of JavaFX class QuizApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuizApp extends Application
{
    int count = 0;
    Label myLabel1 = new Label("Hva er hovedstaden i:");
    Label myLabel2 = new Label("Danmark");
    Label myLabel3 = new Label("Brazil");
    Label myLabel4 = new Label("Finland");
    Label myLabel5 = new Label("Nigeria");
    Label myLabel6 = new Label("Rusland");
    Label myLabel7 = new Label("Gratulerer du er ferdig");
    Label myLabel8 = new Label("Du fikk " + count + " av 5 riktig");
    Label myLabel9 = new Label("Hva er hovedstaden i:");
    Label myLabel10 = new Label("Hva er hovedstaden i:");
    Label myLabel11 = new Label("Hva er hovedstaden i:");
    Label myLabel12 = new Label("Hva er hovedstaden i:");
    
    
    TextField textField1 = new TextField();
    TextField textField2 = new TextField();
    TextField textField3 = new TextField();
    TextField textField4 = new TextField();
    TextField textField5 = new TextField();
    

    @Override
    public void start(Stage stage) throws Exception
    {
        // Create a Button or any control item
        Button myButton = new Button("Svar");
        Button myButton2 = new Button("Svar");
        Button myButton3 = new Button("Svar");
        Button myButton4 = new Button("Svar");
        Button myButton5 = new Button("Svar");

        // Create a new grid pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setStyle("-fx-background-color: #E5E7E9");
        pane.setMinSize(300, 300);
        pane.setVgap(10);
        pane.setHgap(10);
        
        GridPane pane2 = new GridPane();
        pane2.setPadding(new Insets(10, 10, 10, 10));
        pane2.setStyle("-fx-background-color: #E5E7E9");
        pane2.setMinSize(300, 300);
        pane2.setVgap(10);
        pane2.setHgap(10);
        
        GridPane pane3 = new GridPane();
        pane3.setPadding(new Insets(10, 10, 10, 10));
        pane3.setStyle("-fx-background-color: #E5E7E9");
        pane3.setMinSize(300, 300);
        pane3.setVgap(10);
        pane3.setHgap(10);
        
        GridPane pane4 = new GridPane();
        pane4.setPadding(new Insets(10, 10, 10, 10));
        pane4.setStyle("-fx-background-color: #E5E7E9");
        pane4.setMinSize(300, 300);
        pane4.setVgap(10);
        pane4.setHgap(10);
        
        GridPane pane5 = new GridPane();
        pane5.setPadding(new Insets(10, 10, 10, 10));
        pane5.setStyle("-fx-background-color: #E5E7E9");
        pane5.setMinSize(300, 300);
        pane5.setVgap(10);
        pane5.setHgap(10);
        
        GridPane pane6 = new GridPane();
        pane6.setPadding(new Insets(10, 10, 10, 10));
        pane6.setStyle("-fx-background-color: #E5E7E9");
        pane6.setMinSize(300, 300);
        pane6.setVgap(10);
        pane6.setHgap(10);

        //set an action on the button using method reference
        

        Image image1 = new Image("bilder/danmark.jpg");
        ImageView view1 = new ImageView(image1);
        view1.setImage(image1);
        view1.setFitWidth(400);
        view1.setFitHeight(400);

        Image image2 = new Image("bilder/brazil.jpg");
        ImageView view2 = new ImageView(image2);
        view2.setImage(image2);
        view2.setFitWidth(400);
        view2.setFitHeight(400);

        
        Image image3 = new Image("bilder/Finland.jpg");
        ImageView view3 = new ImageView(image3);
        view3.setImage(image3);
        view3.setFitWidth(400);
        view3.setFitHeight(400);

        Image image4 = new Image("bilder/Nigeria.jpg");
        ImageView view4 = new ImageView(image4);
        view4.setImage(image4);
        view4.setFitWidth(400);
        view4.setFitHeight(400);

        Image image5 = new Image("bilder/Russland.jpg");
        ImageView view5 = new ImageView(image5);
        view5.setImage(image5);
        view5.setFitWidth(400);
        view5.setFitHeight(400);
        

        // Add the button and label into the pane
        
        pane.add(myLabel1, 0, 0);
        pane.add(myLabel2, 0, 1);
        pane.add(myButton, 2, 3);
        pane.add(textField1, 0, 3);
        pane.add(view1,0,2);
        
        pane2.add(myLabel9, 0, 0);
        pane2.add(myLabel3, 0, 1);
        pane2.add(myButton2, 2, 3);
        pane2.add(textField2, 0, 3);       
        pane2.add(view2,0,2);
        
        pane3.add(myLabel10, 0, 0);
        pane3.add(myLabel4, 0, 1);
        pane3.add(myButton3, 2, 3);
        pane3.add(textField3, 0, 3);
        pane3.add(view3,0,2);
        
        pane4.add(myLabel11, 0, 0);
        pane4.add(myLabel5, 0, 1);
        pane4.add(myButton4, 2, 3);
        pane4.add(textField4, 0, 3);
        pane4.add(view4,0,2);
        
        pane5.add(myLabel12, 0, 0);
        pane5.add(myLabel6, 0, 1);
        pane5.add(myButton5, 2, 3);
        pane5.add(textField5, 0, 3);
        pane5.add(view5,0,2);
        
        pane6.add(myLabel7, 0, 0);
        pane6.add(myLabel8, 0, 1);

        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene1 = new Scene(pane, 550, 550);
        stage.setTitle("Hovedstad Quiz");
        stage.setScene(scene1);
        
        Scene scene2 = new Scene(pane2, 550, 550);
        stage.setTitle("Hovedstad Quiz");
        stage.setScene(scene2);

        Scene scene3 = new Scene(pane3, 550, 550);
        stage.setTitle("Hovedstad Quiz");
        stage.setScene(scene3);
        
        Scene scene4 = new Scene(pane4, 550, 550);
        stage.setTitle("Hovedstad Quiz");
        stage.setScene(scene4);
        
        Scene scene5 = new Scene(pane5, 550, 550);
        stage.setTitle("Hovedstad Quiz");
        stage.setScene(scene5);
        
        Scene scene6 = new Scene(pane6, 550, 550);
        stage.setTitle("Hovedstad Quiz");
        stage.setScene(scene6);
  
        // Show the Stage (window)
        stage.setScene(scene1);
        stage.show();
        
        myButton.setOnAction(e -> stage.setScene(scene2));
        myButton2.setOnAction(e -> stage.setScene(scene3));
        myButton3.setOnAction(e -> stage.setScene(scene4));
        myButton4.setOnAction(e -> stage.setScene(scene5));
        myButton5.setOnAction(e -> stage.setScene(scene6));
        textField1.setOnKeyPressed((event) -> 
        { if(event.getCode() == KeyCode.ENTER) 
          { 
                    
                    if(textField1.getText().toUpperCase().equals("KØBENHAVN"))
                    {
                        count++;
                    }
                    stage.setScene(scene2);
           }
            });
        textField2.setOnKeyPressed((event) -> 
        { if(event.getCode() == KeyCode.ENTER) 
          { 
                    stage.setScene(scene3);
           }
            });
        textField3.setOnKeyPressed((event) -> 
        { if(event.getCode() == KeyCode.ENTER) 
          { 
                    stage.setScene(scene4); 
           }
            });
        textField4.setOnKeyPressed((event) -> 
        { if(event.getCode() == KeyCode.ENTER) 
          { 
                    stage.setScene(scene5);
           }
            });
        textField5.setOnKeyPressed((event) -> 
        { if(event.getCode() == KeyCode.ENTER) 
          { 
                    stage.setScene(scene6); 
           }
            });

        
    }

    /**
     * This will be executed when the button is clicked
     * It increments the count by 1
     */
    private void buttonClick(ActionEvent event)
    {

    }
}
