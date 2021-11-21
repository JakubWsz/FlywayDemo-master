package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CustomerProductKey implements Serializable {

    @Column(name = "customer_id")
    Long customerId;

    @Column(name = "product_id")
    Long productId;

  public CustomerProductKey(Long customerId, Long productId) {
    this.customerId = customerId;
    this.productId = productId;
  }

  public CustomerProductKey() {}

  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerProductKey that = (CustomerProductKey) o;
    return customerId.equals(that.customerId) && productId.equals(that.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, productId);
  }
}
