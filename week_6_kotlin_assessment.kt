fun main() {
    println(inLove(3, 11))
}


fun inLove(flowerX: Int, flowerY: Int): Boolean {
    return if (flowerX % 2 == 0 && flowerY % 2 !== 0) {
        true
    } else flowerX % 2 !== 0 && flowerY % 2 == 0
}
