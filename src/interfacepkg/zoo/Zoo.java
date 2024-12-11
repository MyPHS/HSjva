package interfacepkg.zoo;

public class Zoo {
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		zooKeeper.feed(new Bear());
		zooKeeper.feed(new Camel());
		zooKeeper.feed(new Deer());
	}
}
