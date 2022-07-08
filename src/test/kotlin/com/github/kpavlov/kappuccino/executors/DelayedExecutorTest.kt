package com.github.kpavlov.kappuccino.executors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.concurrent.CompletableFuture

class DelayedExecutorTest {

    @Test
    fun `Should execute with a delay`() {

        val delay = 100L
        val subject = DelayedExecutor(delay)

        val startTime = System.currentTimeMillis()

        CompletableFuture.completedStage("OK")
            .thenApplyAsync({
                println(Thread.currentThread())
            }, subject)
            .toCompletableFuture().join()

        val executionTime = System.currentTimeMillis() - startTime

        assertThat(executionTime).isGreaterThanOrEqualTo(delay)
        assertThat(executionTime).isLessThanOrEqualTo(delay + 100)

    }

}
