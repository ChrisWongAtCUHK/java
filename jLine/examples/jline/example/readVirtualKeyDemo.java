/*
 * Copyright (c) 2002-2007, Marc Prud'hommeaux. All rights reserved.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 */
package jline.example;

import jline.*;

import java.io.*;

public class readVirtualKeyDemo {

	public static void main(String[] args) throws IOException {
		ConsoleReader reader = new ConsoleReader();

		System.out.println("Who is handsome?");
		System.out.println("a) Chris Wong");
		System.out.println("b) Amby");
		System.out.println("c) Jimmy");
		System.out.println("d) None of above");
		int in = reader.readVirtualKey();
	   
		switch(in){
			case 65:
			case 97:
				System.out.println("Exactly!");
				break;
				
			case 66:
			case 98:
				System.out.println("Chris Wong is handsome");
				break;
				
			case 67:
			case 99:
				System.out.println("Chris Wong is handsome");
				break;
				
			case 68:
			case 100:
				System.out.println("Chris Wong is handsome");
				break;
				
			default:
				break;
		}
	}
}
