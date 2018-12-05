package jp.co.sample.ecommerce_a.domain;

import java.util.List;

/**
 * 注文商品を表すエンティティ.
 * 
 * @author yu.terauchi
 *
 */
public class OrderItem {
	/** ID */
	private Integer id;
	/** 商品ID */
	private Integer itemId;
	/** 数量 */
	private Integer quantity;
	/** サイズ */
	private Character size;
	/** 商品 */
	private Item item;
	/** 注文商品リスト */
	private List<OrderTopping> orderToppingList;

	public OrderItem() {
	}

	public OrderItem(Integer id, Integer itemId, Integer quantity, Character size, Item item,
			List<OrderTopping> orderToppingList) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.quantity = quantity;
		this.size = size;
		this.item = item;
		this.orderToppingList = orderToppingList;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", itemId=" + itemId + ", quantity=" + quantity + ", size=" + size + ", item="
				+ item + ", orderToppingList=" + orderToppingList + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Character getSize() {
		return size;
	}

	public void setSize(Character size) {
		this.size = size;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<OrderTopping> getOrderToppingList() {
		return orderToppingList;
	}

	public void setOrderToppingList(List<OrderTopping> orderToppingList) {
		this.orderToppingList = orderToppingList;
	}

	// public int getSubTotal() {
	// int subTotal = size * quantity;
	// return subTotal;
	// }
}
