package se.drachbar.springular.controller;

import org.springframework.core.io.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AngularRoutingController {

    @Value("classpath:static/index.html")
    private Resource appIndex;

    @GetMapping("/{page:^(?!^assets|api)(?:[a-z\\d\\-\\/]+)$}")
    public ResponseEntity<Resource> index() {
        return ResponseEntity.ok().body(appIndex);
    }

}