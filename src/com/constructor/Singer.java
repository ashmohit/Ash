package com.constructor;

public class Singer {
	
	public Singer() {
		System.out.println("Default constructor");
		}
	
	public Singer(String SingerName, String Song) {
		
		System.out.println("SingerName:"+" "+SingerName);
		System.out.println("Song:" + " " + Song);
	}
	
	public Singer(String Voice, int thalamcount) {
		
	 System.out.println("Voice:" + " " + Voice +  " thalamcount: "+ " " + thalamcount);
		
	}
	
	public Singer(String instrument, String platform, double SongDuration) {
		
		System.out.println(instrument + " "  +  platform +  "  "  +  SongDuration);
		
	}
	public static void main(String[] args) {
		Singer obj1 = new Singer();
		Singer obj2 = new Singer("Santhosh", "Thooriga");
		Singer obj3 = new Singer("Fabulours", 1234);
		Singer obj4 = new Singer("guiter and veena ",  " Youtube ", 3.51);
				
	}

	
}
