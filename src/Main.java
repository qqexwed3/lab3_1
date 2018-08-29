import javax.swing.*;

public class Main {
    public static void main(String[] args){
      //  String input = JOptionPane.showInputDialog("Enter Number","0");
      //  JOptionPane.showMessageDialog(null,input,"title",JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,"Love me"
                ,"Want a trip ?"
                , JOptionPane.YES_NO_OPTION);
        if(ans==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"OK 400 Baht");
        } else {
            JOptionPane.showMessageDialog(null,"Oh no!");
        }
    }
}

