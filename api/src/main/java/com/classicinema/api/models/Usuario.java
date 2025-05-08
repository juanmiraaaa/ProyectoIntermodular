package com.classicinema.api.models;

import jakarta.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @NotBlank(message = "El email es obligatorio")
    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @NotBlank(message = "La contraseña no puede estar vacía")
    @Column(nullable = false)
    private String password; // hash

    @Column(length = 12)
    @Pattern(regexp = "^\\+?[0-9]*$", message = "El teléfono debe ser válido")
    private String telefono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @Email @NotBlank(message = "El email es obligatorio") String getEmail() {
        return email;
    }

    public void setEmail(@Email @NotBlank(message = "El email es obligatorio") String email) {
        this.email = email;
    }

    public @NotBlank(message = "La contraseña no puede estar vacía") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "La contraseña no puede estar vacía") String password) {
        this.password = password;
    }

    public @Pattern(regexp = "^\\+?[0-9]*$", message = "El teléfono debe ser válido") String getTelefono() {
        return telefono;
    }

    public void setTelefono(@Pattern(regexp = "^\\+?[0-9]*$", message = "El teléfono debe ser válido") String telefono) {
        this.telefono = telefono;
    }
}
