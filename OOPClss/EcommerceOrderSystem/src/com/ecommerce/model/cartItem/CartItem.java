package com.ecommerce.model.address;
package com.ecommerce.model.cart;
package com.ecommerce.model.orderItem;
package com.ecommerce.model.product;
package com.ecommerce.model.cartItem;


public class CartItem{
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity){
        this.product=product;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }

}