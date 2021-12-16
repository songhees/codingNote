package kr.co.jhta.el.controller;

import java.util.ArrayList;
import java.util.List;

import com.sample.model2.controller.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ElSampleController2 implements Controller {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<CartItem> firstCart = null;
		List<CartItem> secondCart = new ArrayList<>();
		List<CartItem> thirdCart = new ArrayList<>();
		thirdCart.add(new CartItem(10, "색연필", 2500, 0.01, 10));
		thirdCart.add(new CartItem(20, "오리털 패딩", 550000, 0.05, 1));
		thirdCart.add(new CartItem(30, "런닝화", 210000, 0, 2));
		thirdCart.add(new CartItem(40, "무릎 보호대", 35000, 0.01, 5));
		thirdCart.add(new CartItem(50, "기모바지", 15000, 0.5, 2));
		
		request.setAttribute("cart1", firstCart);
		request.setAttribute("cart2", secondCart);
		request.setAttribute("cart3", thirdCart);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/el/sample2.jsp");
		rd.forward(request, response);
	}
	
	public class CartItem {
		int no;
		String name;
		int price;
		double discountRate;
		int amount;

		public CartItem(int no, String name, int price, double discountRate, int amount) {
			super();
			this.no = no;
			this.name = name;
			this.price = price;
			this.discountRate = discountRate;
			this.amount = amount;
		}

		public int getNo() {
			return no;
		}
		public String getName() {
			return name;
		}
		public int getPrice() {
			return price;
		}
		public double getDiscountRate() {
			return discountRate;
		}
		public int getAmount() {
			return amount;
		}
		
		// 복잡한 사칙연산은 자바에서 getter메소드를 별도로 만들어서 계산한다. ★★★
		// 할인 비율(%단위)
		public double getDiscountPerCent() {
			return getDiscountRate()*100;
		}
		
		// 할인가격
		public int getDiscountPrice() {
			return (int)(price*(1-getDiscountRate()));
		}
		
		// 구매가격
		public int getOrderPrice() {
			return getDiscountPrice()*amount;
		}
	}
	
}
