import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class travelBlogController {

    @GetMapping("/index")
    public String frontPage() {
        return "Hello, World!";
    }
}