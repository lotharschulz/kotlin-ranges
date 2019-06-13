package ranges

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class RangesTest {
    @Test fun testAppHasAdotdotRange() {
        assertNotNull(Ranges.dotdotRange, "app should have dotdotRange")
    }
    @Test fun testAppHasAUntilRange() {
        assertNotNull(Ranges.untilRange, "app should have untilRange")
    }
    @Test fun testAppdotdotrangeAndUntilRange() {
        assertEquals(Ranges.dotdotRange.slice(0 until Ranges.dotdotRange.length-2), Ranges.untilRange, "dot ranges minus last element equals until ranges")
    }
    @Test fun testDownToIsReversedRangeTo() {
        assertEquals(Ranges.rangeTo.reversed(), Ranges.downTo, "down to is reversed range to")
    }
}
