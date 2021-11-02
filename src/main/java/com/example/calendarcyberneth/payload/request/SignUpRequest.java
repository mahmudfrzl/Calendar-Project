package com.example.calendarcyberneth.payload.request;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignUpRequest {
    private String name;
    private String email;
    private String password;
    private Set<String> role;

}
