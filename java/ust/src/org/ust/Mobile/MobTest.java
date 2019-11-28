package org.ust.Mobile;

public class MobTest {

	public static void main(String[] args) {
		ThirdGen tg = new ThirdGen();
		tg.call();
		tg.msg();
		tg.camera();
		tg.playGames();
		tg.playMusic();
		tg.play4k();
		System.out.println("========================================");
		SecondGen sg = new SecondGen();
		sg.camera();
		sg.playMusic();
		System.out.println("========================================");
		FirstGen fg = new FirstGen();
		fg.call();
		fg.msg();
	}

}
