package com.kdr.htk.service.dto;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class VehiculeDTO {

    private Long id;

    private String nom;

    private String marque;

    private Date dateSortie;

    private List<CommentDTO> commentDTOList = new LinkedList<>();

    public VehiculeDTO() {}

    public VehiculeDTO(Long id, String nom, String marque, Date dateSortie, List<CommentDTO> commentDTOList) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.dateSortie = dateSortie;
        this.commentDTOList = commentDTOList;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public List<CommentDTO> getCommentDTOList() {
        return commentDTOList;
    }

    public void setCommentDTOList(List<CommentDTO> commentDTOList) {
        this.commentDTOList = commentDTOList;
    }
}
