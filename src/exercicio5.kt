fun main() {
    print(analisarNUmeros(8,2,6,7))
}

fun analisarNUmeros(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return numA > numC && numA > numD || numB > numC && numB > numD
}