package example.quickstart.service.impl;

public interface ErrorMessageDisplayer {
   void showMessage(String title, String message, int messageType);
   boolean showConfirmMessage(String title, String message);
}
