/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingautopilotbean;

import java.awt.Image;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 *
 * @author USER
 */
public class AutoPilotBeanBeanInfo extends SimpleBeanInfo {
    //
    Class beanClass= AutoPilotBean.class;
          //  Class apilotClass = AutoPilot.class;
            private Image getImage=loadImage("C:\\Users\\oskar\\Documents\\Advanced Programming\\coursework material\\APDashboardProject\\autopilot.gif");
            
    
    public AutoPilotBeanBeanInfo(){}
    
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor _text1 = new PropertyDescriptor("text1", beanClass, "getText1", "setText1");
           // _text1.setPropertyEditorClass(apilotClass);
            PropertyDescriptor _text2 = new PropertyDescriptor("text2", beanClass, "getText2", "setText2");
           // _text2.setPropertyEditorClass(apilotClass);
            PropertyDescriptor _setting = new PropertyDescriptor("setting", beanClass, "getSetting", "setSetting");
           // _setting.setPropertyEditorClass(apilotClass);
            PropertyDescriptor[] pds = new PropertyDescriptor[]{
                _text1,
                _text2,
                _setting};
            return pds;

        } catch (IntrospectionException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Image getIcon(int iconType)
    {
    
    
    return getImage;
    }
}
