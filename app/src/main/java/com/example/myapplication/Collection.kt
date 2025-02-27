fun ContohList(){
    println("=== list ===")
    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam list mutable
    println(shape)

    //Menghapus data dari List Mutable
    shape.remove("Triangle")
    println(shape)

    //Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

// Set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan ahnya mnyimpan data unik (tidak ada duplikasi)
// Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Set read only menggunakan setOf
// Set mutable menggunakan mutableSetOf


fun ContohSet() {
    println()
    println("=== Set ===")

    //Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //set mutable\
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square" , "Triangle")
    println(shape)

    //Menambahkan data dalam set mutable
    shape.add("Rectangle")
    println(shape)

    //menghapus data dari set mutable
    shape.remove("Circle")
    println(shape)

    //Set read-only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

//Map adalah kumpulan data yang disusun dalam pasangan key-value
//Map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
//Map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
//Map read only menggunakan MapOf
//Map mutable menggunakan mutableMapOf

fun ContohMap(){
    println()
    println("=== Map ===")
    //Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //Map Mutable
    val shape:MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    //Menambahkan data ke dalam Map Mutable
    shape["Rectangle"] = 4
    println(shape)

    //Menghapus data dari Map Mutable
    shape.remove("Circle")
    println(shape)

    //Mengubah data di dalam Map mutable
    shape["Square"] = 5
    println(shape)

    //Map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)

    fun main(){
        ContohList()
        ContohSet()
        ContohMap()
    }
}