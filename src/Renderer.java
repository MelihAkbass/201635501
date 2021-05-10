
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.ListCellRenderer;
import javax.swing.JList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Renderer extends DefaultListCellRenderer implements ListCellRenderer<Object>
{

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        //return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
    
        //Value assignment
         MenuModel is = (MenuModel) value;
         setText(is.getName()+"\n ("+is.getDescription()+") -"+ String.valueOf(is.getPrice())+" TRY.");
         setIcon((Icon) is.getImg());
         
         if(isSelected)
         {
             setBackground(list.getSelectionBackground());
             setForeground(list.getSelectionForeground());
         } else
         {
             setBackground(list.getBackground());
             setForeground(list.getForeground());
         }
         setEnabled(true);
         setFont(list.getFont());
         
         return this;
    }
    
    
}
