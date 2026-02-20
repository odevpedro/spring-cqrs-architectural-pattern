package br.com.beautique.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import tools.jackson.core.ObjectReadContext;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "beauty_procedures" )
public class BeautyProceduresEntity extends BaseEntity {

    @Column(nullable = false, length = 100 )
    private String name;

    @Column(length = 100 )
    private String descriptrion;

    @Column(nullable = false)
    private BigDecimal price;
}
