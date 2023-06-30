package org.reckful.archive.playeverland.subscription

import io.swagger.v3.oas.annotations.media.Schema

@Schema(name = "EmailSubscription", description = "Email subscriber information")
class EmailSubscriptionDTO(

    @Schema(description = "Email", example = "matt@gmail.com")
    val email: String
)
