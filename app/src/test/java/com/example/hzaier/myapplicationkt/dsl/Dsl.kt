package com.example.hzaier.myapplicationkt.dsl

import org.junit.Test


interface Matcher<T> {
    fun test(lhs: T)

    infix fun or(other: Matcher<T>): Matcher<T> = object : Matcher<T> {
        override fun test(lhs: T) {
            try {
                this@Matcher.test(lhs)
            } catch (e: RuntimeException) {
                other.test(lhs)
            }
        }
    }


}

infix fun <T> T.should(matcher: Matcher<T>) {
    matcher.test(this)
}

object StartsWithWhiteSpace : Matcher<String> {
    override fun test(lhs: String) {
        if (!lhs.startsWith(" "))
            throw RuntimeException("doesn't start with WhiteSpace")
    }
}

object EndsWithWhiteSpace : Matcher<String> {
    override fun test(lhs: String) {
        if (!lhs.endsWith(" "))
            throw RuntimeException("doesn't ends with WhiteSpace")
    }
}


infix fun <T> Collection<T>.should(fn: CollectionMatcher<T>.() -> Unit) {
    CollectionMatcher(this).fn()
}

class CollectionMatcher<T>(private val collection: Collection<T>) {

    fun contains(rhs: T): CollectionMatcher<T> {
        if (!collection.contains(rhs)) throw RuntimeException("Collection did not contains $rhs")
        return this
    }

    fun notContains(rhs: T): CollectionMatcher<T> {
        if (collection.contains(rhs)) throw RuntimeException("Collection did not contains $rhs")
        return this
    }

    fun haveSizeLessThan(size: Int): CollectionMatcher<T> {
        if (collection.size >= size) throw RuntimeException("Collection should have size $size")
        return this
    }
}

infix fun <T> CollectionMatcher<T>.and(lhs: CollectionMatcher<T>): CollectionMatcher<T> = this

class Test {

    @Test
    fun test() {
        val listOfNames = listOf("A", "C", "B", "D")
        listOfNames should {
            contains("A") and contains("D") and notContains("z") and haveSizeLessThan(5)
        }

        "ssss " should (StartsWithWhiteSpace or EndsWithWhiteSpace)


        //"Z " should object : Matcher<String> {
        //    override fun test(lhs: String) {
        //        print("lhd $lhs")
        //   }
        //}
        print("DONE")
    }
}