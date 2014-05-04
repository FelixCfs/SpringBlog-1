package com.xin.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * User: Xin
 * Date: 14-5-4
 * Time: 下午10:27
 */
@Entity
public class Comments {

    public Comments() {
    }

    public Comments(Long comentId, Long postId, String commentAuthor, String commentAuthorEmail, Date commentDate, String commentContent, Long commentParent, Long userId) {
        this.comentId = comentId;
        this.postId = postId;
        this.commentAuthor = commentAuthor;
        this.commentAuthorEmail = commentAuthorEmail;
        this.commentDate = commentDate;
        this.commentContent = commentContent;
        this.commentParent = commentParent;
        this.userId = userId;
    }

    private Long comentId;

    @javax.persistence.Column(name = "coment_id")
    @Id
    public Long getComentId() {
        return comentId;
    }

    public void setComentId(Long comentId) {
        this.comentId = comentId;
    }

    private Long postId;

    @javax.persistence.Column(name = "post_id")
    @Basic
    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    private String commentAuthor;

    @javax.persistence.Column(name = "comment_author")
    @Basic
    public String getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    private String commentAuthorEmail;

    @javax.persistence.Column(name = "comment_author_email")
    @Basic
    public String getCommentAuthorEmail() {
        return commentAuthorEmail;
    }

    public void setCommentAuthorEmail(String commentAuthorEmail) {
        this.commentAuthorEmail = commentAuthorEmail;
    }

    private Date commentDate;

    @javax.persistence.Column(name = "comment_date")
    @Basic
    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    private String commentContent;

    @javax.persistence.Column(name = "comment_content")
    @Basic
    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    private Long commentParent;

    @javax.persistence.Column(name = "comment_parent")
    @Basic
    public Long getCommentParent() {
        return commentParent;
    }

    public void setCommentParent(Long commentParent) {
        this.commentParent = commentParent;
    }

    private Long userId;

    @javax.persistence.Column(name = "user_id")
    @Basic
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
