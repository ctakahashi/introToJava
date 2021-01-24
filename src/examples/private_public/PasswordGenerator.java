package examples.private_public;

public class PasswordGenerator {
    private boolean isPasswordCreated = false;

    public void getPassword() {
        if (isPasswordCreated) {            
            return;
        } else {
            return ;
        }
    }

    private String createPassword() {
        isPasswordCreated = true;
        String pw = "secret";
        pw = pw.toUpperCase();
        pw = pw + "asdf";
        return "secret";
    }

    public String isPasswordCreatedResponse(String secretCode) {
        if (secretCode == "asdf") {
            if (isPasswordCreated) {
                return "YESS";
            } else {
                return "NAHH";
            }
        } else {
            return "";
        }
    }
}