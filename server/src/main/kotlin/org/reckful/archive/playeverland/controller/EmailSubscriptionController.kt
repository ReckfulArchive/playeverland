package org.reckful.archive.playeverland.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.reckful.archive.playeverland.dto.EmailSubscriptionDTO
import org.reckful.archive.playeverland.service.EmailSubscriptionService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(name = "Subscription", description = "Email subscription requests")
class EmailSubscriptionController(
    private val emailSubscriptionService: EmailSubscriptionService
) {
    @Operation(summary = "Subscribes a person with their email")
    @PostMapping("/subscription/email")
    fun subscribe(emailSubscriptionDTO: EmailSubscriptionDTO) {
        emailSubscriptionService.subscribe(emailSubscriptionDTO.email)
    }
}
