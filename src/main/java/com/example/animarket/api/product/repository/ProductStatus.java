package com.example.animarket.api.product.repository;


import com.example.animarket.common.enum_interface.MyEnumInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum ProductStatus implements MyEnumInterface {

    READY("준비중"),
    AVAILABLE("판매중"),   // 판매 중
    DISCONTINUED("판매 중단") // 판매 중단
    ;

    private final String value;
}
