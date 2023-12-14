package com.xworkz.tong;

import com.xworkz.app.RoomSafe;

public class RoomLuxury implements RoomSafe {

	@Override
	public int noOfMembers() {
		System.out.println("invoking in noofmembers() in roomluxury");
		return 0;
	}

	@Override
	public int noOfRooms() {
		System.out.println("invoking in noofrooms()");
		return 0;
	}

}
