package co.develhope.loginSystem.auth.entities;

public class RequestPasswordDTO {

    private String email;

    public RequestPasswordDTO() {}
    public RequestPasswordDTO(String email) {
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
