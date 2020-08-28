package com.example.recolap

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor


@Data
@NoArgsConstructor
@AllArgsConstructor
class Member {
    private var id: Long = 0
    private var PRODUCT_NAME: String? = null
    private var PRICE: String? = null
    private var DISPLAY: String? = null
    private var CPU_NAME: String? = null
    private var RESOLUTION: String? = null
    private var RAM: String? = null
    private var STORAGE_SIZE: String? = null
    private var WEIGHT: String? = null
}