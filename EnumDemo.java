import javax.swing.JOptionPane;
public class EnumDemo {
    public enum AccountType {December, January, Febuary, March, April, June, July, August, September, November, October, May}
    public static void main(String[] args) {
         AccountType[] choices = {AccountType.December, AccountType.January, AccountType.Febuary, AccountType.March, 
	 AccountType.April, AccountType.June, AccountType.July, AccountType.August, AccountType.September, AccountType.November, AccountType.October, AccountType.May};       
         while(true) {
             AccountType select = (AccountType) JOptionPane.showInputDialog(
             null, "Enter the month.", "Account Type",
             JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
         switch (select) {
         case December:
         JOptionPane.showMessageDialog(null, "Do you want to build a snow man ");
         break;
         case January:
         JOptionPane.showMessageDialog(null, "Do you want to build a snow man ");
         break;
         case Febuary:
         JOptionPane.showMessageDialog(null, "Do you want to build a snow man ");
         break;
         case March:
         JOptionPane.showMessageDialog(null, "Happy Spring days!");
         break;
         case April:
         JOptionPane.showMessageDialog(null, "Happy Spring days!");
         break;
         case May:
         JOptionPane.showMessageDialog(null, "Happy Spring days!");
         break;
         case June:
         JOptionPane.showMessageDialog(null, "It’s a summer time.");
         break;
         case July:
         JOptionPane.showMessageDialog(null, "It’s a summer time.");
         break;
         case August:
         JOptionPane.showMessageDialog(null, "It’s a summer time.");
         break;
         case November:
         JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
         break;
         case September:
         JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
         break;
         case October:
         JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");       	
            }
        }
    }
}
