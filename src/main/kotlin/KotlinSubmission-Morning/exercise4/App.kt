package id.infinitelearning.KotlinSubmission.exercise4

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

fun main() {
    print("\nMasukkan score Anda: ")

    try {
        var score: Int? = null

        while (score == null) {
            val input = readLine()
            score = input?.toIntOrNull()

            if (score == null) {
                println("Masukkan score dalam bentuk angka.")
                print("\nMasukkan score Anda: ")
            }
        }
        println("Score Anda: $score")

    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan: ${e.message}")
    }
}

