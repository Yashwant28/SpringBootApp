package com.starter.project.restController;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class BasicRestController {

    String msg = null;

    @GetMapping("/hello")
    public String getMsg() {
        return msg;
    }

    @PostMapping("/hello")
    public String postMsg(@RequestBody String msg) {
        this.msg = msg;
        return "Successfully saved";
    }

    @PutMapping("/hello")
    public String putMsg(@RequestBody String msg) {
        this.msg = msg;
        return "Successfully updated";
    }

    @DeleteMapping("/hello")
    public String deleteMsg() {
        this.msg = null;
        return "Delete Successful";
    }

}
