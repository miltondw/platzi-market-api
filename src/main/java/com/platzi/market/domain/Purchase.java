package com.platzi.market.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {
    @Getter @Setter
    private int purchaseId;
    @Getter @Setter
    private String clientId;
    @Getter @Setter
    private LocalDateTime date;
    @Getter @Setter
    private String paymentMethod;
    @Getter @Setter
    private String comment;
    @Getter @Setter
    private String state;
    @Getter @Setter
    private List<PurchaseItem> items;

}
