package tema15;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		setTime(System.currentTimeMillis());
	}
	
	public Time(long milliseconds) {
		setTime(milliseconds);
	}
	
	public Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(long milliseconds){
		long millisecondsToday = milliseconds % (1000l * 60 * 60 * 24);
		this.hour = (int)(millisecondsToday / (1000l * 60 * 60)) + 2;
		this.minute = (int)(millisecondsToday % (1000l * 60 * 60) / (1000 * 60));
		this.second = (int)(millisecondsToday % (1000l * 60 * 60) % (1000 * 60) / 1000);
	}
	public String toString(){
		return "Hour: " + hour + ", minute: " + minute + ", second: " + second;
	}

}