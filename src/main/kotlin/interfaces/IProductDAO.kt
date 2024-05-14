package org.example.interfaces

import org.example.products.Product

interface IProductDAO {
    fun createProduct(product: Product): Product?
    fun getAllProducts(): List<Product>?
    fun getProductById(id: Int): Product?
    fun updateProducts(product: Product): Product?
    fun deleteProduct(id: Int): Boolean
}