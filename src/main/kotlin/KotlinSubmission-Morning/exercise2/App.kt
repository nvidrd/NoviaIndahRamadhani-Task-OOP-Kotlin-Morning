package id.infinitelearning.KotlinSubmission.exercise2

fun main() {
    println("\n=======================================================================================")

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */

    val bilGenap = mutableListOf<Int>()
    for (i in 1..100) {
        if (i % 2 == 0) {
            bilGenap.add(i)
        }
    }

    println("Bilangan Genap dari 1 hingga 100: $bilGenap")
    println("\n=======================================================================================")




    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    // Buat di bawah sini

    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
     */
    val namaBulan: Map<String, String> = mapOf(
        "Jan" to "Januari",
        "Feb" to "Febuari",
        "Mar" to "Maret",
        "Apr" to "April",
        "Mei" to "Mei",
        "Jun" to "Juni",
        "Jul" to "Juli",
        "Agt" to "Agustus",
        "Sep" to "September",
        "Okt" to "Oktober",
        "Nov" to "November",
        "Des" to "Desember"
    )

    namaBulan.forEach { (key, value) ->
        println("$key -> $value")
    }

    /**
    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */

    // Cetak nama bulan sekarang dan bulan lahir
    val monthNow = "Nov"
    val birthMonth = "Nov"
    println("\nIt's ${namaBulan[monthNow]} now, I was born in ${namaBulan[birthMonth]}")


}