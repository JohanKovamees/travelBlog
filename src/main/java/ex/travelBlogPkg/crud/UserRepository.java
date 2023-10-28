package ex.travelBlogPkg.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import ex.travelBlogPkg.dbClasses.BlogUser;

public interface UserRepository extends JpaRepository<BlogUser, Long> {

}
