package uz.ahh.models;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Builder
public class AuthLogin {
    private String username;
    private String password;
    private String role;
}
