package e_oop;

public class Tv {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.power();
		tv.channelselect(3,6);
		tv.volumeUp();
		System.out.println(tv.volume);
		tv.volumeUp();
		System.out.println(tv.volume);
		tv.volumeDown();
		System.out.println(tv.volume);
		tv.channelselect(9,7);
		tv.channelselect(7,7);
	}
	
	//TV를 대상으로 가능한 TV와 비슷하게 TV클래스를 만들어주세요.
	boolean power;
	int channel;
	int volume;
	
	Tv(){
		power= false;
		channel = 1;
		volume = 1;
	}
	
	void power(){
		power =!power;
	
	}
	
	void channelselect(int a, int b){
		if(power){
			System.out.println(a +""+ b);
			}
	}
	
	void volumeUp(){
		if(power){
			if(volume < 40){
				volume++;
			}
		}
	}
	
	void volumeDown(){
		if(power){
			if(volume > 0 && volume < 40){
				volume--;
			}
		}
	}
}
