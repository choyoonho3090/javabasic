package e_oop;

public class AirCOnditioner {

	public static void main(String[] args) {
		
		AirCOnditioner s = new AirCOnditioner();
		System.out.println(s.temperature);
		s.power();
		s.temperatureUp();
		System.out.println(s.temperature);
		s.temperatureDown();
		s.temperatureDown();
		System.out.println(s.temperature);
		s.airVolume();
		System.out.println(s.airvolume);
		
	}

	//온도가 18~30 도 까지만 변경할 수 있게 해주고,
	//전원을 켰을 때만 버튼들이 작동되도록 매서드를 변경해주세요.
	
	boolean power; //전원
	int temperature; //온도
	int airvolume; //풍량
	
	AirCOnditioner(){
		power = false;
		temperature = 24;
		airvolume = 1;
	}
	
	//전원 버튼
	void power(){
		
		power = !power;
		System.out.println("전원이 켜졌습니다.");
	}
	
	void temperatureUp(){
		if(power){
			if( temperature < 30){	
				temperature++;
			}
		}
	}
	
	void temperatureDown(){
		if(power){
			if(temperature >= 18 ){
				temperature--;	
			}
		}			
	}
	
	//풍량 버튼
	void airVolume(){
		if(power && 3 < ++airvolume){
			airvolume = 1;
		}
	}
	
}
