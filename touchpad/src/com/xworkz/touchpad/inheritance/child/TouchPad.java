package com.xworkz.touchpad.inheritance.child;

import com.xworkz.touchpad.inheritance.parent.Keyboard;

public class TouchPad extends Keyboard {
	public boolean touchmode;
	public boolean screen;
	public boolean smoother;

	public TouchPad(boolean touchmode, boolean screen, boolean smoother) {
		super("", 0, 0.0);
		super.type = type;
		super.noOfKeys = noOfKeys;
		super.price = price;
		this.touchmode = touchmode;
		this.screen = screen;
		this.smoother = smoother;
	}

	public void torisu() {
		System.out.println(this.touchmode);
		System.out.println(this.screen);
		System.out.println(this.smoother);
		System.out.println(super.type);
		System.out.println(super.noOfKeys);
		System.out.println(super.price);

	}

}
