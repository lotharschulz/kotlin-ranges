package ranges

object Ranges {

    @JvmField val A_TO_D = ('a'..'d')
    @JvmField val A_UNTIL_D = ('a' until 'd')
    @JvmField val A_RANGETO_D = ('a'.rangeTo('d'))
    @JvmField val A_DOWNTO_D = ('d'.downTo('a'))


    val dotdotRange: String
        get() {
            return A_TO_D.joinToString(",")
        }
    val untilRange: String
        get() {
            return A_UNTIL_D.joinToString(",")
        }
    val rangeTo: String
        get() {
            return A_RANGETO_D.joinToString(",")
        }
    val downTo: String
        get() {
            return A_DOWNTO_D.joinToString(",")
        }
}

fun main(args: Array<String>) {
    println(Ranges.dotdotRange)
    println(Ranges.untilRange)
    println(Ranges.rangeTo)
    println(Ranges.downTo)
}
