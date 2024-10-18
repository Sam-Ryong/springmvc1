package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class MappingController {

    @GetMapping({"/hello-basic","/hello-fund"})
    public String helloBasic(){
        log.info("helloBasic");
        return "hello";
    }

    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable("userId") String data){
        log.info("mappingPath userId = {}",data);
        return data;
    }

    @GetMapping("/mapping/{userId}/orders/{orderId}")
    public String mappingPathes(@PathVariable("userId") String data, @PathVariable String orderId){
        log.info("mappingPath userId = {}",data);
        log.info("mappingPath orderId = {}",orderId);
        return data;
    }

    @GetMapping(value = "/mapping-param",params = "password=12345")
    public int mappingParam(@RequestParam int password){
        log.info("mappingPath password = {}",password);
        return password;
    }

    @GetMapping(value = "/mapping-header",headers = "password=12345")
    public String mappingHeader(){
        log.info("mappingPath");
        return "ok";
    }

    @GetMapping(value = "/mapping-consume", consumes = "application/json")
    public String mappingConsumes() {
        log.info("mappingConsumes");
        return "ok";
    }
}
