package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    val hero = Hero()


    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    hero.setProfile("Mitha Umairah", 20, 153)


    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
    hero.profile()



    /**
    Challenge:
    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */
    val group1 = listOf(
        "jalan", "jalan", "jalan", "jalan", "jalan",
        "lari", "lari",
        "makan", "makan", "makan",
        "minum",
        "lompat", "lompat", "lompat",
        "duduk"
    )
    val group2 = listOf(
        "jalan", "jalan",
        "lari", "lari",
        "makan",
        "minum", "minum", "minum",
        "lompat",
        "duduk", "duduk"
    )
    val group3 = listOf(
        "jalan", "jalan", "jalan",
        "lari",
        "makan", "makan", "makan", "makan", "makan",
        "minum",
        "lompat", "lompat", "lompat", "lompat", "lompat",
        "duduk", "duduk", "duduk"
    )
    val group4 = listOf(
        "jalan", "jalan", "jalan", "jalan", "jalan",
        "lari", "lari", "lari", "lari",
        "makan", "makan", "makan", "makan",
        "minum", "minum", "minum", "minum",
        "lompat", "lompat", "lompat",
        "duduk", "duduk"
    )
    val group5 = listOf(
        "jalan", "jalan", "jalan", "jalan",
        "lari",
        "makan", "makan", "makan",
        "minum", "minum", "minum", "minum", "minum",
        "lompat", "lompat", "lompat", "lompat", "lompat",
        "duduk", "duduk", "duduk"
    )
    val group6 = listOf(
        "jalan", "jalan",
        "lari", "lari", "lari", "lari",
        "makan", "makan",
        "minum", "minum",
        "lompat", "lompat", "lompat", "lompat", "lompat", "lompat", "lompat",
        "duduk", "duduk", "duduk", "duduk"
    )

    val activities = listOf(group1, group2, group3, group4, group5, group6)

    for ((i, group) in activities.withIndex()) {
        println("Group ${i + 1} activities:")
        for (activity in group) {
            println("- $activity")
        }
    }




    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    hero.profile()


}