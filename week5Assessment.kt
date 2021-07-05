fun main() {
    println(removeVowels("Charles Akarekor,seat no 28"))
}




fun removeVowels(s: String): String {
    val removeVowel = StringBuilder()
    for (z in s) {
        if (z != 'A' && z != 'a'
            && z != 'E' && z != 'e'
            && z != 'I' && z != 'i'
            && z != 'O' && z != 'o'
            && z != 'U' && z != 'u') {
            removeVowel.append(z)
        }
    }
    return removeVowel.toString()
}

