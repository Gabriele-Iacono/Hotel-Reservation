package com.iacono.app.Hotel.Reservation.Management.System.entities;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
public class RegisterDto {
    @NotEmpty
    private String firstname;
    @NotEmpty
    private String lastname;
    @NotEmpty
    private String username;
    @NotEmpty
    private String email;

    private String phone;

    private String address;

    @NotEmpty
    @Size(min = 6, message = "Minimum Password lenght is 6 characters")
    private String password;

    public String getFirstName() {
        return firstname;
    }




}
