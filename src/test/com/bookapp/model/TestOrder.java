package test.com.bookapp.model;

import com.bookapp.model.Order;

public class TestOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.setId(100);
		order.setUser_id(1000);
		order.setBook_id(1000);
		order.setQuantity(1);

		System.out.println(order);
	}

}
