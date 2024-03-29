package neo.neobis_auth_project.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import neo.neobis_auth_project.validations.EmailValidation;
import neo.neobis_auth_project.validations.PasswordValidation;

@Builder
@Getter
@Setter
@NoArgsConstructor
public class SignUpRequest {
    @EmailValidation
    private String email;
    @PasswordValidation
    private String password;
    private String verifyPassword;

    public SignUpRequest(String email, String password, String verifyPassword) {
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }
}
