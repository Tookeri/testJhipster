package com.kdr.htk.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * A Voiture.
 */
@Entity
@Table(name = "jhi_voiture")
public class Voiture extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "marque")
    private String marque;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_sortie")
    private Date dateSortie;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "voiture_id", referencedColumnName = "id")
    private List<Comment> comments;
}
