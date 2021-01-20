package fr.shyrogan.post

import fr.shyrogan.post.receiver.annotation.Subscribe
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach

class KotlinReceiverTest {

    private val eventBus = EventBus()
    private val dummy = DummyKotlinReceiver()

    @BeforeEach
    fun register() {
        eventBus.subscribe(dummy)
    }

    @Test
    fun dispatch() {
        eventBus.dispatch("a")
        assertTrue(dummy.hasReceivedMethod)
        assertTrue(dummy.hasReceivedKotlin)
    }

    class DummyKotlinReceiver {
        var hasReceivedKotlin = false
        var hasReceivedMethod = false

        @Subscribe
        val receiver = receiver<String> {
            hasReceivedKotlin = true
        }

        @Subscribe
        fun onReceive(message: String) {
            hasReceivedMethod = true
        }
    }

}