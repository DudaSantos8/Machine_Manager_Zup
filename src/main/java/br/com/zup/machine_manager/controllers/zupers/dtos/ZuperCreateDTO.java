package br.com.zup.machine_manager.controllers.zupers.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

public class ZuperCreateDTO {

    @NotNull(message = "Campo nome precisa ser preenchido")
    @NotBlank(message = "Campo nome precisa ser preenchido")
    @Size(min = 5, message = "Precisa ser maior que 5")
    @Pattern(regexp = "[A-Za-z]+\\s[A-Za-z]+", message = "Precisa conter nome e sobrenome")
    private String name;

    @NotNull(message = "Campo endereço precisa ser preenchido")
    @NotBlank(message = "Campo endereço precisa ser preenchido")
    private String address;

    @NotNull(message = "Campo de codigo postal precisa ser preenchido")
    @NotBlank(message = "Campo de codigo postal precisa ser preenchido")
    @CPF(message = "Formato inválido")
    private String postalCode;

    public ZuperCreateDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
