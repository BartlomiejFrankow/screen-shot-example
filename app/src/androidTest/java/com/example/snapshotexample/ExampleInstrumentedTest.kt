package com.example.snapshotexample

import com.karumi.shot.ScreenshotTest
import org.junit.Assert.*
import org.junit.Test

class GreetingScreenshotTest : ScreenshotTest {

    @get:org.junit.Rule
    val composeRule = androidx.compose.ui.test.junit4.createComposeRule()

    @Test
    fun GreetingScreenTest() {
        composeRule.setContent { Greeting("Androidek") }
        compareScreenshot(composeRule)
    }

    @Test
    fun HahaScreenTest() {
        composeRule.setContent { Haha("Bartku") }
        compareScreenshot(composeRule)
    }
}
