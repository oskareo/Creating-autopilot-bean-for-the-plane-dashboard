/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingautopilotbean;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class AutoPilotBean extends JPanel {
    private static AutoPilotBean apbInstance=null;
    public AutoPilot ap;
    public APController apc;
    List<ISwitchAP> theView;
    
    public AutoPilotBean()
    {
   // ap= AutoPilot.
        ap= AutoPilot.getInstance();
    theView= new ArrayList<>();
    theView.add(ap);
    apc= new APController(ap);
    ap.ActivateCommands(apc);
    add(ap);
    
    }
    public static AutoPilotBean getInstance()
    
    {
    if(apbInstance==null)
    {
    apbInstance= new AutoPilotBean();
    }
    return apbInstance;
    }
}
