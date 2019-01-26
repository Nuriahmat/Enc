package com.yah;

public class Test {
	public static void main(String[] args){
		String moji = "seven;one;tow;there;five";
		String[] mojiArray = moji.split(";");
		for(int i=0;i<mojiArray.length;i++){
			String line=mojiArray[i];
		  switch (line) {
	        case "zero":
	            System.out.print("0");
	            break;
	        case "one":
	            System.out.print("1");
	            break;
	        case "tow":
	            System.out.print("2");
	            break;
	        case "there":
	            System.out.print("3");
	            break;
	        case "for":
	            System.out.print("4");
	            break;
	        case "five":
	            System.out.print("5");
	            break;
	        case "sex":
	            System.out.print("6");
	            break;
	        case "seven":
	            System.out.print("7");
	            break;
	        case "eight":
	            System.out.print("8");
	            break;
	        case "nine":
	            System.out.print("9");
	            break;
	        default:
	            System.out.println("¥¨¥é©`");
	        }
		
			
		}
	}

}
