package interfacepkg.zoo;

public class ZooKeeper {
	//FoodInterface를 자료형 처럼 사용. animal은 변수명으로 사용
	//동물 클래스에 favoriteFood라는 문자열을 선언하고 반환값을 
	//각 동물이 좋아하는 먹이로 설정.
	//출력값에 animal.favoriteFood()로 모든 동물들의 반환값들을 출력
	public void feed(FoodInterface animal) {
		System.out.println("feed " + animal.favoriteFood());
	}
//	public void feed(Bear bear) {
//		System.out.println("feed honey");
//	}
//	public void feed(Camel camel) {
//		System.out.println("feed cactus");
//		
//	}
//	public void feed(Deer deer) {
//		System.out.println("feed acorn");
//	}
}
