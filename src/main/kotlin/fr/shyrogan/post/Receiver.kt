package fr.shyrogan.post

import fr.shyrogan.post.receiver.Receiver

/**
 * Generates a simple [Receiver] implementation that runs [handler] when a message
 * is received.
 */
inline fun <reified T: Any> receiver(priority: Int = 0, crossinline handler: (message: T) -> Unit): Receiver<T> = object: Receiver<T> {
    override fun getTopic() = T::class.java
    override fun getPriority() = priority
    override fun onReceive(message: T) = handler(message)
}