package com.oops;

import java.util.Arrays;

abstract class Notification{
	abstract void send();
}

class Email extends Notification{

	@Override
	void send() {
		System.out.println("Email Nofication sent");
	}
	
	
}

class SMS extends Notification{

	@Override
	void send() {
		System.out.println("SMS Nofication sent");
	}
	
}

class WhatsApp extends Notification{

	@Override
	void send() {
		System.out.println("WhatsApp Nofication sent");
	}
	
}
public class NotificationDriverDemo {

	public static void main(String[] args) {
		Notification[] arr= {new Email(),new SMS(),new WhatsApp()};
		Object[] ar= {new Email(),new SMS(),new WhatsApp()};
		for(Object a:ar) {
			if(a instanceof Notification) {
			((Notification) a).send();
			}
		}
		for(Notification a:arr) {
			a.send();
		}
		System.out.println(Arrays.toString(arr));
	}

}
