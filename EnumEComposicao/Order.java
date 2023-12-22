package EnumEComposicao;

import java.util.Date;

import EnumEComposicao.enums.OrderStatus;

public class Order {
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	public Order() {
	}

	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
}
