package ua.microserviceslibrery.commonmodule.dto.user.request;

import lombok.Data;

@Data
public class AccountLoginRequest {

    private String login;
    private String password;
}
