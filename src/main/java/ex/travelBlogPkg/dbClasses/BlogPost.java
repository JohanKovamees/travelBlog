package ex.travelBlogPkg.dbClasses;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "blog_post")
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "picture_url")
    private String pictureUrl;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private BlogCategory category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private BlogUser user;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public BlogCategory getCategory() {
        return category;
    }

    public void setCategory(BlogCategory category) {
        this.category = category;
    }

    public BlogUser getUser() {
        return user;
    }

    public void setUser(BlogUser user) {
        this.user = user;
    }
}
