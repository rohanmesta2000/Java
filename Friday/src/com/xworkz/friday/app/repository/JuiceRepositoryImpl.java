package com.xworkz.friday.app.repository;

public class JuiceRepositoryImpl implements JuiceRepository {
	private String[] jucies = new String[TOTAL_JUICES];
	private int position;

	@Override
	public void save(String juice) {
		System.out.println("juice is too tasty ");
		if (this.position < TOTAL_JUICES) {
			this.jucies[position] = juice;
			System.out.println("Item added" + juice + "at position" + this.position);
			this.position++;

		} else {
			System.err.println("juice taste is  not good");
		}
	}
	@Override
	public boolean isExist(String juice) {
		for(int start=0;start<=this.position;start++) {
			String temp =this.jucies[start];
			if(temp!=null && temp.equals(juice)) {
				System.err.println("juicename already exist");
				return true;
			}
		}
		return false;
	}

}
