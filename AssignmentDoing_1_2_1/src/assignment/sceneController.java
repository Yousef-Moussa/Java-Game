
package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class sceneController {
protected Stage stage; 

@FXML
protected TextField nameField;
@FXML
protected PasswordField passwordField;
@FXML
protected Button registerButton;

@FXML
protected TextField logName;
@FXML
protected PasswordField logPassword;
@FXML
protected Button logButton;
@FXML
protected Button stage_1,stage_2 ,stage_3,stage_4,tutorial,settings;

@FXML
 private Rectangle myRect;
@FXML
private double x;
private double y;


@FXML
private Hyperlink link1,link;




    
    public void mainPage(ActionEvent event) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("mainPage.fxml")); 
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();

    }
    public void menu(ActionEvent event) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("menu.fxml")); 
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();

    }
    public void loginScene(ActionEvent event) throws Exception{
    
    Parent root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
    }
    public void registerationScene(ActionEvent event) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("registerationPage.fxml"));
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
    }
    
    

    public void register(ActionEvent e) throws IOException,Exception{
    
    

    if (e.getSource()==registerButton){
     
     String name = nameField.getText();
     String password = passwordField.getText();
     
    File f = new File("C:\\Users\\12111\\Documents\\NetBeansProjects\\AssignmentDoing_1_2_1\\src\\assignment\\RegAndLogin.txt");
    if (!f.exists()){
    FileWriter write = new FileWriter("C:\\Users\\12111\\Documents\\NetBeansProjects\\AssignmentDoing_1_2_1\\src\\assignment\\RegAndLogin.txt");
    write.write("\r"+name+"-"+password+"\n");
    write.close();
    }
    else{
    FileWriter write = new FileWriter(f,true); 
    write.write("\r"+name+"-"+password+"\n");
    write.close();
    }
    nameField.clear();
    passwordField.clear();
    
    // going back to main page
    Parent root = FXMLLoader.load(getClass().getResource("mainPage.fxml")); 
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)e.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
    }

    }
    
    public void login(ActionEvent e) throws Exception{
    
            
        
        if(e.getSource()==logButton){
        String userLogin = logName.getText();
        String userPassword = logPassword.getText();
            
        BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\12111\\Documents\\NetBeansProjects\\AssignmentDoing_1_2_1\\src\\assignment\\RegAndLogin.txt")));
        
        for(String line = br.readLine(); line !=null ; line = br.readLine()){
            String array[] = line.split("-");
            if (array[0].equals(userLogin) && array[1].equals(userPassword)){
                System.out.println("login successful");
                
                try{
                    
                Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
                String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
                stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                scene.getStylesheets().add(css);
                stage.setScene(scene);
                stage.show();
                }
                catch(Exception ee){
                ee.printStackTrace();
                }
                                                                                          }
                                                                            }
                                    }

                                                       }
    public void stage1(ActionEvent event) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("stage1.fxml"));
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
    
    
    
    
    }
    public void stage2(ActionEvent event) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("stage2.fxml"));
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
    
    
  
    }
    public void stage3(ActionEvent event) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("stage3.fxml"));
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
    }
    public void stage4(ActionEvent event) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("stage4.fxml"));
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
    }
    public void tutorial(ActionEvent event) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("tutorial.fxml"));
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
    }
    public void fullScreenMenu(ActionEvent event)throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
    stage.setFullScreen(true);
    stage.setResizable(true);
    
    }
    public void fullScreenStage1(ActionEvent event)throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("stage1.fxml"));
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
    stage.setFullScreen(true);
    stage.setResizable(true);
    
    }
    public void settings(ActionEvent event) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("settings.fxml"));
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
    }
    
    public void exit(ActionEvent event)throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("settings.fxml"));
    String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    stage.setScene(scene);
    stage.show();
    stage.close();
    
    }
    
    
    public void restartStage1(ActionEvent event) throws Exception{
    
        
     Parent root = FXMLLoader.load(getClass().getResource("stage1.fxml"));
     String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
     Scene scene = new Scene(root);
     scene.getStylesheets().add(css);
     stage.setScene(scene);
     stage.show();
    
    }
    
    
@FXML
private Line line1,line2,line3,line4,line5,line6,line7,line8,line9
        ,line10,line11,line12,line13,line14,line15,line16,line17,line18,line19,line20
        ,line21,line22,line23,line24,line25,line26,line27,line28,line29,line30,line31
        ,line32,line33,line34,line35,line36,line37,line38,line39,line40,line41,line42,line43,line44,line45,line46
        ,line47,line48,line49,line50,line51,line52,line53,line54,line55,line56,line57,line58,line59,line60,line61,line62; 
  public void lines() throws Exception{
      line1.setStartX(-167.53338623046875);  line2.setStartX(-9.5333251953125);
        line1.setStartY(-22.99999237060547); line2.setStartY(27.800018310546875);
        line1.setEndX(-169.3333740234375);   line2.setEndX(-212.53338623046875);
        line1.setEndY(140.80001831054688); line2.setEndY(27.800018310546875);
        
        
        line3.setStartX(-190.33334350585938);
        line3.setStartY(27.800018310546875);
        line3.setEndX(-212.53338623046875);
        line3.setEndY(27.800018310546875);
        
        line4.setStartX(-167.53338623046875);
        line4.setStartY(-7.8000030517578125);
        line4.setEndX(-168.53341674804688);
        line4.setEndY(89.80001831054688);
       
        line5.setStartX(-167.53334045410156);
        line5.setStartY(7.62939453125E-6);
        line5.setEndX(-167.53335571289062);
        line5.setEndY(27.800018310546875);
       
        line6.setStartX(-190.33334350585938);
        line6.setStartY(27.800018310546875);
        line6.setEndX(-212.53338623046875);
        line6.setEndY(27.800018310546875);
     
        line7.setStartX(-167.53334045410156);
        line7.setStartY(7.62939453125E-6);
        line7.setEndX(-167.53335571289062);
        line7.setEndY(27.800018310546875);
       
        line8.setStartX(-190.33334350585938);
        line8.setStartY(27.800018310546875);
        line8.setEndX(-223.33331298828125);
        line8.setEndY(27.800018310546875);
       
        line9.setStartX(-9.5333251953125);
        line9.setStartY(27.800018310546875);
        line9.setEndX(-212.53338623046875);
        line9.setEndY(27.800018310546875);
        
        line10.setStartX(-167.53338623046875);
        line10.setStartY(-7.8000030517578125);
        line10.setEndX(-168.53341674804688);
        line10.setEndY(89.80001831054688);
        
        line11.setStartX(-167.53334045410156);
        line11.setStartY(7.62939453125E-6);
        line11.setEndX(-167.53335571289062);
        line11.setEndY(27.800018310546875);
        
        line12.setStartX(-190.33334350585938);
        line12.setStartY(27.800018310546875);
        line12.setEndX(-223.33331298828125);
        line12.setEndY(27.800018310546875);
        
        line13.setStartX(-166.33331298828125);
        line13.setStartY(-1.199981689453125);
        line13.setEndX(-166.33331298828125);
        line13.setEndY(37.800018310546875);
        
        line14.setStartX(-167.53334045410156);
        line14.setStartY(7.62939453125E-6);
        line14.setEndX(-167.53335571289062);
        line14.setEndY(27.800018310546875);
        
        line15.setStartX(-104.26666259765625);
        line15.setStartY(27.800018310546875);
        line15.setEndX(-200.26666259765625);
        line15.setEndY(27.800018310546875);

        line16.setStartX(-104.26666259765625);
        line16.setStartY(27.800018310546875);
        line16.setEndX(-212.53338623046875);
        line16.setEndY(27.800018310546875);
        
        line17.setStartX(-166.33331298828125);
        line17.setStartY(-7.199981689453125);
        line17.setEndX(-166.33331298828125);
        line17.setEndY(37.800018310546875);
        
        line18.setStartX(-139.86663818359375);
        line18.setStartY(7.5999755859375);
        line18.setEndX(-139.86663818359375);
        line18.setEndY(75.6666259765625);
        
        line19.setStartX(-83.73333740234375);
        line19.setStartY(-3.3333740234375);
        line19.setEndX(-122.86663818359375);
        line19.setEndY(-3.3333740234375);
        
        line20.setStartX(-176.33331298828125);
        line20.setStartY(29.800048828125);
        line20.setEndX(-215.20001220703125);
        line20.setEndY(29.800048828125);
        
        line21.setStartX(-131.86663818359375);
        line21.setStartY(36.5999755859375);
        line21.setEndX(-131.86663818359375);
        line21.setEndY(0.800018310546875);

        line22.setStartX(-143.86663818359375);
        line22.setStartY(21.5999755859375);
        line22.setEndX(-185.20001220703125);
        line22.setEndY(21.5999755859375);
        
        line23.setStartX(-110);
        line23.setStartY(-11.199951171875);
        line23.setEndX(-139.86663818359375);
        line23.setEndY(-11.199951171875);  
        
        line24.setStartX(-235.6666717529297);
        line24.setStartY(7.62939453125E-6);
        line24.setEndX(108.86666870117188);
        line24.setEndY(7.62939453125E-6);  
                
        line25.setStartX(-235.6666717529297);
        line25.setStartY(7.62939453125E-6);
        line25.setEndX(145.00003051757812);
        line25.setEndY(-3.0517578125E-5);  
                
        line26.setStartX(-368.53338623046875);
        line26.setStartY(-15.199981689453125);
        line26.setEndX(-368.53338623046875);
        line26.setEndY(109.20001220703125);  
                
        line27.setStartX(-203.79998779296875);
        line27.setStartY(7.62939453125E-6);
        line27.setEndX(189.79998779296875);
        line27.setEndY(7.62939453125E-6);  
                
        line28.setStartX(-235.6666717529297);
        line28.setStartY(7.62939453125E-6);
        line28.setEndX(119.79998779296875);
        line28.setEndY(0);  

        line29.setStartX(-143.86663818359375);
        line29.setStartY(21.5999755859375);
        line29.setEndX(-185.20001220703125);
        line29.setEndY(21.5999755859375);  
        
        line30.setStartX(-9.5333251953125);
        line30.setStartY(27.800018310546875);
        line30.setEndX(-89.70489501953125);
        line30.setEndY(27.800018310546875); 
        
        line31.setStartX(-167.53334045410156);
        line31.setStartY(7.62939453125E-6);
        line31.setEndX(-167.5333251953125);
        line31.setEndY(69.39999389648438); 
        
        line32.setStartX(-167.53334045410156);
        line32.setStartY(7.62939453125E-6);
        line32.setEndX(-167.5333251953125);
        line32.setEndY(69.39999389648438); 
        
        line33.setStartX(-167.53334045410156);
        line33.setStartY(7.62939453125E-6);
        line33.setEndX(-167.5333251953125);
        line33.setEndY(69.39999389648438); 
        
        line34.setStartX(-167.53334045410156);
        line34.setStartY(7.62939453125E-6);
        line34.setEndX(-167.5333251953125);
        line34.setEndY(93.79998779296875); 
        
        line35.setStartX(-9.5333251953125);
        line35.setStartY(27.800018310546875);
        line35.setEndX(-126.70491027832031);
        line35.setEndY(27.800018310546875); 
        
        line36.setStartX(-73.00001525878906);
        line36.setStartY(40.20001220703125);
        line36.setEndX(-73);
        line36.setEndY(-19); 
        
        line37.setStartX(-167.53334045410156);
        line37.setStartY(7.62939453125E-6);
        line37.setEndX(-167.53335571289062);
        line37.setEndY(27.800018310546875); 
        
        line38.setStartX(-167.53334045410156);
        line38.setStartY(7.62939453125E-6);
        line38.setEndX(-167.53335571289062);
        line38.setEndY(27.800018310546875); 
        
        line39.setStartX(-167.53334045410156);
        line39.setStartY(7.62939453125E-6);
        line39.setEndX(-167.5333251953125);
        line39.setEndY(69.39999389648438); 

        line40.setStartX(-182.5999755859375);
        line40.setStartY(27.800018310546875);
        line40.setEndX(-212.53338623046875);
        line40.setEndY(27.800018310546875); 

        line41.setStartX(-182.5999755859375);
        line41.setStartY(27.800018310546875);
        line41.setEndX(-212.53338623046875);
        line41.setEndY(27.800018310546875); 
        
   Shape lines[] = new Shape[41]; // change the number of shapes as you increase the lines
   lines[0] = line1;lines[1] = line2;lines[2] = line3;lines[3] = line4;lines[4] = line5;
   lines[5] = line6;lines[6] = line7;lines[7] = line8;lines[8] = line9;lines[9] = line10;
   lines[10] = line11;lines[11] = line12;lines[12] = line13;lines[13] = line14;lines[14] = line15;
   lines[15] = line16;lines[16] = line17;lines[17] = line18;lines[18] = line19;
   lines[19] = line20;
   lines[20] = line21;
   lines[21] = line22;
   lines[22] = line23;
   lines[23] = line24;
   lines[24] = line25;
   lines[25] = line26;
   lines[26] = line27;
   lines[27] = line28;
   lines[28] = line29;
   lines[29] = line30;
   lines[30] = line31;
   lines[31] = line32;
   lines[32] = line33;
   lines[33] = line34;
   lines[34] = line35;
   lines[35] = line36;
   lines[36] = line37;
   lines[37] = line38;
   lines[38] = line39;
   lines[39] = line40;
   lines[40] = line41;
   
    for  (int i =0 ; i<lines.length;i++){
    if(lines[28].getBoundsInParent().intersects(myRect.getBoundsInParent())){
         System.out.println("intersection");
         
         link.fire();
         break;
         
     }
    else if(lines[i].getBoundsInParent().intersects(myRect.getBoundsInParent())){
         System.out.println("intersection");
         
         link1.fire();
         break;
         
     }
    
    
         
    }
    
   
  }

    
    

 
 
 public void movement(KeyEvent e) throws Exception{
     
     KeyCode code = e.getCode();
     
     if(code == KeyCode.UP){
         System.out.println("up");
         y= myRect.getLayoutY();
        myRect.setLayoutY(y=y-2);
        lines();

        
     }
     if(code == KeyCode.DOWN){
         System.out.println("DOWN");

         y= myRect.getLayoutY();
        myRect.setLayoutY(y=y+2);
        lines();
     }
     if(code == KeyCode.LEFT){
         System.out.println("LEFT");

         x= myRect.getLayoutX();
        myRect.setLayoutX(x=x-2);
        lines();
     }
     if(code == KeyCode.RIGHT){
         System.out.println("RIGHT");

         x= myRect.getLayoutX();
        myRect.setLayoutX(x=x+2);
     lines();
     }
 }
                               }
