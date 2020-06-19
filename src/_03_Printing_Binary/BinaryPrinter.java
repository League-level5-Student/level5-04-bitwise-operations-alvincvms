package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		String s = "";
		do {
			byte q = (byte) (b >>> 1);
			if(b % 2 == 1) {
				s = '1' + s;
			} else {
				s = '0' + s;
			}
			b = q;
		} while(b != 0);
		System.out.println(s);
	}
	
	public void printShortBinary(short s) {
		String s2 = "";
		do {
			short q = (short) (s >>> 1);
			if(s % 2 == 1) {
				s2 = '1' + s2;
			} else {
				s2 = '0' + s2;
			}
			s = q;
		} while(s != 0);
		System.out.println(s2);
	}
	
	public void printIntBinary(int i) {
		String s = "";
		do {
			int q = i >>> 1;
			if(i % 2 == 1) {
				s = '1' + s;
			} else {
				s = '0' + s;
			}
			i = q;
		} while(i != 0);
		System.out.println(s);
	}
	
	public void printLongBinary(long l) {
		String s = "";
		do {
			long q = l >>> 1;
			if(l % 2 == 1) {
				s = '1' + s;
			} else {
				s = '0' + s;
			}
			l = q;
		} while(l != 0);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		new BinaryPrinter().printByteBinary((byte) 12);
		new BinaryPrinter().printShortBinary((short) 0b10111001);
		new BinaryPrinter().printIntBinary(0b111101);
		new BinaryPrinter().printLongBinary(0b1111010000010111011101);
	}
}
