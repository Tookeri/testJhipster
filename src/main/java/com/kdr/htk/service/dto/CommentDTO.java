package com.kdr.htk.service.dto;

public class CommentDTO {

    private Long id;

    private String avis;

    public CommentDTO() {}

    public CommentDTO(Long id, String avis) {
        this.id = id;
        this.avis = avis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAvis() {
        return avis;
    }

    public void setAvis(String avis) {
        this.avis = avis;
    }
}
