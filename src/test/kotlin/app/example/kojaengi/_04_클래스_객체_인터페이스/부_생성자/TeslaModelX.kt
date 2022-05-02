package app.example.kojaengi._04_클래스_객체_인터페이스.부_생성자

/**
 * 주 생성자 그리고 부 생성자
 */
class TeslaModelX() {

    constructor(_drivingMethod: String, _sheets: Int, _fullSelfDriving: Boolean) : this() {
        val drivingMethod: String = _drivingMethod
        val sheets: Int = _sheets
    }

}