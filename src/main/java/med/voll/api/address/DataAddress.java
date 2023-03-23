package med.voll.api.address;

import jakarta.validation.constraints.NotBlank;

public record DataAddress(
        @NotBlank
        String country,
        @NotBlank
        String state,
        @NotBlank
        String city,
        @NotBlank
//        @Pattern(regexp = "\\d{8}")
        String postalCode,
        @NotBlank
        String district,
        @NotBlank
        String street,
        String number
) {}
