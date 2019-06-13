package ranges

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class AppTest {
    @Test fun testAppHasAdotdotRange() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.dotdotRange, "app should have dotdotRange")
    }
    @Test fun testAppHasAUntilRange() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.untilRange, "app should have untilRange")
    }
    @Test fun testAppdotdotrangeAndUntilRange() {
        val classUnderTest = App()
        assertEquals(classUnderTest.dotdotRange.slice(0 until classUnderTest.dotdotRange.length-2), classUnderTest.untilRange, "dot ranges minus last element equals until ranges")
    }
    @Test fun testDownToIsReversedRangeTo() {
        val classUnderTest = App()
        assertEquals(classUnderTest.rangeTo.reversed(), classUnderTest.downTo, "down to is reversed range to")
    }
}
