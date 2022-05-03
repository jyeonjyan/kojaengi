package app.example.kojaengi._04_클래스_객체_인터페이스._싱글턴을_쉽게_만들기

import net.bytebuddy.utility.RandomString

object RedisDataConfig : DataConfig{

    override val dataVendor: String = "Redis"
    override val configSerialNum: String = RandomString.make(5)
    override val priority: Int = 5

}