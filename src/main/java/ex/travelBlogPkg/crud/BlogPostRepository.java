package ex.travelBlogPkg.crud;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ex.travelBlogPkg.dbClasses.BlogPost;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

}

