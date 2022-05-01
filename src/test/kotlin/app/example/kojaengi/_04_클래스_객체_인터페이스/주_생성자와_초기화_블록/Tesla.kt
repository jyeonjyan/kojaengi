package app.example.kojaengi._04_클래스_객체_인터페이스.주_생성자와_초기화_블록

class Car constructor(carTypes: String){
    private val carType: String
    init {
        carType = carTypes
    }
}

open class Tesla(val domainName: String)

class Teslam(ownerName: String){
    var name: String = ownerName
}

class TeslaModel3(val carName: String, val isLongRange: Boolean = false) : Tesla("tesla.corp")