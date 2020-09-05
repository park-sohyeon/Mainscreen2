package com.example.recolap


class Member {
    private var id: Long = 0
    private var PRODUCT_NAME: String? = null
    private var PRICE: String? = null
    private var DISPLAY: String? = null
    private var CPU_NAME: String? = null

    constructor(
        id: Long,
        PRODUCT_NAME: String?,
        PRICE: String?,
        DISPLAY: String?,
        CPU_NAME: String?,
        RESOLUTION: String?,
        RAM: String?,
        STORAGE_SIZE: String?,
        WEIGHT: String?
    ) {
        this.id = id
        this.PRODUCT_NAME = PRODUCT_NAME
        this.PRICE = PRICE
        this.DISPLAY = DISPLAY
        this.CPU_NAME = CPU_NAME
        this.RESOLUTION = RESOLUTION
        this.RAM = RAM
        this.STORAGE_SIZE = STORAGE_SIZE
        this.WEIGHT = WEIGHT
    }

    private var RESOLUTION: String? = null
    private var RAM: String? = null
    private var STORAGE_SIZE: String? = null
    private var WEIGHT: String? = null
}