package com.viewnext.rest;

import org.springframework.http.HttpHeaders;

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
			title = "Prueba API REST + Swagger",
			description = "Our app is to list out users",
			termsOfService = "www.unprogramadornace.com/terminos_y_servicios",
			version = "1.0.0",
			contact = @Contact(
					name = "Samuel Trujillo",
					url = "www.unprogramadornace.com/contact",
					email = "samutrujillogomez.com"
			),
			license = @License(
					name = "Standar Software Use License for UnProgramadorNace",
					url = "www.unprogramadornace.com/license"
			)
		),
		servers = {
				@Server(
						description = "DEV SERVER",
						url = "http://localhost:8080"
				),
				@Server(
						description = "PROD SERVER",
						url = "http://unprogramadornace:8080"
				)
		}, 
		// Con Spring Security
		security = @SecurityRequirement(
				name = "Security Token"
		)
)
// Con Spring Security
@SecurityScheme(
		name = "Security Token",
		description = "Access Token For my API",
		type = SecuritySchemeType.HTTP,
		paramName = HttpHeaders.AUTHORIZATION,
		in = SecuritySchemeIn.HEADER,
		scheme = "bearer",
		bearerFormat = "JWT"
)
public class SwaggerConfig {}
