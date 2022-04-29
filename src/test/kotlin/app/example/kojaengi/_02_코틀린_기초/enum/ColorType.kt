package app.example.kojaengi._02_코틀린_기초.enum

enum class ColorType (val code: String, val colorName: String){
    ORANGE("#F1024", "orange"),
    BROKEN_GREEN("102345", "brokenGreen")
    ;

    fun sayYourColor() = "color: $colorName ⚡️ ${
        if (code[0] == '#') "status good" 
        else "plz check status"}"
}