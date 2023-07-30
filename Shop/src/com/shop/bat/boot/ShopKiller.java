package com.shop.bat.boot;

import com.shop.bat.app.Shop;

public class ShopKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in ShopKiller");
		Shop shop=new Shop();
		shop.promotProduct();
		shop.onlinePayment();

	}

}
