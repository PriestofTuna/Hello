import javax.swing.JOptionPane;

public class Assignment3 {
	public enum AccountType {
		Admin, Student, Staff
	};
    //public static final int MAX_ITEMS = 0;
	public static void main(String[] args) {

		AccountType[] choices = { AccountType.Admin, AccountType.Staff, AccountType.Student };

		String TrueUser, TruePassword, password, TrueUserPass, user;
		TrueUser = ("name");
		TruePassword = ("password");
        
		TrueUserPass = (TrueUser + TruePassword);
		TrueUserPass.equals(AccountType.Admin);
		user = JOptionPane.showInputDialog("Input your Username");
        //while (TrueUserPass == (user + password) {
		//insert smart way of fixing things
		while (user != TrueUser) {
			user = JOptionPane.showInputDialog("Invalid Username");
			break;
		    }

			if (user.equals(TrueUser)) {

				password = JOptionPane.showInputDialog("Input your password");
				if (password.equals(TruePassword)) {

					AccountType select = (AccountType) JOptionPane.showInputDialog(null, "select your account.",
							"Account Type", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);

					//if (user + password == ("namepassword")) {

						switch (select) {
						case Admin:
							JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
							break;
						case Student:
							JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
							break;
						case Staff:
							JOptionPane.showMessageDialog(null,
									"Welcome Staff! You can update, read, add, delete file.");
							break;
						default:
							JOptionPane.showMessageDialog(null, "Enjoy your stay");
						}

					//}

				} else {
					password = JOptionPane.showInputDialog("Incorrect password, please Input your password");
				}
			} else {
				user = JOptionPane.showInputDialog("Invalid Username");

			}
		}
	}

