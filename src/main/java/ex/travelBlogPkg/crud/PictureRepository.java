package ex.travelBlogPkg.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import ex.travelBlogPkg.dbClasses.Picture;
public interface PictureRepository extends JpaRepository<Picture, Long> {

}
