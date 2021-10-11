package com.kdr.htk.web.rest.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.kdr.htk.domain.Comment;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "voitureId", "comments" })
public class UserCommentRequest {

    @JsonProperty("voitureId")
    private long voitureId;

    @JsonProperty("comments")
    private List<Comment> comments = null;

    @JsonProperty("voitureId")
    public long getVoitureId() {
        return voitureId;
    }

    @JsonProperty("voitureId")
    public void setVoitureId(int voitureId) {
        this.voitureId = voitureId;
    }

    @JsonProperty("comments")
    public List<Comment> getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
