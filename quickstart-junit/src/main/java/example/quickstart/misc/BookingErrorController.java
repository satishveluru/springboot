package example.quickstart.misc;

import javax.swing.JOptionPane;

import example.quickstart.service.impl.ErrorMessageDisplayer;

public class BookingErrorController implements ErrorMessageDisplayer{
	
	@Override
	public void showMessage(String title, String message, int messageType) {
		JOptionPane.showMessageDialog(null, message, title, messageType);
		
	}

	@Override
	public boolean showConfirmMessage(String title, String message) {
		int output = JOptionPane.showConfirmDialog(null,
				message,title, JOptionPane.YES_NO_OPTION);
		return output == JOptionPane.YES_OPTION;
	}

}
