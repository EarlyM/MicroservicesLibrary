package ua.microserviceslibrery.commonmodule.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Body<T> {

    private T data;
}
