package com.github.kpavlov.kappuccino.executors

import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class DelayedExecutor(
    private val delayFunction: () -> Long
) : Executor {

    private val executor = Executors.newScheduledThreadPool(1)

    constructor (delay: Long) : this(delayFunction = { delay })

    override fun execute(command: Runnable) {
        executor.schedule(command, delayFunction.invoke(), TimeUnit.MILLISECONDS)
    }
}
