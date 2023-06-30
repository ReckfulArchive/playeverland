package org.reckful.archive.playeverland.news

import org.springframework.stereotype.Repository
import java.time.LocalDate
import java.time.Month

private val hardcodedNews = News(
    articles = listOf(
        Article(
            id = "outfits-clothing",
            title = "Your Digital Fit",
            date = LocalDate.of(2020, Month.MAY, 16),
            author = "RazorOS",
            imageUrl = "TODO",
            description = """
                In a social game such as Everland, we recognized very early that giving people 
                an opportunity to express themselves visually was going to be very important. 
                One of the simplest ways people do this in the real world is with their clothing.
            """.trimIndent(),
            fullText = """
                In a social game such as Everland, we recognized very early that giving people 
                an opportunity to express themselves visually was going to be very important. 
                One of the simplest ways people do this in the real world is with their clothing.
            """.trimIndent(),
        ),
        Article(
            id = "an-everland-birthday",
            title = "An Everland Birthday",
            date = LocalDate.of(2020, Month.MAY, 9),
            author = "RazorOS",
            imageUrl = "TODO",
            description = """
                As the stress test draws closer, we’ve been doing internal testing on Everland. 
                We see progress with our builds every week as new features are introduced.
            """.trimIndent(),
            fullText = """
                As the stress test draws closer, we’ve been doing internal testing on Everland. 
                We see progress with our builds every week as new features are introduced.
            """.trimIndent(),
        ),
        Article(
            id = "just-beginning-everland",
            title = "Just the Beginning",
            date = LocalDate.of(2020, Month.APRIL, 1),
            author = "RazorOS",
            imageUrl = "TODO",
            description = "As we kick off our new website, we wanted to welcome you to our developer blog.",
            fullText = """
                As we kick off our new website, we wanted to welcome you to our developer blog. 
                Here, you will find information about the game’s development, design choices, 
                and interviews with members of the Everland team leading up to launch and beyond. 
                This will be your primary source for sneak peeks into the features and systems that 
                will be a part of Everland.
            """.trimIndent()
        )
    )
)

@Repository
class InMemoryNewsRepository : NewsRepository {
    override fun getAll(): News {
        return hardcodedNews
    }
}
