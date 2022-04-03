/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragrace;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Tag.H2;
import static javax.swing.text.html.HTML.Tag.H3;

/**
 * FXML Controller class
 *
 * @author daniy
 */
public class DragController implements Initializable 
{

        
    @FXML
    private JFXButton start;
    @FXML
    private JFXButton reset;
    @FXML
    private JFXButton quit;
    @FXML
    private ImageView car1;
    @FXML
    private ImageView car2;
    @FXML
    private ImageView car3;
    @FXML
    private ImageView car4;
    @FXML
    private ImageView car5;
        
        int Y1=433;
        int Y2=433;
        int Y3=433;
        int Y4=433;
        int Y5=433;        
        
	static boolean runRaceButtonIsPressed=false;
	static boolean resetRaceButtonIsPressed=false;
	static int winningCar=0;
	static boolean winner = false;
        
     /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
	public synchronized void finish(int i) throws IOException 
		{
                    
		//message.setVisible(true);
		//message.setText("Winning Car # " +winningCar);
                if (i==399)
		{
			winner=true;
			
		}    
                    
                    
                System.out.print("Finished");
                 System.out.println("Car # " +winningCar+"wins the race!! press reset race and run race to race again.");
               
                 JFrame f =new JFrame();  ;
                 JOptionPane.showMessageDialog(f,"Winner Car# " +winningCar );

               


	}
        
    @FXML
    private void startGame(ActionEvent event) 
    {
        				H1 h1 = new H1();
                                        h1.start();
					H2 h2 = new H2();
                                        h2.start();
					H3 h3 = new H3();
                                        h3.start();
					H4 h4 = new H4();
                                        h4.start();
					H5 h5 = new H5();
                                        h5.start();
                                        
    }

    @FXML
    private void resetGame(ActionEvent event) 
    {
        int Y=433;
    car1.relocate(337,Y );
    car2.relocate(425,Y );     
    car3.relocate(512,Y );    
    car4.relocate(597,Y );
    car5.relocate(683,Y );
    /*
            				H1 h1 = new H1();
                                        h1.start();
					H2 h2 = new H2();
                                        h2.start();
					H3 h3 = new H3();
                                        h3.start();
					H4 h4 = new H4();
                                        h4.start();
					H5 h5 = new H5();
                                        h5.start();
    */
    }

    @FXML
    private void quitGame(ActionEvent event) 
    {
     System.exit(0);
    }
    
class H1 extends Thread
{
    public void reset()
    {
    
    }
		public void run() 
                {
			for(int i=0; i<400; i++)
                        {

                            
				if(winner) 
                                {
                         		break;
				}
                                 car1.relocate(337,Y1 );
                                 Y1--;
                                 
                                 //System.out.println("Car index :" +car1.get +" "+ car1.getY() );
                             //   System.out.println("Y coordinate:"  + Y );                                 
	//			h1.repaint();
				if(i==399)
                                {
 					winningCar=1;
                                    try {
                                        finish(i);
                                    } catch (IOException ex) {
                                        Logger.getLogger(DragController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
				}
				
				try 
                                {
					Thread.sleep(Math.abs(UUID.randomUUID().getMostSignificantBits())%60);
				}
                                catch(InterruptedException err) 
                                {
					err.printStackTrace();
				}
                                
                                
			}
		}
	}
	
class H2 extends Thread
{
    public void reset()
    {
    
    }
				public void run() 
                {
			for(int i=0; i<400; i++)
                        {

                            
				if(winner) 
                                {
                         		break;
				}
                                 car2.relocate(425,Y2 );
                                 Y2--;
                                 
                                 //System.out.println("Car index :" +car1.get +" "+ car1.getY() );
                                //System.out.println("Y coordinate:"  + Y );                                 
	//			h1.repaint();
				if(i==399)
                                {
 					winningCar=2;
                                    try {
                                        finish(i);
                                    } catch (IOException ex) {
                                        Logger.getLogger(DragController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
				}
				
				try 
                                {
					Thread.sleep(Math.abs(UUID.randomUUID().getMostSignificantBits())%60);
				}
                                catch(InterruptedException err) 
                                {
					err.printStackTrace();
				}                     
                                
			}
		}
	}


class H3 extends Thread
{
    public void reset()
    {
    
    }
		public void run() 
                {
			for(int i=0; i<400; i++)
                        {

                            
				if(winner) 
                                {
                         		break;
				}
                                 car3.relocate(512,Y3 );
                                 Y3--;
                                 
                                 //System.out.println("Car index :" +car1.get +" "+ car1.getY() );
                                //System.out.println("Y coordinate:"  + Y );                                 
	//			h1.repaint();
				if(i==399)
                                {
 					winningCar=3;
                                    try {
                                        finish(i);
                                    } catch (IOException ex) {
                                        Logger.getLogger(DragController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
				}
				
				try 
                                {
					Thread.sleep(Math.abs(UUID.randomUUID().getMostSignificantBits())%60);
				}
                                catch(InterruptedException err) 
                                {
					err.printStackTrace();
				}                     
                                
			}
		}
	}

class H4 extends Thread
{
    public void reset()
    {
    
    }
		public void run() 
                {
			for(int i=0; i<400; i++)
                        {

                            
				if(winner) 
                                {
                         		break;
				}
                                 car4.relocate(597,Y4 );
                                 Y4--;
                                 
                                 //System.out.println("Car index :" +car1.get +" "+ car1.getY() );
                                //System.out.println("Y coordinate:"  + Y );                                 
	//			h1.repaint();
				if(i==399)
                                {
 					winningCar=4;
                                    try {
                                        finish(i);
                                    } catch (IOException ex) {
                                        Logger.getLogger(DragController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
				}
				
				try 
                                {
					Thread.sleep(Math.abs(UUID.randomUUID().getMostSignificantBits())%60);
				}
                                catch(InterruptedException err) 
                                {
					err.printStackTrace();
				}                     
                                
			}
		}
	}

class H5 extends Thread
{
    public void reset()
    {
    
    }
		public void run() 
                {
			for(int i=0; i<400; i++)
                        {

                            
				if(winner) 
                                {
                         		break;
				}
                                 car5.relocate(683,Y5 );
                                 Y5--;
                                 
                                 //System.out.println("Car index :" +car1.get +" "+ car1.getY() );
                                //System.out.println("Y coordinate:"  + Y );                                 
	//			h1.repaint();
				if(i==399)
                                {
 					winningCar=5;
                                    try {
                                        finish(i);
                                    } catch (IOException ex) {
                                        Logger.getLogger(DragController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
				}
				
				try 
                                {
					Thread.sleep(Math.abs(UUID.randomUUID().getMostSignificantBits())%60);
				}
                                catch(InterruptedException err) 
                                {
					err.printStackTrace();
				}                     
                                
			}
		}
	}


    
}