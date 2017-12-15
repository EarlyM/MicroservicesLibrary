package ua.microserviceslibrery.commonmodule.dto.user.request;

import lombok.Data;

@Data
public class AccountRegistrationRequest extends AccountLoginRequest {

    private String name;
    private String lastname;
    private String email;
}
