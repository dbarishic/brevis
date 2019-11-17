package com.dbarishic.brevis.web.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.view.RedirectView
import javax.servlet.http.HttpServletRequest


@RestController
@RequestMapping("/api/public")
class RootResource {

    //TODO
    @GetMapping("/{urlHash}")
    fun redirectToOriginalUrl(@PathVariable urlHash: String, request: HttpServletRequest): RedirectView {
        val redirectView = RedirectView()
        redirectView.url = "https://old.reddit.com/r/programmingcirclejerk/"
        return redirectView
    }
}