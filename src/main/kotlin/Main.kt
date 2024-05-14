package org.example

import org.example.inputOutput.Console
import org.example.products.Product
import org.example.products.ProductDAO

fun main() {

    val console = Console()

    val product = Product(1, "Smartphone", 999.99f, "The latest smartphone model", "Apple", "Electronics")

    val productId = ProductDAO(console).createProduct(product)

    console.writer("Product ID: $productId")

}