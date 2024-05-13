package org.example

class ProductDAO {
    fun createProduct(product: Product): Product?{
        val sql = "INSERT INTO PRODUCTS (ID, NAME, PRICE, DESCRIPTION, BRAND, CATEGORY) VALUES (?, ?, ?, ?, ?, ?)"
    }
}