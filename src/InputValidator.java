/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import javax.swing.JOptionPane;

public class InputValidator {
    
    

    // Validate that input is not null or empty
   public static boolean validateNotNullOrEmpty(String input) {
    return input != null && !input.trim().isEmpty();
}
  
    public static boolean validateLettersOnly(String input) {
    if (input == null || input.trim().isEmpty()) {
        return false;
    }
    return input.matches("[a-zA-Z ]+"); // Only letters and spaces
 }

    // Validate digits only 
    public static boolean validateDigitsOnly(String input) {
    if (input == null || input.trim().isEmpty()) {
        return false;
    }
    return input.matches("\\d+");
}

    // Validate email format
    public static boolean validateEmail(String email) {
    if (email == null || email.trim().isEmpty()) {
        return false;
    }
    // Simple email pattern
    return email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
}
    public static boolean validatePhoneNumber(String phone) {
    if (phone == null || phone.trim().isEmpty()) {
        return false;
    }
    return phone.matches("\\d+");
}
    

}

