package com.springboot.booknetwork.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "AHMED_MOSAAD",
                        email = "ahmedelshalawy556@gmail.com"
                ),
                description = "OpenApi documentation for Spring Security",
                title = "OpenApi Specification - Ahmed_Mosaad",
                version = "1.0",
                license = @License(
                        name = "license name"
                ),
                termsOfService = "Terms of Service"
        ),
        servers = {
                @Server(
                        description = "local ENV",
                        url = "http://localhost:8088/api/v1"
                ),
                @Server(
                        description = "PROD ENV",
                        url = "https://aliboucoding.com/cources"
                )
        },
        security = {
                @SecurityRequirement(
                        name = "bearerAuth"
                )
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "Jwt Auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}