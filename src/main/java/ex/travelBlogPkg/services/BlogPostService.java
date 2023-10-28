package ex.travelBlogPkg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ex.travelBlogPkg.crud.BlogPostRepository;
import ex.travelBlogPkg.dbClasses.BlogPost;

import java.util.List;

@Service
public class BlogPostService {

    private final BlogPostRepository blogPostRepository;

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    public BlogPost getBlogPostById(Long postId) {
        return blogPostRepository.findById(postId).orElse(null);
    }

    public BlogPost createBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    public BlogPost updateBlogPost(Long postId, BlogPost updatedBlogPost) {
        if (blogPostRepository.existsById(postId)) {
            updatedBlogPost.setPostId(postId);
            return blogPostRepository.save(updatedBlogPost);
        }
        return null;
    }

    public void deleteBlogPost(Long postId) {
        blogPostRepository.deleteById(postId);
    }
}
