package br.com.beautique.api.entities;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "appointments" )
public class AppointmentsEntity extends BaseEntity {

    @Column(nullable = false, updatable = true )
    private String dateTime;

    @Column(nullable = false)
    private Boolean appointmentsOpen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomerEntity customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "beauty_procedure_id", nullable = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private BeautyProceduresEntity beautyProcedure;


}
