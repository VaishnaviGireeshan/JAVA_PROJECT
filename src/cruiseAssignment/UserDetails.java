package cruiseAssignment;

public interface UserDetails {
    void signUp();
    void logIn() throws CredentialException;
    void upadteUserDetails();
}
