package com.xworkz.boot;

import com.xworkz.app.Gate;
import com.xworkz.app.IronGate;

public class GateKiller {

	public static void main(String[] args) {
			System.out.println("invoking main in GateKiller");
			Gate gate = new IronGate();
			gate.open();

		}

	}

