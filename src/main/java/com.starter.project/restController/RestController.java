package com.starter.project.restController;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestController {

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
