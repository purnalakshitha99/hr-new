package lk.purna.restapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/Student1")
    public void CreateStudent(){
        System.out.println("Created Student");
    }
}
