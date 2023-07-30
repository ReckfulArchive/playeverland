package org.reckful.archive.playeverland.controller

import io.swagger.v3.oas.annotations.Hidden
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Hidden
@Controller
class IndexController {

    @GetMapping("/")
    fun index(): String {
        return "redirect:/swagger-ui/index.html"
    }
}
