/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingautopilotbean;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;

/**
 *
 * @author USER
 */
public class AutoPilot extends JPanel implements ISwitchAP {
    JLabel apLabel = new JLabel("AutoPilot");
JRadioButton jRadioButton1 = new JRadioButton();
    JRadioButton jRadioButton2 = new JRadioButton();
    ButtonGroup butGrp = new ButtonGroup();
    String t1 = "on", t2 = "off";
    String currentSetting = "";
    
    private static AutoPilot ap=null;
   private AutoPilot()
   {
   this.setLayout(new FlowLayout());

        jRadioButton1.setFont(new Font("Arial", Font.BOLD, 16));
        jRadioButton2.setFont(new Font("Arial", Font.BOLD, 16));
        jRadioButton1.setText(t1);
        jRadioButton2.setText(t2);
        butGrp.add(jRadioButton1);
        butGrp.add(jRadioButton2);
        this.add(apLabel, BorderLayout.NORTH);
        this.add(jRadioButton1);
        this.add(jRadioButton2);
        this.setBorder(new BevelBorder(BevelBorder.RAISED));
   
   }
public static AutoPilot getInstance()
{
    if(ap==null)
    {
    ap= new AutoPilot();
    }

    return ap;
}
public void ActivateCommands(APController apc)
{
jRadioButton1.addActionListener(apc);
jRadioButton2.addActionListener(apc);

}
// @Override
    public void isAutoPilot(String onOff) {
       boolean isOn=false;
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   //return isOn;
    }
    
     public void buttonClicked(ActionEvent e) {
        setSetting(((JRadioButton) e.getSource()).getText());
    }

    public String getSetting() {
        return currentSetting;
    }

    public void setSetting(String s) {
        if (!currentSetting.equals(s)) {
            toggleSelected(s);  // set appropriate button to selected
            settingChanged(s); // fire event and change "currentSetting"
        }
    }

    
    private void toggleSelected(String s) {
        if (t1.equals(s)) {
            jRadioButton1.setSelected(true);
        } else if (t2.equals(s)) {
            jRadioButton2.setSelected(true);
        }
    }

    private void settingChanged(String newSetting) {
        // the firePropertyChange method is inherited from JPanel
        firePropertyChange("setting", currentSetting, newSetting);
        currentSetting = newSetting;
    }

    public void setText1(String t1) {
        this.t1 = t1;
        jRadioButton1.setText(t1);
        toggleSelected(currentSetting); // set appropriate button to selected

    }

    public String getText1() {
        return t1;
    }

    public void setText2(String t2) {
        this.t2 = t2;
        jRadioButton2.setText(t2);
        toggleSelected(currentSetting); // set appropriate button to selected
    }

    public String getText2() {
        return t2;
    }

//    @Override
//    public void setValue(int value) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void setTimeValue(long[] t) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
}
