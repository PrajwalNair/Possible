package com.xworkz.touchpad.display;

import com.xworkz.touchpad.inheritance.child.TouchPad;
import com.xworkz.touchpad.inheritance.parent.Keyboard;

public class TouchPadDisplay {

	public static void main(String[] args) {
		TouchPad touch = new TouchPad(false, false, false);
		Keyboard keyboard = new TouchPad(false, false, false);
		TouchPad convert = (TouchPad) keyboard;
		convert.noOfKeys = 101;
		convert.price = 705;
		convert.type = "Manual";
		convert.torisu();

	}

}
