package com.mitocode.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SignDTO {
    @EqualsAndHashCode.Include
    private Integer idSign;
    @NotNull
    private LocalDateTime date;
    @NotNull
    //@Size(min = 2, message = "{temperature.size}")
    //@Pattern(regexp = "[+-]?([0-9]*[.])?[0-9]+")
    private String temperature;
    //@Pattern(regexp = "[+-]?([0-9]*)?[0-9]+")
    @NotNull
    private String pulse;
    @NotNull
    private String respiratoryRate;
    @NotNull
    private PatientDTO patient;

}
