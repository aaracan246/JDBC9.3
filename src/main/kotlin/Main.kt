package org.example

import org.example.products.Product
import org.example.products.ProductDAO

fun main() {

    val product = Product(1, "Smartphone", 999.99f, "The latest smartphone model", "Apple", "Electronics")

    val productId = ProductDAO().createProduct(product)

    println("Product ID: $productId")

}