package com.brainstorm.order.dto;

import java.util.List;

public class OrderDTO {
    private Long orderId;
    private OrderStatus orderStatus;
    private Long customerId;
    private List<OrderEntryDTO> orderEntriesDTO;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }


    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrderEntryDTO> getOrderEntriesDTO() {
        return orderEntriesDTO;
    }

    public void setOrderEntriesDTO(List<OrderEntryDTO> orderEntriesDTO) {
        this.orderEntriesDTO = orderEntriesDTO;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
