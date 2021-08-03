public class Sol01 {
	public long solution(int price, int money, int count) {
        
        return Math.max(price * (count * (long)(count + 1)) / 2 - money, 0);
    }
}
