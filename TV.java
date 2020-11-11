
public class TV {
	public int channel;
	public int volume;
	public boolean on;

	public TV() {
		channel = 1;
		volume = 4;
		on = false;
	}
	public void switchOn() {
		on = true;
	}
	public void switchOff() {
		on = false;
	}	
	public void setChannel (int newChannel) {
		if(newChannel > 120 || newChannel < 1 || !on) {
			return;
		}
		channel = newChannel;
	}
	public void channelUp (int newChannel) {
		if(channel == 120 || !on) {
			return;
		}
		channel++;
	}
	public void channelDown (int newChannel) {
		if(channel == 1 || !on) {
			return;
		}
		channel--;
	}
	public void setVolume(int newVolume) {
		if(newVolume > 7 || newVolume < 1 || !on) {
			return;	
		}
		volume = newVolume;
	}
	public void volumeUp() {
		if(volume == 7 || !on) {
			return;	
		}
		volume++;
	}
	public void volumeDown() {
		if(volume == 0 || !on) {
			return;	
		}
		volume--;
	}
	

}
