package interfacepkg.musician;

public class Drum implements Instrument{

	@Override
	public void play() {
		System.out.println("신나는 드럼 소리!");
	}

}