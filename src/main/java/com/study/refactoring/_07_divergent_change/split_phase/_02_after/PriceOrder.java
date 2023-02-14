package com.study.refactoring._07_divergent_change.split_phase._02_after;

public class PriceOrder {
    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        ProductData productData = calculatePriceData(product, quantity);
        return applyShipping(productData, shippingMethod);
    }

    private static ProductData calculatePriceData(Product product, int quantity) {
        final double basePrice = product.basePrice() * quantity;
        final double discount = Math.max(quantity - product.discountThreshold(), 0)
                * product.basePrice() * product.discountRate();
        return new ProductData(basePrice, discount, quantity);
    }

    private double applyShipping(ProductData productData, ShippingMethod shippingMethod) {
        final double shippingPerCase = (productData.basePrice() > shippingMethod.discountThreshold()) ?
                shippingMethod.discountedFee() : shippingMethod.feePerCase();
        final double shippingCost = productData.quantity() * shippingPerCase;
        return productData.basePrice() - productData.discount() + shippingCost;
    }
}
