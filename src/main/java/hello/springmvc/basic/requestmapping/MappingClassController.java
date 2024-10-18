package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String getUser(){
        return "itworked";
    }

    @PostMapping
    public String addUser(){
        return "";
    }

    @GetMapping("/{userId}")
    public String getAllUsers(){
        return "";
    }

    @PatchMapping("/{userId}")
    public String editUser(){
        return "PatchWorked";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(){
        return "";
    }

}
