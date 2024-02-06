package com.ecommerce.shoppy.enums;

public enum OrderStatus {
    AWAITING_PAYMENT(1),
    PAYD(2),
    PICKING(3),
    SENT(4),
    CANCELLED(5);

    private int code;
    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for(OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid code.");
    }

}