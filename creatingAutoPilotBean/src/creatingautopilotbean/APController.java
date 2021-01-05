/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingautopilotbean;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USER
 */
public class APController implements ActionListener {
public AutoPilot autoPilot;

//private APModel performActions;
    APController(AutoPilot apb)
    {
    autoPilot=apb;
    //performActions=apm;
    }
   // @Override
    public void actionPerformed(ActionEvent ae) {
        autoPilot.buttonClicked(ae);
if (ae.getSource()==autoPilot.jRadioButton1){
autoPilot.isAutoPilot("on");

}
if(ae.getSource()==autoPilot.jRadioButton2)
    autoPilot.isAutoPilot("off");
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
