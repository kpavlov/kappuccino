package com.github.kpavlov.kappuccino.tests


inline fun <A, E> verifyObject(actual: A?, expected: E?, verifier: A.(E) -> Unit) {
    if (expected == null) {
        assert(actual == null) { "Should be null: $actual" }
        return
    }
    assert(actual != null) { "Should not be null" }
    verifier.invoke(actual!!, expected)
}